package structural.facade;

public class NoteBookBootFacade {
    private NoteBookBootCPU noteBookBootCPU = new NoteBookBootCPU();
    private NoteBookBootMemory noteBookBootMemory = new NoteBookBootMemory();
    private NoteBookBootHarddisk noteBookBootHarddisk = new NoteBookBootHarddisk();

    public void boot(){
        noteBookBootCPU.init();
        noteBookBootMemory.init();
        noteBookBootHarddisk.init();
    }
}
