package streams.dto;

/**
 * Created by Arrepticius on 03.02.2017.
 */
public class PathInfoDTO {
    private final int number;
    private final int counter;
    private final String path;

    public PathInfoDTO(int number, int counter, String path) {
        this.number = number;
        this.counter = counter;
        this.path = path;
    }

    public int getNumber() {
        return number;
    }

    public int getCounter() {
        return counter;
    }

    public String getPath() {
        return path;
    }
}
