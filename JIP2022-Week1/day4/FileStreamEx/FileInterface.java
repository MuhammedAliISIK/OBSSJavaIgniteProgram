package day4.FileStreamEx;

import java.io.IOException;

public interface FileInterface {
    void dataInput(String data, String path) throws IOException;
    void dataOutput(String pathName);
}
