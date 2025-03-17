package JavaPractice;

class Car {
    String name;
    String type;
    String engine;
    Integer speed;

    //Constructor
    public Car (String name, String type, String engine, Integer speed ) {
        this.name = name;
        this.type = type;
        this.engine = engine;
        this.speed = speed;
    }

    //Method to be overidden
    public void displayinfo () {
        System.out.println("Car Name" +name);
        System.out.println("Type" +type);
        System.out.println("Engine" +engine);
        System.out.println("Speed" +speed+ "Km/h");
    }
    
        
}

//subclass 1
class Car1 extends Car {
    public Car1 (String name, String type, String engine, Integer speed) {
        super(name, type, engine, speed);
    }
    public void displayinfo() {
        System.out.println("Car1 - Sports Edition");
        displayinfo();
    }
}

public class Main {
    public static void main (String[]args) {
        Car myCar1 = new Car1 ("Ferrari", "Sports", "V8", 320);

        Car[] cars = {myCar1};
        for(Car cars : cars) {
            car.displayinfo();
            
System.out.println("----------------");
        }
    }

    
}
    
        

    

