package examples.aaronhoskins.com.javabasics.Inheritance;

public abstract class Animal {
    //Member Variables
    private String species;
    private String diet;
    private String gender;
    private double age;
    private boolean isAlive;


    //Constructor with parameters
    public Animal(String species, String diet, String gender, double age, boolean isAlive) {
        this.species = species;
        this.diet = diet;
        this.gender = gender;
        this.age = age;
        this.isAlive = isAlive;
    }

    //Getters
    public String getSpecies() {
        return species;
    }

    public String getDiet() {
        return diet;
    }

    public String getGender() {
        return gender;
    }

    public double getAge() {
        return age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    //Setters
    public void setSpecies(String species) {
        this.species = species;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", diet='" + diet + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                '}';
    }

    //Abstract methods
    abstract void eat();
    abstract void sleep();

}
