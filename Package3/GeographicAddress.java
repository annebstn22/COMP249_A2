
package Package3;

import Locale.Locale;
import Package1.Address;

public class GeographicAddress extends Address {
    private String addressLine;
    private String city;
    private String regionOrState;
    private String zipOrPostCode;
    private Locale loc;

    public GeographicAddress() {
        // super();
        addressLine = "";
        city = "";
        regionOrState = "";
        zipOrPostCode = "";
        loc = new Locale();
    }

    public GeographicAddress(String validTo, String validFrom, String addressLine, String city, String regionOrState, String zipOrPostCode, Locale loc1) {
        super(validTo, validFrom);
        this.addressLine = addressLine;
        this.city = city;
        this.regionOrState = regionOrState;
        this.zipOrPostCode = zipOrPostCode;
        loc = new Locale(loc1);
    }

    public GeographicAddress(GeographicAddress someGeoAddress) {
        this(someGeoAddress.validTo, someGeoAddress.validFrom, someGeoAddress.addressLine, someGeoAddress.city, someGeoAddress.regionOrState, someGeoAddress.zipOrPostCode, someGeoAddress.loc);
    }

    
    /**
     * @return String
     */
    public String toString() {  //fix to correct formatting later
        return (addressLine + ", " + city + ", " + regionOrState + ".\n" + zipOrPostCode + "\n" + loc);
    }
    
    
    /** 
     * @param otherObject
     * @return boolean
     */
    public boolean equals(Address otherObject) {
        if (otherObject == null)
        return false;

        String thisClass = getClass().toString(), otherClass = otherObject.getClass().toString(); 

        if (!thisClass.substring(6).equals(otherClass.substring(6))) 
            return false;
        else {
            GeographicAddress otherGeographicAddress = (GeographicAddress)otherObject;
            return (validTo.equals(otherGeographicAddress.validTo) && validFrom.equals(otherGeographicAddress.validFrom) && addressLine.equals(otherGeographicAddress.addressLine) && city.equals(otherGeographicAddress.city) && city.equals(otherGeographicAddress.city) && zipOrPostCode.equals(otherGeographicAddress.zipOrPostCode) && loc.equals(otherGeographicAddress.loc));
        }
    }
}
