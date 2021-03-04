package Package3;

import Locale.Locale;
import Package1.Address;

public class PostOfficeBoxAddress extends Address{
    private String addressLine;
    private String city;
    private String regionOrState;
    private String zipOrPostCode;
    private Locale loc;
    private int boxLobbyDoorCode;

    public PostOfficeBoxAddress() {
        super();
        addressLine = "";
        city = "";
        regionOrState = "";
        zipOrPostCode = "";
        loc = new Locale();
    }
    
    public PostOfficeBoxAddress(String validTo, String validFrom, String addressLine, String city, String regionOrState, String zipOrPostCode, Locale loc1) {
        super(validTo, validFrom);
        this.addressLine = addressLine;
        this.city = city;
        this.regionOrState = regionOrState;
        this.zipOrPostCode = zipOrPostCode;
        loc = new Locale(loc1);
    }

    public PostOfficeBoxAddress(PostOfficeBoxAddress someBox) {
        this(someBox.validTo, someBox.validFrom, someBox.addressLine, someBox.city, someBox.regionOrState, someBox.zipOrPostCode, someBox.loc);
    }

    public String toString() {
        return ("This P.O. Box address is " + addressLine + ", " + city + ", " + regionOrState + ".\n" + zipOrPostCode + "\n" + loc + ".\nBox pin is " + boxLobbyDoorCode);
    }

    public boolean equals(Address otherObject) {
        if (otherObject == null)
            return false;

        String thisClass = getClass().toString(), otherClass = otherObject.getClass().toString(); 

        if (!thisClass.substring(6).equals(otherClass.substring(6))) 
            return false;
        else {
            PostOfficeBoxAddress otherPostOfficeBoxAddress = (PostOfficeBoxAddress)otherObject;
            return (validTo.equals(otherPostOfficeBoxAddress.validTo) && validFrom.equals(otherPostOfficeBoxAddress.validFrom) && addressLine.equals(otherPostOfficeBoxAddress.addressLine) && city.equals(otherPostOfficeBoxAddress.city) && city.equals(otherPostOfficeBoxAddress.city) && zipOrPostCode.equals(otherPostOfficeBoxAddress.zipOrPostCode) && loc.equals(otherPostOfficeBoxAddress.loc) && boxLobbyDoorCode == otherPostOfficeBoxAddress.boxLobbyDoorCode);
        }
    }
}
