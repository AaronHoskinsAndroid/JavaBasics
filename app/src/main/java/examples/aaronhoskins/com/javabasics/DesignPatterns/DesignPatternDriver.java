package examples.aaronhoskins.com.javabasics.DesignPatterns;

public class DesignPatternDriver {
    public static void main(String[] args) {
        System.out.println("-------------- Singleton Demo -------------- ");
        singletonDemo();
        System.out.println("--------------  Builder Demo  -------------- ");
        builderDemo();
        System.out.println("--------------  Factory Demo  -------------- ");
        factoryDemo();
        System.out.println("-------------  Prototype Demo  ------------- ");
        prototypeDemo();

    }

    public static void singletonDemo() {
        //Creating 2 Singleton Objects
        Singleton singletonOne = Singleton.getInstance("Singleton One");
        Singleton singletonTwo = Singleton.getInstance("Singleton Two");

        //Print out id's of the two objects
        System.out.println("Id of singletonOne is " + singletonOne.getId());
        System.out.println("Id of singletonTwo is " + singletonTwo.getId());

        //Set the value in object one
        singletonOne.setValue("Android is awesome");

        //Print out the value in both objects
        System.out.println("Value in singletonOne is " + singletonOne.getValue());
        System.out.println("Value in singletonTwo is " + singletonTwo.getValue());

        //Set the value in object two
        singletonTwo.setValue("Yes android rocks");

        //Print out the value in both objects
        System.out.println("Value in singletonOne is " + singletonOne.getValue());
        System.out.println("Value in singletonTwo is " + singletonTwo.getValue());
    }

    public static void builderDemo() {
        String name = "John Doe";
        String address = "1785 The Exchange SE";
        String city = "Atlanta";
        String state = "GA";
        String zip = "30339";

        //Build the object
        PostalLabel postalLabel =
                PostalLabel.Builder.newInstance()
                        .setAddress(address)
                        .setName(name)
                        .setCity(city)
                        .setState(state)
                        .setZip(zip)
                        .build();

        //print the label
        postalLabel.printPostalLabel();
    }

    public static void factoryDemo() {
        Factory.ShapeFactory shapeFactory = new Factory.ShapeFactory();

        //get an object of Circle and call its draw method.
        Factory.Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Factory.Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Triangle and call its draw method.
        Factory.Shape shape3 = shapeFactory.getShape("TRIANGLE");

        //call draw method of square
        shape3.draw();
    }

    public static void prototypeDemo() {
        Prototype.ShapeCache.loadCache();

        Prototype.Shape clonedShape = (Prototype.Shape) Prototype.ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Prototype.Shape clonedShape2 = (Prototype.Shape) Prototype.ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Prototype.Shape clonedShape3 = (Prototype.Shape) Prototype.ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
