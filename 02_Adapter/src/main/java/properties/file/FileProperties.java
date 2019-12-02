package properties.file;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class FileProperties extends Properties implements FileIo {

    @Override
    public void readFromFile(String filepath) throws IOException {
        defaults.load(new InputStreamReader(new FileInputStream(filepath), StandardCharsets.UTF_8));
    }

    @Override
    public void writeToFile(String filepath) throws IOException {
        defaults.store(new OutputStreamWriter(new FileOutputStream(filepath), StandardCharsets.UTF_8), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        defaults.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return (String) defaults.get(key);
    }
}
