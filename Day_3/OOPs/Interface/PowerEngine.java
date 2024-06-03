package Day_3.OOPs.Interface;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Start the power engine");
    }
    @Override
    public void stop() {
        System.out.println("Stop the power engine");
    }
    @Override
    public void acc() {
        System.out.println("Accelerate the power engine");
    }
}
