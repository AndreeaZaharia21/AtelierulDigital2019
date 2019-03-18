package lab1;

public class Animal {
    static void classMethod () { System.out.println ("Static method in animal"); }

    void instanceMethod () {
        System.out.println("Instance method in cat");
        public static void main (String[]args){
            Cat myCat = new Cat();
            Animal myAnimal = myCat;
            myAnimal.instanceMethod();
            Animal.classMethod();
        }
    }
}
