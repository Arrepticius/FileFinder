package streams;


import streams.Utils.FileUtils;

import java.io.IOException;


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
