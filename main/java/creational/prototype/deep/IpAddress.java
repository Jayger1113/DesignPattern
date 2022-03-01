package creational.prototype.deep;

public class IpAddress implements Cloneable{
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "IpAddress{" +
                "address='" + address + '\'' +
                '}';
    }
}
