package Package3;

import Package2.TelecomAddress;
import Package1.Address;

public class GeneralDeliveryAddress extends TelecomAddress { // I don't believe a generalDeliveryAddress is a TelecomAddress. We could add an attribute instead that is of type telecomAddress
    private String addressLine;
    private String city;
    private String regionOrState;
    private String zipOrPostCode;
    private TelecomAddress telecomAddress; // 

    public GeneralDeliveryAddress() {
        super();
        addressLine = "";
        city = "";
        regionOrState = "";
        zipOrPostCode = "";
    }

    public GeneralDeliveryAddress(String validTo, String validFrom, int countryCode, String nationalDialingPrefix, int areaCode, long number, int extension, String physicalType, String addressLine, String city, String regionOrState, String zipOrPostCode) {
        super(validTo, validFrom, countryCode, nationalDialingPrefix, areaCode, number, extension, physicalType);
        //this.telecomAddress = new TelecomAddress(validTo, validFrom, countryCode, nationalDialingPrefix, areaCode, number, extension, physicalType);
        this.addressLine = addressLine;
        this.city = city;
        this.regionOrState = regionOrState;
        this.zipOrPostCode = zipOrPostCode;
    }

    public GeneralDeliveryAddress(GeneralDeliveryAddress an_address) {
        this(an_address.validTo, an_address.validFrom,an_address.countryCode, an_address.nationalDialingPrefix, an_address.areaCode, an_address.number, an_address.extension, an_address.physicalType, an_address.addressLine, an_address.city, an_address.regionOrState, an_address.zipOrPostCode);
    }

    public String toString() {  //finish later
        return "This general delivery address " + addressLine + ", " + city + ", " 
        + regionOrState + ", " + zipOrPostCode + ", " + telecomAddress + " is valid from " 
        + validFrom + " to " + validTo + " and therefore ";
    }

    public boolean equals(Address otherObject) {
        if (otherObject == null)
            return false;

        String thisClass = getClass().toString(), otherClass = otherObject.getClass().toString(); 

        if (!thisClass.substring(6).equals(otherClass.substring(6))) 
            return false;

        else {
            GeneralDeliveryAddress otherGeneralDeliveryAddress = (GeneralDeliveryAddress)otherObject;
            return (validTo.equals(otherGeneralDeliveryAddress.validTo) && validFrom.equals(otherGeneralDeliveryAddress.validFrom) && countryCode == otherGeneralDeliveryAddress.countryCode && nationalDialingPrefix.equals(otherGeneralDeliveryAddress.nationalDialingPrefix) && areaCode == otherGeneralDeliveryAddress.areaCode && number == otherGeneralDeliveryAddress.number && extension == otherGeneralDeliveryAddress.extension && physicalType == otherGeneralDeliveryAddress.physicalType && addressLine.equals(otherGeneralDeliveryAddress.addressLine) && city.equals(otherGeneralDeliveryAddress.city) && regionOrState.equals(otherGeneralDeliveryAddress.regionOrState) && zipOrPostCode.equals(otherGeneralDeliveryAddress.zipOrPostCode));
        }
    }
}
