package cars;

public class Car {
    private final IMotor motor;
    private final IDashboard dashboard;

    public Car(IMotor motor, IDashboard dashboard) {
        this.motor = motor;
        this.dashboard = dashboard;
    }

    public void accelerate() {
        motor.accelerate(10, 100);
        motor.consumeOil(0.1f);
        motor.consumeGas(0.5f);
    }

    public void stop() {
        motor.stop();
        motor.consumeOil(0.1f); // Simula consumo de aceite al detenerse.
    }

    public void displayDashboard() {
        dashboard.display();
    }

    public static void main(String[] args) {
        IMotor motor = new Motor();
        IDashboard dashboard = new Dashboard(motor);
        Car car = new Car(motor, dashboard);

        car.displayDashboard();
        car.accelerate();
        car.displayDashboard();
        car.stop();
        car.displayDashboard();
    }
}
