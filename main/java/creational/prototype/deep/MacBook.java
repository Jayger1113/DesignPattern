package creational.prototype.deep;

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
        MacBook macBook = (MacBook) super.clone();
        macBook.ipAddress = (IpAddress)ipAddress.clone();
        return macBook;
    }

    @Override
    public String toString() {
        return "MacBook{" +
                "series='" + series + '\'' +
                ", ipAddress=" + ipAddress +
                '}';
    }
}
