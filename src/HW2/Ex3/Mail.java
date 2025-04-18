package HW2.Ex3;

public class Mail {
    private String senderAdress;
    private String subject;
    private String message;
    private String dateTime;
    private boolean isRead;

    public Mail(String senderAdress, String subject, String message, String dateTime) {
        this.senderAdress = senderAdress;
        this.subject = subject;
        this.message = message;
        this.dateTime = dateTime;
        this.isRead = false; // Default value for isRead
    }

    public void markAsRead() {
        this.isRead = true;
    }

    public String printMail() {
        return "Subject:"+ subject + " from " + senderAdress + " at " + dateTime + "\n" +
                message + "\n" +
                (isRead ? "Read" : "Unread");
    }

    public String getSenderAdress() {
        return senderAdress;
    }

    public void setSenderAdress(String senderAdress) {
        this.senderAdress = senderAdress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }
}
