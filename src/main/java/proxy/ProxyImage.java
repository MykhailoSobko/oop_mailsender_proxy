package proxy;

import lombok.Getter;

@Getter
public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(RealImage realImage, String filename) {
        this.realImage = realImage;
        this.filename = filename;
        this.realImage.setFilename(this.filename);
    }

    @Override
    public void display() {
        this.realImage.display();
    }
}