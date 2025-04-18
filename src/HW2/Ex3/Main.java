package HW2.Ex3;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mail mail = new Mail("John", "Hello", "How are you?", "2023-10-01 10:00");
        //System.out.println(mail.printMail());

        ArrayList<Mail> mails = new ArrayList<Mail>();
        mails.add(mail);
        mails.add(new Mail("Jane", "Meeting", "Let's meet tomorrow.", "2023-10-02 11:00"));
        mails.add(new Mail("Bob", "Project Update", "The project is on track.", "2023-10-03 12:00"));

        Inbox inbox = new Inbox(mails);

        inbox.printAllMailHeaders();
    }
}
