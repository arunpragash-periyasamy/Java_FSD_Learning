package Day_3.OOPs.Interface;

public class CDPlayer implements MusicPlayer{

    @Override
    public void play() {
       System.out.println("Play the music");
    }

    @Override
    public void pause() {
        System.out.println("Pause the music");
    }

    @Override
    public void start() {
        System.out.println("Start the music player");
    }

    @Override
    public void stop() {
        System.out.println("Stop the music player");
    }
    
}
