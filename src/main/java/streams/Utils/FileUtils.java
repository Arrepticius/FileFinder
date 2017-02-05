package streams.Utils;

import java.io.*;




/**
 * Created by Arrepticius on 01.02.2017.
 */
public class FileUtils {

    public static String getFilePref() {
        return filePref;
    }

    private final static String filePref = "dataFiles/";

    public static void createFile(String name, String info){
        File file = new File(filePref+name);
        try {
            if (!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try{out.print(info);
        }finally {
                out.close();
            }
            }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static String readFile(String file) throws FileNotFoundException{
        StringBuilder sb = new StringBuilder();
        exists(filePref+file);
        try {
            BufferedReader in = new BufferedReader(new FileReader(filePref+file));
            try {
                String s;

            while ((s = in.readLine())!= null){
                sb.append(s);
            }
        }finally {
                in.close();
            }
            }catch (IOException e){
            throw new RuntimeException(e);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }


    private static void exists(String file) throws FileNotFoundException{
        File f = new File(file);
        if (!f.exists()){
            throw new FileNotFoundException(f.getName());
        }
    }
    public static void updateFile(String name, String newText) throws FileNotFoundException{
        exists(filePref+name);
        StringBuilder sb = new StringBuilder();
        String oldFile = readFile(name);
        sb.append(oldFile);
        sb.append(newText);
        createFile(name,sb.toString());
    }
     public static void deleteFile(String name) throws FileNotFoundException{
        exists(name);
        new File(name).delete();
     }

}
