package Package3;

import Package2.TelecomAddress;
import Package1.Address;

public class GeneralDeliveryAddress extends Address{ 
    private String addressLine;
    private String city;
    private String regionOrState;
    private String zipOrPostCode;
    private TelecomAddress telecomAddress; 

    //Default Constructor
    public GeneralDeliveryAddress() {
        addressLine = "address";
        city = "city";
        regionOrState = "region/state";
        zipOrPostCode = "zip/postcode";
        telecomAddress = new TelecomAddress();
    }

    // Parameterized Constructor
    public GeneralDeliveryAddress(String validFrom, String validTo, String addressLine, String city, String regionOrState, String zipOrPostCode, TelecomAddress telecomAddress) {
        super(validFrom, validTo);
        this.telecomAddress = new TelecomAddress(telecomAddress);
        this.addressLine = addressLine;
        this.city = city;
        this.regionOrState = regionOrState;
        this.zipOrPostCode = zipOrPostCode;
    }

    //Copy Constructor
    public GeneralDeliveryAddress(GeneralDeliveryAddress anAddress) {
        this.validFrom = anAddress.validFrom;
        this.validTo = anAddress.validTo;
        this.addressLine = anAddress.addressLine;
        this.city = anAddress.city;
        this.regionOrState = anAddress.regionOrState;
        this.zipOrPostCode = anAddress.zipOrPostCode;
        this.telecomAddress = new TelecomAddress(anAddress.telecomAddress);
    }

    //Accessors and Mutators

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

    public TelecomAddress getTelecomAddress(){
        return new TelecomAddress(this.telecomAddress);
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

    public void setTelecomAddress(TelecomAddress telecomAddress){
        TelecomAddress copyOfTelecomAddress = new TelecomAddress(telecomAddress);
        this.telecomAddress = copyOfTelecomAddress;
    }

    /** 
     * @return String
     */
    public String toString() {  //finish later
        return "The GENERAL DELIVERY ADDRESS:\n" + addressLine + ", " + city + ", " 
        + regionOrState + ", " + zipOrPostCode + ", " + telecomAddress.display() + " is valid from " 
        + validFrom + " to " + validTo;
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
            GeneralDeliveryAddress otherGeneralDeliveryAddress = (GeneralDeliveryAddress)otherAddress;
            return (validTo.equals(otherGeneralDeliveryAddress.validTo) && validFrom.equals(otherGeneralDeliveryAddress.validFrom) 
            && addressLine.equals(otherGeneralDeliveryAddress.addressLine) && city.equals(otherGeneralDeliveryAddress.city) &&
            regionOrState.equals(otherGeneralDeliveryAddress.regionOrState) && zipOrPostCode.equals(otherGeneralDeliveryAddress.zipOrPostCode) &&
            telecomAddress.equals(otherGeneralDeliveryAddress.telecomAddress)); // check that telecomAddress comparison works
        }
    }
}
