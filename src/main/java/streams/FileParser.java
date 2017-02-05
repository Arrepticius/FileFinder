package streams;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arrepticius on 01.02.2017.
 */
public class FileParser {


    public static int findFile(File file) {
        int fileCount = 0;
        File[] files = file.listFiles();
        for (File infile : files) {
            if (infile.isDirectory()) {
                fileCount += findFile(infile);
            } else {
                fileCount++;
            }
        }
        return fileCount;
    }

    public static int fileFinder(String path) {
        File[] file = new File(path).listFiles();
        int count = 0;

        for (File f : file) {
            if (f.isFile()) {
                count++;
            }
            if (f.isDirectory()) {
                for (File f1 : f.listFiles()) {
                    if (f1.isFile()) {
                        count++;
                    }
                }

            }
        }
        return count;
    }
}
