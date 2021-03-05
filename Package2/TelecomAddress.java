
package Package2;
import Package1.Address;

public class TelecomAddress extends Address {
    protected int countryCode;
    protected String nationalDialingPrefix; // would we maybe like it as a integer and but the parentheses in the toString();   ***instructions say to leave it as a String type
    protected int areaCode;
    protected long number;
    protected int extension;
    protected String physicalType;

    public TelecomAddress() {
        // super(); // don't believe is necessary  ***You're absolutely right! My bad...
        countryCode = 0;
        nationalDialingPrefix = "";
        areaCode = 0;
        number = 0;
        extension = 0;
        physicalType = "";
    }

    public TelecomAddress(String validTo, String validFrom, int countryCode, String nationalDialingPrefix, int areaCode, long number, int extension, String physicalType) {
        super(validTo, validFrom);
        this.countryCode =  countryCode;
        this.nationalDialingPrefix = nationalDialingPrefix;
        this.areaCode = areaCode;
        this.number = number;
        this.extension =  extension;
        this.physicalType = physicalType;
    }

    public TelecomAddress(TelecomAddress an_address) {
        this(an_address.validTo, an_address.validFrom, an_address.countryCode, an_address.nationalDialingPrefix, an_address.areaCode, an_address.number, an_address.extension, an_address.physicalType);
    }

    
    /** 
     * @param otherObject
     * @return String
     */
    public String toString(){ 
        return ("This telecom address +" + countryCode + " " + nationalDialingPrefix + areaCode + " " + number + " ext. " + extension + " " + physicalType + " is valid from " + validFrom + " to " + validTo + ".");
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
            TelecomAddress otherTelecomAddress = (TelecomAddress)otherObject;
            return (validTo.equals(otherTelecomAddress.validTo) && validFrom.equals(otherTelecomAddress.validFrom) && countryCode == otherTelecomAddress.countryCode && nationalDialingPrefix.equals(otherTelecomAddress.nationalDialingPrefix) && areaCode == otherTelecomAddress.areaCode && number == otherTelecomAddress.number && extension == otherTelecomAddress.extension && physicalType == otherTelecomAddress.physicalType);
        }
    }
}
