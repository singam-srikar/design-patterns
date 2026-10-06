package Design_Patterns.proxy.virtualProxy;

public class Movie implements Video{
   private String fileName;
    //now this will call only first time object created
    public Movie(String fileName) throws InterruptedException {
        this.fileName = fileName;
        loadVideo();
    }
//Before virtual proxy, video is loading on every obj creation before calling play method

    private void loadVideo() throws InterruptedException {
        System.out.println("Loading video from server");
        Thread.sleep(2000);
    }
    @Override
    public void play() {
        System.out.println("Playing "+fileName);
    }
}
