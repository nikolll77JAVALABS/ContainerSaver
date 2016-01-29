package nikolll77.com;

import java.io.*;

@ASaveTo(path="e:\\container.txt")
public class Container {
    public String text="Content of string";
    @ASaver
    public void save(String filePath) throws IOException {
        FileWriter fw=new FileWriter(filePath);
        fw.write(text);
        fw.close();
    }
}
