package theory;

public class WhatsApp implements Messenger{
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void answerToMessage(String message) {
        System.out.println(message);
    }
}
