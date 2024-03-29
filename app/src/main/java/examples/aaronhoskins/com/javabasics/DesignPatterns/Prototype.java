package examples.aaronhoskins.com.javabasics.DesignPatterns;

import java.util.Hashtable;

public class Prototype {
    private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

    public static class ShapeCache {
        public static Shape getShape(String shapeId) {
            Shape cachedShape = shapeMap.get(shapeId);
            return (Shape) cachedShape.clone();
        }

        // for each shape run database query and create shape
        // shapeMap.put(shapeKey, shape);
        // for example, we are adding three shapes

        public static void loadCache() {
            Circle circle = new Circle();
            circle.setId("1");
            shapeMap.put(circle.getId(),circle);

            Rectangle.Square square = new Rectangle.Square();
            square.setId("2");
            shapeMap.put(square.getId(),square);

            Rectangle rectangle = new Rectangle();
            rectangle.setId("3");
            shapeMap.put(rectangle.getId(), rectangle);
        }
    }

    public static class Circle extends Shape {

        public Circle(){
            type = "Circle";
        }

        @Override
        public void draw() {
            System.out.println("Inside Circle::draw() method.");
        }
    }

    public static class Rectangle extends Shape {

        public static class Square extends Shape {

            public Square(){
                type = "Square";
            }

            @Override
            public void draw() {
                System.out.println("Inside Square::draw() method.");
            }
        }


        public Rectangle(){
            type = "Rectangle";
        }

        @Override
        public void draw() {
            System.out.println("Inside Rectangle::draw() method.");
        }
    }

    public static abstract class Shape implements Cloneable {

        private String id;
        protected String type;

        abstract void draw();

        public String getType(){
            return type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Object clone() {
            Object clone = null;

            try {
                clone = super.clone();

            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

            return clone;
        }
    }
}
