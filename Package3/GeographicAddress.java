
package Package3;

import Locale.Locale;
import Package1.Address;

public class GeographicAddress extends Address {
    protected String addressLine; //DOUBLE CHECK: protected so that PostOfficeBoxAddress can have access
    protected String city;
    protected String regionOrState;
    protected String zipOrPostCode;
    protected Locale loc;

    //Default Constructor
    public GeographicAddress() {
        addressLine = "address";
        city = "city";
        regionOrState = "region/state";
        zipOrPostCode = "zip/postcode";
        loc = new Locale();
    }

    //Parameterized Constructor
    public GeographicAddress(String validFrom, String validTo, String addressLine, String city, String regionOrState, String zipOrPostCode, Locale loc1) {
        super(validFrom, validTo);
        this.addressLine = addressLine;
        this.city = city;
        this.regionOrState = regionOrState;
        this.zipOrPostCode = zipOrPostCode;
        loc = new Locale(loc1);
    }

    //Copy Constructor
    public GeographicAddress(GeographicAddress someGeoAddress) {
        this(someGeoAddress.validFrom, someGeoAddress.validTo, someGeoAddress.addressLine, someGeoAddress.city, someGeoAddress.regionOrState, someGeoAddress.zipOrPostCode, someGeoAddress.loc);
    }

    // Accessors and Mutators

    public String getAddressLine(){
        return addressLine;
    }

    public String getCity(){
        return city;
    }

    public String getRegionOrState(){
        return regionOrState;
    }

    public String getZipOrPostCode(){
        return zipOrPostCode;
    }

    public Locale getLocale(){
        return new Locale(this.loc);
    }

    public void setAddressLine(String addressLine){
        this.addressLine = addressLine;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setRegionOrState(String regionOrState){
        this.regionOrState = regionOrState;
    }

    public void setZipOrPostCode(String zipOrPostCode){
        this.zipOrPostCode = zipOrPostCode;
    }

    public void setLocale(Locale loc){
        Locale newLoc = new Locale(loc);
        this.loc = newLoc;
    }


    /**
     * @return String
     */
    public String toString() { 
        return ("The GEOGRAPHIC ADDRESS:\n" + addressLine + ", " + city + ", " + regionOrState + zipOrPostCode + loc + " \nis valid from " + validFrom + " to " + validTo);
    }
    
    
    /** 
     * @param otherAddress
     * @return boolean
     */
    public boolean equals(Address otherAddress) {

        if (otherAddress == null){
            return false;
        }

        String thisClass = getClass().toString(), otherClass = otherAddress.getClass().toString(); 

        if (!thisClass.substring(6).equals(otherClass.substring(6))) 
            return false;
        else {
            GeographicAddress otherGeographicAddress = (GeographicAddress)otherAddress;
            return (validTo.equals(otherGeographicAddress.validTo) && validFrom.equals(otherGeographicAddress.validFrom) 
            && addressLine.equals(otherGeographicAddress.addressLine) && city.equals(otherGeographicAddress.city) 
            && zipOrPostCode.equals(otherGeographicAddress.zipOrPostCode) && regionOrState.equals(otherGeographicAddress.regionOrState) 
            && loc.equals(otherGeographicAddress.loc));
        }
    }
}
