package examples.aaronhoskins.com.javabasics.DesignPatterns;

public class Factory {

    public static class ShapeFactory {
        //use getShape method to get object of type shape
        public Shape getShape(String shapeType){
            if(shapeType == null){
                return null;
            }
            if(shapeType.equalsIgnoreCase("CIRCLE")){
                return new Circle();

            } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
                return new Rectangle();

            } else if(shapeType.equalsIgnoreCase("TRIANGLE")){
                return new Triangle();
            }

            return null;
        }
    }

    public static class Triangle implements Shape{

        @Override
        public void draw() {
            System.out.println("This shape is a Triangle");
        }
    }

    public static class Rectangle implements Shape{

        @Override
        public void draw() {
            System.out.println("This shape is a Rectangle");
        }
    }

    public static class Circle implements Shape{

        @Override
        public void draw() {
            System.out.println("This shape is a Circle");
        }
    }

    public interface Shape {
        void draw();
    }
}
