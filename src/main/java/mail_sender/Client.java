package mail_sender;

import lombok.Getter;

import java.util.LinkedList;

@Getter
public class Client {
    @Template(key="%AGE%")
    private int age;
    private String name;
    private Gender sex;
    private int id;
    private String email;

    public Client() {
        id = ClientIDGenerator.generateID();
        LinkedList<Integer> arr = new LinkedList<>();
    }

    private static class ClientIDGenerator {
        private static int counter = 0;

        public static int generateID() {
            counter++;
            return counter;
        }
    }
}
