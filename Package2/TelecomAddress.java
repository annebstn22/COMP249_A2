// -----------------------------------------------------------------------------
// Part: 1
// Written by: Anne Bastien 40133471 and Alexandra Spyridakos 40175280
// -----------------------------------------------------------------------------

package Package2;
import Package1.Address;

public class TelecomAddress extends Address {
    private int countryCode;
    private String nationalDialingPrefix;
    private int areaCode;
    private long number;
    private int extension;
    private String physicalType;

    //Default Constructor
    public TelecomAddress() {
        countryCode = 0;
        nationalDialingPrefix = "(0)";
        areaCode = 0;
        number = 00000000;
        extension = 000;
        physicalType = "type-unknown";
    }

    //Parameterized Constructor
    public TelecomAddress(String validFrom, String validTo, int countryCode, String nationalDialingPrefix, int areaCode, long number, int extension, String physicalType) {
        super(validFrom, validTo);
        this.countryCode =  countryCode;
        this.nationalDialingPrefix = nationalDialingPrefix;
        this.areaCode = areaCode;
        this.number = number;
        this.extension =  extension;
        this.physicalType = physicalType;
    }

    //Copy Constructor
    public TelecomAddress(TelecomAddress an_address) {
        this(an_address.validFrom, an_address.validTo, an_address.countryCode, an_address.nationalDialingPrefix, an_address.areaCode, an_address.number, an_address.extension, an_address.physicalType);
    }

    
    /** Converts object attributes to a printable String format
     * @return String
     */
    public String toString(){ 
        return ("The TELECOM ADDRESS:\n" + "+" + countryCode + " " + nationalDialingPrefix + areaCode + " " + number + " ext. " + extension + " " + physicalType + " is valid from " + validFrom + " to " + validTo);
    }

    public String display(){
        return (countryCode + " " + nationalDialingPrefix + areaCode + " " + number + " ext. " + extension + " " + physicalType);
    }
    
    /** Checks equality of objects
     * @param otherObject of type Address
     * @return boolean
     */
    public boolean equals(Address otherAddress) {
        if (otherAddress == null)
            return false;

        String thisClass = getClass().toString(), otherClass = otherAddress.getClass().toString(); 

        if (!thisClass.substring(6).equals(otherClass.substring(6))) 
            return false;
        else {
            TelecomAddress otherTelecomAddress = (TelecomAddress)otherAddress;
            return (validTo.equals(otherTelecomAddress.validTo) && validFrom.equals(otherTelecomAddress.validFrom) && countryCode == otherTelecomAddress.countryCode && nationalDialingPrefix.equals(otherTelecomAddress.nationalDialingPrefix) && areaCode == otherTelecomAddress.areaCode && number == otherTelecomAddress.number && extension == otherTelecomAddress.extension && physicalType.equals(otherTelecomAddress.physicalType));
        }
    }

    //Accessors and Mutators
    public void setCountryCode(int countryCode){
        this.countryCode =  countryCode;
    }

    public void setNationalDialingPrefix(String nationalDialingPrefix){
        this.nationalDialingPrefix = nationalDialingPrefix;
    }

    public void setAreaCode(int areaCode){
        this.areaCode = areaCode;
    }
   
    public void setNumber(long number){
        this.number = number;
    }

    public void setExtension(int extension){
        this.extension =  extension;
    }

    public void setPhysicalType(String physicalType){
        this.physicalType = physicalType;
    }

    public int getCountryCode(){
        return countryCode;
    }

    public String getNationalDialingPrefix(){
        return nationalDialingPrefix;
    }

    public int getAreaCode(){
        return areaCode;
    }
   
    public long getNumber(){
        return number;
    }

    public int getExtension(){
        return extension;
    }

    public String getPhysicalType(){
        return physicalType;
    }
}
