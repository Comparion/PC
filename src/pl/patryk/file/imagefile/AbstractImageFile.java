package pl.patryk.file.imagefile;

import pl.patryk.file.AbstractFile;
import pl.patryk.file.File;
import pl.patryk.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {


    protected AbstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
