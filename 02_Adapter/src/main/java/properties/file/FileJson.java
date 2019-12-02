package properties.file;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class FileJson implements FileIo {

    private HashMap<String, String> data;

    public FileJson(HashMap<String, String> data) {
        this.data = data;
    }

    public FileJson() {
        this.data = new HashMap<>();
    }

    @Override
    public void readFromFile(String filepath) throws IOException {
        InputStreamReader streamReader = new InputStreamReader(new FileInputStream(filepath), StandardCharsets.UTF_8);
        data = new Gson().fromJson(streamReader, new TypeToken<HashMap<String, String>>() {
        }.getType());
        streamReader.close();
    }

    @Override
    public void writeToFile(String filepath) throws IOException {
        OutputStreamWriter streamWriter = new OutputStreamWriter(new FileOutputStream(filepath), StandardCharsets.UTF_8);
        streamWriter.write(new Gson().toJson(data));
        streamWriter.close();
    }

    @Override
    public void setValue(String key, String value) {
        data.put(key, value);
    }

    @Override
    public String getValue(String key) {
        return data.get(key);
    }
}
