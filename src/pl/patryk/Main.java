package pl.patryk;

import pl.patryk.drive.HDDDrive;
import pl.patryk.drive.SSDDrive;
import pl.patryk.file.imagefile.GIFImageFile;
import pl.patryk.file.imagefile.JPGImageFile;
import pl.patryk.file.musicfile.MP3MusicFile;
import pl.patryk.usbdevice.MemoryStick;
import pl.patryk.usbdevice.Mouse;

public class Main {

    public static void main(String[] args) {
        GIFImageFile gif1 = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa.jpg", 200, 80);

        MP3MusicFile mp3file = new MP3MusicFile("plik.mp3", 4000, "Marilyn Manson", "Broken Needle", 100);

        SSDDrive drive = new SSDDrive();
        drive.addFile(gif1);
    }
}
