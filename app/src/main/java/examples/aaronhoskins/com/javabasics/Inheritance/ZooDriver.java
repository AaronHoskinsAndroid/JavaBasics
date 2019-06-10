package examples.aaronhoskins.com.javabasics.Inheritance;

public class ZooDriver {


    public static void main(String[] args) {
        Dog dog = new Dog("Black", "short", "Husky");
        Animal animal = (Animal)dog;
        animal.eat();
        dog.eat();
        animal.sleep();
        dog.sleep();
    }


}
