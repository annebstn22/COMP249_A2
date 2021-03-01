
package Package3;

import java.util.Locale;

public class GeographicAddress extends Package1.Address {
    private String addressLine;
    private String city;
    private String regionOrState;
    private String zipOrPostCode;
    private Locale loc;

    public GeographicAddress() {
        super();
        addressLine = "";
        city = "";
        regionOrState = "";
        zipOrPostCode = "";
        Locale loc = new Locale();
    }

    public GeographicAddress(String validTo, String validFrom, String addressLine, String city, String regionOrState, String zipOrPostCode, Locale loc1) {
        super(validTo, validFrom);
        this.addressLine = addressLine;
        this.city = city;
        this.regionOrState = regionOrState;
        this.zipOrPostCode = zipOrPostCode;
        Locale loc = new Locale(loc1);
    }

    public GeographicAddress(GeographicAddress someGeoAddress) {
        this(someGeoAddress.validTo, someGeoAddress.validFrom, someGeoAddress.addressLine, someGeoAddress.city, someGeoAddress.regionOrState, someGeoAddress.zipOrPostCode, someGeoAddress.loc);
    }

    public String toString() {  //fix to correct formatting later
        return (addressLine + ", " + city + ", " + regionOrState + ".\n" + zipOrPostCode + "\n" + loc);
    }
    
    public boolean equals(Object otherObject) {
        if (otherObject == null)
            return false;
        else if (getClass()!= otherObject.getClass())
            return false;
        else {
            GeographicAddress otherGeographicAddress = (GeographicAddress)otherObject;
            return (validTo.equals(otherGeographicAddress.validTo) && validFrom.equals(otherGeographicAddress.validFrom) && addressLine.equals(otherGeographicAddress.addressLine) && city.equals(otherGeographicAddress.city) && city.equals(otherGeographicAddress.city) && zipOrPostCode.equals(otherGeographicAddress.zipOrPostCode) && loc.equals(otherGeographicAddress.loc));
        }
    }
}
