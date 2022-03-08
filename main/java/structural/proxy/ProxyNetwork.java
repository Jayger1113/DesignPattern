package structural.proxy;

public class ProxyNetwork {
    private NetworkinterfaceIml networkinterfaceIml;

    public void connect(){
        if(networkinterfaceIml == null){
            networkinterfaceIml = new NetworkinterfaceIml();
        }
        networkinterfaceIml.connect();
    }
}
