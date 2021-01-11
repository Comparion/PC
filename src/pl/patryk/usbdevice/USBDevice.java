package pl.patryk.usbdevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();
}
