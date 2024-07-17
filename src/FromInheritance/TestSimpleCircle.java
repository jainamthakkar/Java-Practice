package FromInheritance;


//SimpleCircle is an inner class of class TestSimpleCircle. This means that you first need an instance of object of enclosing class, for example:

//TestSimpleCircle tsc = new TestSimpleCircle();
//Now you are able to create an instance of inner class that is connected with an instance of enclosing TestSimpleCircle class:

//SimpleCircle circle = tsc.new SimpleCircle();
//As you see, to create an instance of object of inner class you had to specify to which exactly object of enclosing class you want it to belong (with the tsc.new in your example).

//If you need to create an instance of SimpleCircle without instance of object of enclosing class you should have declared this class as static class SimpleCircle{code of your class here}


public class TestSimpleCircle {

    class SimpleCircle {
        double radius;

        SimpleCircle(){
            radius = 1;
        }

        SimpleCircle(double newRadius){
            radius = newRadius;
        }

        double getArea() {
            return radius * radius * Math.PI;
        }

        double getPerimeter() {
            return 2 * radius * Math.PI;
        }

        void setRadius(double newRadius) {
            radius = newRadius;
        }
    }

    public static void main(String [] args) {
    	
    	TestSimpleCircle tsc = new TestSimpleCircle();
    	
    	SimpleCircle circle = tsc.new SimpleCircle();
        System.out.println("the area of the circle of radius "+circle.radius+" is "+circle.getArea());

        SimpleCircle circle2 = tsc.new SimpleCircle(25);
        System.out.println("the area of the circle of radius "+circle2.radius+" is "+circle2.getArea());

        SimpleCircle circle3 = tsc.new SimpleCircle(125);
        System.out.println("the area of the circle of radius "+circle3.radius+" is "+circle3.getArea());

        circle.radius = 100;
        System.out.println("The area of the circle of radius "+circle.radius+" is "+circle.getArea());
    }
}