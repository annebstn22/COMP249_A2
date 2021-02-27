// import package.Address.Address;  //import required???
package Package2;

public class TelecomAddress extends Address {
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

    public TelecomAddress(int year, int month, int day, int countryCode, String nationalDialingPrefix, int areaCode, long number, int extension, String physicalType) {
        super(year, month, day);
        this.countryCode =  countryCode;
        this.nationalDialingPrefix = nationalDialingPrefix;
        this.areaCode = areaCode;
        this.number = number;
        this.extension =  extension;
        this.physicalType = physicalType;
    }

    public TelecomAddress(TelecomAddress an_address) {
        this(an_address.getYear(), an_address.getMonth(), an_address.getDay(), an_address.countryCode, an_address.nationalDialingPrefix, an_address.areaCode, an_address.number, an_address.extension, an_address.physicalType);
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

    public String toString(){
        return ("+" + countryCode + " " + nationalDialingPrefix + areaCode + " " + number + " ext. " + extension + " " + physicalType);
    }
}
