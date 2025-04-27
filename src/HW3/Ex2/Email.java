package HW3.Ex2;

public class Email extends Message {
    @Override
    String getType() {
        return "Email";
    }

    String send() {
        return "Email sent";
    }

}
