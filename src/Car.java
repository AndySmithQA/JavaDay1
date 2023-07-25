public class Car {
    private String make;
    String model;
    int YoB;

    public Car(String make, String model, int Yob){
        this.make = make;
        this.model = model;
        this.YoB = Yob;
    }


    public void main() {
        Car c1 = new Car("Ford", "Mustang", 2016);
    }
}
