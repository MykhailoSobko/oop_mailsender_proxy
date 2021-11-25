package proxy;

import lombok.Getter;

@Getter
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Displaying the real image...");
    }

    public boolean loadFromDisk() {
        System.out.println("Loading image by the path " + this.fileName);
        return true;
    }

    public void setFilename(String filename) {
        this.fileName = filename;
    }
}