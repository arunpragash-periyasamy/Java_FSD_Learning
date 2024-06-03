package Day_3.OOPs.Interface;

public class Car implements Engine, MusicPlayer, Brake {
    @Override
    public void start() {
        System.out.println("Start engine in a normal car");
    }

    @Override
    public void apply() {
        System.out.println("Apply brakes like a normal Car");
    }

    @Override
    public void play() {
       System.out.println("Play music in a normal car");
    }

    @Override
    public void pause() {
        System.out.println("Pause a music in a normal car");
    }

    @Override
    public void stop() {
        System.out.println("Stop the engine in a normal car");
    }

    @Override
    public void acc() {
        System.out.println("Accelarate a normal car");
    }
    
    // Here the biggest issue is that start and stop method is there in engine and music player
    // So we can not implement both of them in a single class.
    // So we have to implement both of them in different class.
    // Because I would like to start the music player but the implementation starts the engine
    // This is not correct implementation for a car;
}
