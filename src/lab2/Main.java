package lab2;

public class Main {
    public static void main (String[] args){
        Animal cat = new Cat();
        Animal spider = new Spider();
        Animal Fish = new Fish();
        Pet fishPet = new Fish();
        Pet catPet = new Cat ( "Cat1");
        Cat catCat = new Cat();
        catPet.play();
        fishPet.play();
        catCat.play();

        Fish.eat();
    }
}
