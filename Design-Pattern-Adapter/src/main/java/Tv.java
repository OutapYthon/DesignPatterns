public class Tv implements Hdmi{


    @Override
    public void plot(byte[] data) {
        System.out.println("::::::::: TV :::::::::::");
        System.out.println(new String(data));
    }
}
