package Day_3.OOPs.Interface;

public class BMW {
    private Engine engine;
    private MusicPlayer player;
    public BMW() {
        engine = new PowerEngine();
        player = new CDPlayer();
    }
    
    public BMW(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void acc() {
        engine.acc();
    }
    
    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void play() {
        player.play();
    }

    public void pause() {
        player.pause();
    }
    
}
