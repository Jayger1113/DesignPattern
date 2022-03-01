package creational.prototype.shallow;

public class MacBook implements Cloneable{


    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    private String series;

    private IpAddress ipAddress;

    public void setIpAddress(IpAddress ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        System.out.println("macbook clone success");
        return (MacBook) super.clone();
    }

    @Override
    public String toString() {
        return "MacBook{" +
                "series='" + series + '\'' +
                ", ipAddress=" + ipAddress +
                '}';
    }
}
