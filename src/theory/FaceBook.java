package theory;

public class FaceBook implements Messenger{
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void answerToMessage(String message) {
        System.out.println(message);
    }
}
