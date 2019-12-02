package properties.file;

import java.io.IOException;

public interface FileIo {

    void readFromFile(String filepath) throws IOException;

    void writeToFile(String filepath) throws IOException;

    void setValue(String key, String value);

    String getValue(String key);

}
