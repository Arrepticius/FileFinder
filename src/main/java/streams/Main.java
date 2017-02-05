package streams;


import streams.Utils.FileUtils;
import streams.db.MemDB;
import streams.dto.PathInfoDTO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static streams.db.MemDB.filesInfo;


/**
 * Created by Arrepticius on 01.02.2017.
 */

public class Main {



    private final static FileUtils fileUtils = new FileUtils();


    public static void main(String[] args) throws IOException {
        FileParserPool fpl = new FileParserPool();



        String filePath = fileUtils.readFile("input.txt");
        FileParserPool fileParserPool = new FileParserPool();
        fileParserPool.createPool(filePath);

        while (fpl.getActiveTread() != 0) {
        }
        DataWriter dataWriter = new DataWriter();

        dataWriter.saveData(dataWriter.dataWriter("Data.csv"),dataWriter.getfileToStr() );
    }
}
