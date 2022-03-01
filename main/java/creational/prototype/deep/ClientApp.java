package creational.prototype.deep;


public class ClientApp {

    public static void main(String[] args){
        MacBook macBook = new MacBook();
        IpAddress ipAddress = new IpAddress();
        ipAddress.setAddress("192.168.0.1");
        macBook.setIpAddress(ipAddress);
        macBook.setSeries("pro1");
        try {
            MacBook cloneMacBook = (MacBook) macBook.clone();
            System.out.println("macbook: " + macBook.toString());
            System.out.println("cloneMacbook: " + cloneMacBook.toString());

            //clone won't be effected by deep copy
            ipAddress.setAddress("192.168.0.2");
            macBook.setSeries("pro2");

            System.out.println("deep copy=> macbook : " + macBook.toString());
            System.out.println("deep copy=> cloneMacbook : " + cloneMacBook.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
