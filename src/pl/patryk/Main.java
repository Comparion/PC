package pl.patryk;

import pl.patryk.drive.HDDDrive;
import pl.patryk.usbdevice.MemoryStick;
import pl.patryk.usbdevice.Mouse;

public class Main {

    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        HDDDrive drive = new HDDDrive();

        Computer computer = new Computer(monitor, drive);

//        drive.addFile(new File("jnsp.jpg"));
//        drive.listFiles();
        MemoryStick memoryStick = new MemoryStick("Pendrive");
        Mouse mouse = new Mouse("Mysz");

        computer.addUSBDevice(memoryStick);
        computer.addUSBDevice(mouse);

        memoryStick.eject();

        computer.removeUSBDevices(memoryStick);
        computer.removeUSBDevices(mouse);

    }
}
