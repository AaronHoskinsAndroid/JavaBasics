package examples.aaronhoskins.com.javabasics.Inheritance;

public class Dog extends Animal  {
    //Member Variables
    private String furColor;
    private String furLength;
    private String breed;

    //Constructor with parameters
    public Dog(String furColor, String furLength, String breed) {
        super("Dog", "Meat", "male", 3, true);//Calls the constructor of the parent
        this.furColor = furColor;
        this.furLength = furLength;
        this.breed = breed;
    }

    //Getters
    public String getFurColor() {
        return furColor;
    }

    public String getFurLength() {
        return furLength;
    }

    public String getBreed() {
        return breed;
    }

    //Setters
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void setFurLength(String furLength) {
        this.furLength = furLength;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "furColor='" + furColor + '\'' +
                ", furLength='" + furLength + '\'' +
                ", breed='" + breed + '\'' +
                '}' +
                super.toString();
    }

    @Override
    void eat() {
        System.out.println("Dog Eats " + getDiet());
    }

    @Override
    void sleep() {
        System.out.println("Dog Sleeps for 5 hours");
    }

}
