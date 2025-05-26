package car_class;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Accord", 2019);

        car1.displayDetails();
        car2.displayDetails();
    }
}
