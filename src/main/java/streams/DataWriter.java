package streams;
import streams.Utils.CSVUtils;
import streams.Utils.FileUtils;
import streams.db.MemDB;
import streams.dto.PathInfoDTO;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.io.Writer;
import java.util.List;

/**
 * Created by Arrepticius on 04.02.2017.
 */
public class DataWriter {
    private static FileWriter writer;
    private static FileUtils fileUtils = new FileUtils();
    private static MemDB m = new MemDB();

    public static List<String> getfileToStr() {
        List<PathInfoDTO> pf = null;
        for (PathInfoDTO p : m.filesInfo) {
            pf.add(p);
        }
        List<String> fileToString = null;
        for (PathInfoDTO s : pf) {
            fileToString.add(String.valueOf(s.getCounter()));
            fileToString.add(String.valueOf(s.getNumber()));
            fileToString.add(s.getPath());
        }
        return fileToString;
    }
    public static void writeInDB(){

    }

    public static FileWriter dataWriter(String path) throws IOException {

        String csvFile = fileUtils.getFilePref() + path;
        writer = new FileWriter(csvFile);
        return writer;
    }

    public static void saveData(FileWriter fileWriter, List<String> dataList) throws IOException {
        try {
            CSVUtils.writeLine(fileWriter,dataList);
        } catch (IOException e) {
            e.printStackTrace();
        }


        writer.flush();
        writer.close();
    }

        }



