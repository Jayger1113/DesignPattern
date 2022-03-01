package creational.abstractfactory;



public class ClientApplication {

    public static void main(String[] args){
        boot(new Mac());
        boot(new Windows());
    }

    public static void boot(OS os){
        os.boot();
    }

}
