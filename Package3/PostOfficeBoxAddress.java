package Package3;

public class PostOfficeBoxAddress extends Address{
    private String addressLine;
    private String city;
    private String regionOrState;
    private String zipOrPostCode;
    private Locale loc = new Locale();
    private int boxLobbyDoorCode;

    public PostOfficeBoxAddress() {
        super();
        addressLine = "";
        city = "";
        regionOrState = "";
        zipOrPostCode = "";
        //add loc
    }
    
    public PostOfficeBoxAddress(int year, int month, int day, String addressLine, String city, String regionOrState, String zipOrPostCode, Locale loc) {
        super(year, month, day);
        this.addressLine = addressLine;
        this.city = city;
        this.regionOrState = regionOrState;
        this.zipOrPostCode = zipOrPostCode;
        //add loc
    }

    public PostOfficeBoxAddress(PostOfficeBoxAddress someBox) {
        // change to this(param1, param2, ...) format
        this.addressLine = someBox.addressLine;
        this.city = someBox.city;
        this.regionOrState = someBox.regionOrState;
        this.zipOrPostCode = someBox.zipOrPostCode;
        this.loc = Locale(someBox.loc);     //fix, doesn't make sense. Both variables cannot have the same name
    }

    public String toString() {
        return ("This P.O. Box address is " + addressLine + ", " + city + ", " + regionOrState + ".\n" + zipOrPostCode + "\n" + loc + ".\nBox pin is " + boxLobbyDoorCode);
    }
}
