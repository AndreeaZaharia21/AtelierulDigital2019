package lab2;

public class Cat extends Animal implements Pet {
    private String name;
    public Cat (String name1){
        super (4);
        this.name =name1;
    }

    public Cat (){
        super (4);
    }

    public String getName (){
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public void play (){
        System.out.println("Play like a Cat");
    }

    public void eat (){
        System.out.println("Eat like a Cat");
    }
}
