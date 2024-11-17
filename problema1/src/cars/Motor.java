package cars;

public class Motor implements IMotor {
    private int speed;
    private int rpm;
    private float oilLevel;
    private float gasLevel;

    public Motor() {
        this.speed = 0;
        this.rpm = 0;
        this.oilLevel = 100.0f;
        this.gasLevel = 100.0f;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getRpm() {
        return rpm;
    }

    @Override
    public float getOilLevel() {
        return oilLevel;
    }

    @Override
    public float getGasLevel() {
        return gasLevel;
    }

    @Override
    public void accelerate(int speedIncrement, int rpmIncrement) {
        this.speed += speedIncrement;
        this.rpm += rpmIncrement;
    }

    @Override
    public void stop() {
        this.speed = 0;
        this.rpm = 0;
    }

    @Override
    public void consumeOil(float amount) {
        this.oilLevel = Math.max(0, this.oilLevel - amount);
    }

    @Override
    public void consumeGas(float amount) {
        this.gasLevel = Math.max(0, this.gasLevel - amount);
    }
}
