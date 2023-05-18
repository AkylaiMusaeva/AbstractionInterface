package classTask1;

public class SwimAnimals {
    private String name;
    private int age;
    public SwimAnimals(String name,int age){
        this.name=name;
        this.age=age;
    }
    public SwimAnimals(){

    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

}
