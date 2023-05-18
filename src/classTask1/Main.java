package classTask1;

public class Main {
    public static void main(String[] args) {
        Swim shark1=new Shark();
      //  shark1.method("Shark1");
        Swim shark2=new Shark();
      //  shark2.method("Shark2");
        Swim shark3=new Shark();
      //  shark3.method("Shark3");
        Swim shark4=new Shark();
      //  shark4.method("Shark4");
        Swim shark5=new Shark();
        //shark5.method("Shark5");

        Swim []sharks={shark1,shark2,shark3,shark4,shark5};
        for (Swim s:sharks) {
            if (s.getClass().equals(Shark.class)) {
                s.method("All sharks");
            }
        }




        Swim duck=new Duck();
        duck.method("Duck name");
        Swim turtle =new Turtle();
        turtle.method("Turtle name");



    }
}
