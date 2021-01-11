package pl.patryk.drive;
import pl.patryk.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
