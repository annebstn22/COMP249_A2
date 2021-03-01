
package Package2;

public class TelecomAddress extends Package1.Address {
    protected int countryCode;
    protected String nationalDialingPrefix;
    protected int areaCode;
    protected long number;
    protected int extension;
    protected String physicalType;

    public TelecomAddress() {
        super();
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

    public String toString(){   //fix to correct formatting later
        return ("+" + countryCode + " " + nationalDialingPrefix + areaCode + " " + number + " ext. " + extension + " " + physicalType);
    }

    public boolean equals(Object otherObject) {
        if (otherObject == null)
            return false;
        else if (getClass()!= otherObject.getClass())
            return false;
        else {
            TelecomAddress otherTelecomAddress = (TelecomAddress)otherObject;
            return (validTo.equals(otherTelecomAddress.validTo) && validFrom.equals(otherTelecomAddress.validFrom) && countryCode == otherTelecomAddress.countryCode && nationalDialingPrefix.equals(otherTelecomAddress.nationalDialingPrefix) && areaCode == otherTelecomAddress.areaCode && number == otherTelecomAddress.number && extension == otherTelecomAddress.extension && physicalType == otherTelecomAddress.physicalType);
        }
    }
}
