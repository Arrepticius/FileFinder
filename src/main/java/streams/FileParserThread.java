package streams;

import streams.Utils.FileUtils;
import streams.db.MemDB;
import streams.dto.PathInfoDTO;

import java.io.File;

/**
 * Created by Arrepticius on 04.02.2017.
 */
public class FileParserThread implements Runnable{

    private final int number;
    private final String path;


    public FileParserThread(int number, String path) {
        this.number = number;
        this.path = path;
    }

    public void run() {
        FileParser fileParser = new FileParser();
        int counter = fileParser.findFile(new File(path.trim()));
        MemDB.filesInfo.add(new PathInfoDTO(number,counter,path));
    }
}
