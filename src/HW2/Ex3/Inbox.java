package HW2.Ex3;

import java.util.ArrayList;

public class Inbox {
    private ArrayList<Mail> mails;
    private int mailCount;

    public Inbox(ArrayList<Mail> mails) {
        this.mails = mails;
    }

    public Integer getUnreadMailCount(){
        int unreadCount = 0;
        for (int i = 0; i < mails.size(); i++) {
            if (!mails.get(i).isRead()) {
                unreadCount++;
            }
        }
        return unreadCount;
    }
    public void printAllMailHeaders() {
        for (int i = 0; i < mailCount; i++) {
            System.out.println("Read?:"+mails.get(i).isRead() + " | " + mails.get(i).getSubject() + " | " + mails.get(i).getSenderAdress() + " | " + mails.get(i).getDateTime());
        }
    }


}
