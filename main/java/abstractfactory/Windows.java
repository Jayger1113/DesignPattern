package abstractfactory;

public class Windows implements OS{
    @Override
    public void boot() {
        System.out.println("Windows can boot");
    }
}
