public class VideoProjector implements Vga{
    @Override
    public void print(String message) {
        System.out.println("------------------VideoProjector--------------");
        System.out.println(message);
        System.out.println("---------------------------------------");
    }
}
