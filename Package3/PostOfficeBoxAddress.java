// -----------------------------------------------------------------------------
// Part: 1
// Written by: Anne Bastien 40133471 and Alexandra Spyridakos 40175280
// -----------------------------------------------------------------------------

package Package3;

import Locale.Locale;
import Package1.Address;

public class PostOfficeBoxAddress extends GeographicAddress{

    private int boxLobbyDoorCode;

    //Default Constructor
    public PostOfficeBoxAddress() {
        addressLine = "address";
        city = "city";
        regionOrState = "region/state";
        zipOrPostCode = "zip/postcode";
        boxLobbyDoorCode = 000;
        loc = new Locale();
    }
    
    //Parameterized Constructor
    public PostOfficeBoxAddress(String validFrom, String validTo, String addressLine, String city, String regionOrState, String zipOrPostCode, Locale loc1, int boxLobbyDoorCode) {
        super(validFrom, validTo, addressLine, city, regionOrState, zipOrPostCode, loc1); // incorrect way to implement? Address object will be built theoretically before this line no?
        this.boxLobbyDoorCode = boxLobbyDoorCode;
    }

    //Copy Constructor
    public PostOfficeBoxAddress(PostOfficeBoxAddress someBox) {
        this(someBox.validTo, someBox.validFrom, someBox.addressLine, someBox.city, someBox.regionOrState, someBox.zipOrPostCode, someBox.loc, someBox.boxLobbyDoorCode);
    }
    
    /** Converts object attributes to a printable String format
     * @return String
     */
    public String toString() {
        return ("This P.O. BOX ADDRESS:\n" + addressLine + ", " + city + ", " 
        + regionOrState + ".\n" + zipOrPostCode + "\n" + loc 
        + ".\nWith box pin: " + boxLobbyDoorCode + "\nis valid from " + validFrom + " to " + validTo);
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
            PostOfficeBoxAddress otherPostOfficeBoxAddress = (PostOfficeBoxAddress)otherAddress;
            return (validTo.equals(otherPostOfficeBoxAddress.validTo) && validFrom.equals(otherPostOfficeBoxAddress.validFrom) && addressLine.equals(otherPostOfficeBoxAddress.addressLine) && city.equals(otherPostOfficeBoxAddress.city) && city.equals(otherPostOfficeBoxAddress.city) && zipOrPostCode.equals(otherPostOfficeBoxAddress.zipOrPostCode) && loc.equals(otherPostOfficeBoxAddress.loc) && boxLobbyDoorCode == otherPostOfficeBoxAddress.boxLobbyDoorCode);
        }
    }
}
