package Protected_And_Default_Private.bluetooth;

public class SmartPhone extends MobileGadget {
    private Laptop connectedLaptop;

    public SmartPhone() {
        this.connectedLaptop = new Laptop();
    }

    private void sendInfoToLaptop(String info){
        printNotification("Sending info to laptop: " + info);
        connectedLaptop.recieveInfo(info);
    }

    
    
}
