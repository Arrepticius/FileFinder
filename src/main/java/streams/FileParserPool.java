package streams;


import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Arrepticius on 04.02.2017.
 */
public class FileParserPool {
    private final ThreadPoolExecutor threadPool = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),Runtime.getRuntime().availableProcessors()*4,60, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());

    public void createPool(String paths){

        String[] filesPath = paths.split(",");
        int i = 0;
        for (String path : filesPath){
            FileParserThread fileParserThread = new FileParserThread(i++,path);
            threadPool.execute(fileParserThread);
        }
    }

    public int getActiveTread(){
        return threadPool.getActiveCount();
    }
}
