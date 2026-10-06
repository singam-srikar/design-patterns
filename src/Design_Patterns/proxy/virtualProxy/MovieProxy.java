package Design_Patterns.proxy.virtualProxy;

public class MovieProxy implements Video{
    private Video video;
    private String filename;

    public MovieProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void play() throws InterruptedException {
        if(video == null){
            video = new Movie(filename);
            video.play();
        }
       else video.play();
    }
}
