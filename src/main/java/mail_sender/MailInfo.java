package mail_sender;

import lombok.Getter;

import java.util.HashMap;

@Getter
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String getText() {
        HashMap<String, String> templates = new HashMap<>();
        templates.put("%NAME%", client.getName());
        templates.put("%AGE%", Integer.toString(client.getAge()));

        String text = mailCode.generateText();
        for (String key: templates.keySet()) {
            text = text.replace(key, templates.get(key));
        }
        return text;
    }
}
