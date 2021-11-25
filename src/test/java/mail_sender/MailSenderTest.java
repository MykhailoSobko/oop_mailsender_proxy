package mail_sender;

import mail_sender.Client;
import mail_sender.Gender;

import static org.junit.jupiter.api.Assertions.*;

class MailSenderTest {
    MailInfo mailInfo;
    Client client;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        client = new Client();
        mailInfo = new MailInfo(client, MailCode.HAPPY_BIRTHDAY);
    }

    @org.junit.jupiter.api.Test
    void testSendMail() {
        MailSender sender = new MailSender();
        sender.sendMail(mailInfo);
    }
}

