package creational.prototype.shallow;

public class ClientApp {
    public static void main(String[] args){
        MacBook macBook = new MacBook();
        IpAddress ipAddress = new IpAddress();
        ipAddress.setAddress("192.168.0.1");
        macBook.setIpAddress(ipAddress);
        macBook.setSeries("pro1");
        try {
            MacBook cloneMacBook = (MacBook) macBook.clone();
            System.out.println("macbook : " + macBook.toString());
            System.out.println("cloneMacbook : " + cloneMacBook.toString());

            //clone will be effected by shallow copy except the primitive type like int
            ipAddress.setAddress("192.168.0.2");
            macBook.setSeries("pro2");

            System.out.println("shallow copy=> macbook : " + macBook.toString());
            System.out.println("shallow copy=> cloneMacbook : " + cloneMacBook.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
