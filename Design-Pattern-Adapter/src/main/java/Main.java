public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setVga(new Monitor());
        computer.view("hello bdcc");
        computer.setVga(new VideoProjector());
        computer.view("hello M2");
        VgaHdmiAdapter hdmiAdapter = new VgaHdmiAdapter();
        hdmiAdapter.setHdmi(new Tv());
        computer.view("hello M2");
    }
}
