package lab2;


public class Fish extends Animal implements Pet {
    private String name;
    public Fish (String name1){
        super (0);
        this.name =name1;
    }

    public Fish (){
        super (0);
    }

    public String getName (){
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public void play (){
        System.out.println("Play like a Fish");
    }

    public void eat (){
        System.out.println("Eat like a Fish");
    }

    public void walk (){
        System.out.println("Swim like a Fish");
    }
}

