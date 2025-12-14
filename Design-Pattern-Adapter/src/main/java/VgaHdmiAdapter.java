public class VgaHdmiAdapter implements Vga{

    private Hdmi hdmi;

    @Override
    public void print(String message) {
        System.out.println("+++++++++++ADAPTER+++++++++++++++++");
        byte[] bytes= message.getBytes();
        hdmi.plot(bytes);
        System.out.println("+++++++++++ADAPTER+++++++++++++++++");

    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
