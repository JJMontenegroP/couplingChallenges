package cars;

public class Dashboard implements IDashboard {
    private final IMotor motor;

    public Dashboard(IMotor motor) {
        this.motor = motor;
    }

    @Override
    public void display() {
        System.out.println("--------------------------------");
        System.out.println("DASHBOARD:");
        System.out.println("\t RPM: " + motor.getRpm());
        System.out.println("\t Speed: " + motor.getSpeed());
        System.out.println("\t Oil level: " + motor.getOilLevel());
        System.out.println("\t Gas level: " + motor.getGasLevel());
    }
}