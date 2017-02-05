package streams.db;

import streams.dto.PathInfoDTO;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by Arrepticius on 03.02.2017.
 */
public class MemDB {
    public static final ConcurrentLinkedQueue<PathInfoDTO> filesInfo = new ConcurrentLinkedQueue<PathInfoDTO>();

}
