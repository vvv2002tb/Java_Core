package OOP.Interface;

public interface Vehicle {
    void start();
    void stop();
    void accelerate(int speed);
    void decelerate(int speed);
    String getInfoVehicle();
}

class Car implements Vehicle {
    private String model;
    private int speed;
    
    
    
    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void start() {
        System.out.println(model + " is starting");
    }

    @Override
    public void stop() {
        System.out.println(model + " is stopping");
    }

    @Override
    public void accelerate(int speed) {
        this.speed += speed;
        System.out.println(model + " is accelerating to " + this.speed + " km/h");
    }

    @Override
    public void decelerate(int speed) {
        this.speed -= speed;
        System.out.println(model + " is decelerating to " + this.speed + " km/h");
    }

    @Override
    public String getInfoVehicle() {
        return "Car info: " + model + " with speed " + speed + " km/h";
    }
}

class Bike implements Vehicle {
    private String model;
    private int speed;

    public Bike(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void start() {
        System.out.println(model + " is starting");
    }

    @Override
    public void stop() {
        System.out.println(model + " is stopping");
    }   

    @Override
    public void accelerate(int speed) {
        this.speed += speed;
        System.out.println(model + " is accelerating to " + this.speed + " km/h");
    }

    @Override
    public void decelerate(int speed) {
        this.speed -= speed;
        if (this.speed < 0) {
            this.speed = 0;
        }
        System.out.println(model + " is decelerating to " + this.speed + " km/h");
    }

    @Override
    public String getInfoVehicle() {
        return "Bike info: " + model + " with speed " + speed + " km/h";
    }
}

