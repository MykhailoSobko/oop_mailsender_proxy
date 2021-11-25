package mail_sender;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    @SneakyThrows
    public String generateText() {
        try {
            return Files.readString(Paths.get(this.filename));
        }
        catch (java.io.IOException exception) {
            System.out.println("File not found!");
        }
        return "";
    }
}
