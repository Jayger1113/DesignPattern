package abstractfactory;

public class Mac implements OS{
    @Override
    public void boot() {
        System.out.println("Mac can boot");
    }
}
