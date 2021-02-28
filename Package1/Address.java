package Package1;

public class Address {
    protected String validFrom;
    protected String validTo;

    public Address() {
        validFrom = ""; //some default dates
        validTo = "";   //some default dates
    } 

    public Address(int year, int month, int day) {
        String date = Integer.toString(year) + "-" + Integer.toString(month) + "-" + Integer.toString(day);
        validFrom = date;
        validTo = date;     //not sure if i'm understanding the instructions correctly... is this supposed to be taken from the contructor parameters or from some default class constant?
    }

    public Address(Address some_address) {
        this.validFrom = some_address.validFrom;
        this.validTo = some_address.validTo;
    }

}
