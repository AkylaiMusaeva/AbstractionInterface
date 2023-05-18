package theory;

public class Main {
    public static void main(String[] args) {
        Messenger facebook=new FaceBook();
        facebook.sendMessage("Hello");
        facebook.answerToMessage("Hi");

        Messenger whatsapp=new WhatsApp();
        whatsapp.sendMessage("How are you?");
        whatsapp.answerToMessage("I am fine,thank you!");

        Messenger telegram=new Telegram();
        telegram.sendMessage("What are you doing?");
        telegram.answerToMessage("I am studying");
    }
}