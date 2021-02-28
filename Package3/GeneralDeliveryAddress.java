package Package3;

public class GeneralDeliveryAddress extends TelecomAddress {
    private String addressLine;
    private String city;
    private String regionOrState;
    private String zipOrPostCode;

    private GeneralDeliveryAddress() {
        super();
        addressLine = "";
        city = "";
        regionOrState = "";
        zipOrPostCode = "";
    }

    private GeneralDeliveryAddress(int year, int month, int day, String addressLine, String city, String regionOrState, String zipOrPostCode) {
        super(year, month, day);
        this.addressLine = addressLine;
        this.city = city;
        this.regionOrState = regionOrState;
        this.zipOrPostCode = zipOrPostCode;
    }

    private GeneralDeliveryAddress(GeneralDeliveryAddress an_address) {
        this(super.getYear(), super.getMonth(), super.getDay(), an_address.addressLine, an_address.city, an_address.regionOrState, an_address.zipOrPostCode);
    }

    private int getYear() {
        return (super.year);
    }    
    
    private int getMonth() {
        return (super.month);
    }

    private int getDay() {
        return (super.day);
    }
}
