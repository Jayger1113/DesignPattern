package structural.facade;

public class ClientApp {

    public static void main(String[] args){
        //without facade:
//        NoteBookBootCPU initialCPU = new NoteBookBootCPU();
//        initialCPU.init();
//        NoteBookBootMemory initialMemory = new NoteBookBootMemory();
//        initialMemory.init();
//        NoteBookBootHarddisk initialHD = new NoteBookBootHarddisk();
//        initialHD.init();
        // with facade:
        NoteBookBootFacade noteBookBootFacade = new NoteBookBootFacade();
        noteBookBootFacade.boot();
    }
}
