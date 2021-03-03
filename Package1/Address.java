package Package1;

public class Address {
    protected String validFrom;
    protected String validTo;
    protected boolean validDate;

    public Address() {
        validFrom = "0000-00-00"; // some default dates
        validTo = "0000-00-00"; // some default dates
    }

    public Address(String validTo, String validFrom) {
        this.validTo = validTo;
        this.validFrom = validFrom;
        // Should check that inputted address is valid i.e month = 13 not valid
        // Check that ValidTo is greater than or equal to validFrom
    }

    public Address(Address someAddress) {
        this(someAddress.validTo, someAddress.validFrom);
    }

    public Boolean traceObsoleteAddress(int year, int month, int day) { // shouldn't this method be only in the driver?
        String date = Integer.toString(year) + "-" + Integer.toString(month) + "-" + Integer.toString(day);

        boolean obsolete = (validFrom.compareTo(date)<=0 && validTo.compareTo(date)>=0)? false:true; // wouldn't it be or || and is this the correct way to compare?
        
        return obsolete;
    }

    //don't understand how we are able to know the date of "today" - ask user at start?
    public String toString() {
        return ("This address is valid from " + validFrom + " to " + validTo + " and is therefore " + (validDate ? "still usable today." : "no longer usable."));   //somehow incorporate the traceObsoleteAddress into each address class to make validDate variable usable 
    } 

    public boolean equals(Address otherObject) {
        
        if (otherObject == null)
            return false;

        String thisClass = getClass().toString(), otherClass = otherObject.getClass().toString();
        
        if (!thisClass.substring(6).equals(otherClass.substring(6))) 
            return false;
        else {
            Address otherAddress = (Address) otherObject;
            return (validTo.equals(otherAddress.validTo) && validFrom.equals(otherAddress.validFrom));
        }
    }

    //Accessors

    public String getValidFrom(){
        return validFrom;
    }

    public String getValidTo(){
        return validTo;
    }
}
