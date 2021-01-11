package pl.patryk.drive;
import pl.patryk.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
