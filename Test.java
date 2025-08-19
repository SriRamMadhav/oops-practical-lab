package oops_practical;
class Vehicle {
    int maxSpeed = 120;
}

class Car extends Vehicle {
    int maxSpeed = 180;
    void display()
    {
        
        System.out.println("Maximum Speed: "
                           + super.maxSpeed);
    }
}

public class Test {

	public static void main(String[] args)
    {
        Car small = new Car();
        small.display();
    }


}
