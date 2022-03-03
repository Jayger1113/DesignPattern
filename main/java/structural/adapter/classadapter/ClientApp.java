package structural.adapter.classadapter;


public class ClientApp {

    public static void main(String[] args){
        Target target = new ClassAdapter();
        target.request();
    }
}
