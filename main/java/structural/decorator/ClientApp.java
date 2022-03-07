package structural.decorator;

public class ClientApp {

    public static void main(String[] args){
        Notebook myDecorateNotebook = new MyDecoratedNotebook();
        myDecorateNotebook.boot();

        HDMI hdmi = new HDMI(myDecorateNotebook);
        hdmi.boot();

        VGA vga = new VGA(myDecorateNotebook);
        vga.boot();
    }
}
