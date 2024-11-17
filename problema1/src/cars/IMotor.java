package cars;

public interface IMotor {
    int getSpeed();
    int getRpm();
    float getOilLevel();
    float getGasLevel();

    void accelerate(int speedIncrement, int rpmIncrement);
    void stop();
    void consumeOil(float amount);
    void consumeGas(float amount);
}
