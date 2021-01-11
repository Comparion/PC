package pl.patryk.Drive;
import pl.patryk.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
