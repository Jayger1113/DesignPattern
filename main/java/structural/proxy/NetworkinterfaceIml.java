package structural.proxy;

public class NetworkinterfaceIml implements NetworkInterface{
    @Override
    public void connect() {
        System.out.println("connect to network");
    }
}
