package Package3;

public class GeographicAddress extends Address {
    private String addressLine;
    private String city;
    private String regionOrState;
    private String zipOrPostCode;
    private Object loc;

    public GeographicAddress() {
        super();
        addressLine = "";
        city = "";
        regionOrState = "";
        zipOrPostCode = "";
        loc = new Locale();
    }

    public GeographicAddress(int year, int month, int day, String addressLine, String city, String regionOrState, String zipOrPostCode, Object loc1) {
        super(year, month, day);
        this.addressLine = addressLine;
        this.city = city;
        this.regionOrState = regionOrState;
        this.zipOrPostCode = zipOrPostCode;
        loc = new Locale(loc1);
    }

    public GeographicAddress(GeographicAddress someGeoAddress) {
        this(someGeoAddress.getYear(), someGeoAddress.getMonth(), someGeoAddress.getDay(), someGeoAddress.addressLine, someGeoAddress.city, someGeoAddress.regionOrState, someGeoAddress.zipOrPostCode, someGeoAddress.loc);
    }

    private int getYear() {
        return (super.year);
    }    
    
    private int getMonth() {
        return (super.year);
    }

    private int getDay() {
        return (super.year);
    }

    public String toString() {
        return (addressLine + ", " + city + ", " + regionOrState + ".\n" + zipOrPostCode + "\n" + loc);
    }
}
