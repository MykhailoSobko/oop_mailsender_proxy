package proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        RealImage realImage = new RealImage("kill.me");
        realImage.display();

        ProxyImage proxyImage = new ProxyImage(realImage, "hang.me");
        proxyImage.display();

        System.out.println("End of me.");
    }
}