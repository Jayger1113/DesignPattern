package creational.prototype.shallow;

public class IpAddress {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "IpAddress{" +
                "address='" + address + '\'' +
                '}';
    }
}
