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
    }

    public Address(Address someAddress) {
        this(someAddress.validTo, someAddress.validFrom);
    }

    public boolean traceObsoleteAddress(int year, int month, int day) {
        String date = Integer.toString(year) + "-" + Integer.toString(month) + "-" + Integer.toString(day);
        boolean obsolete = (validFrom.compareTo(date)<=0 && validTo.compareTo(date)>=0)? false:true;
        return obsolete;
    }

    public String toString() {
        return ("This address is valid from " + validFrom + " to " + validTo + " and is therefore " + (validDate ? "still usable today." : "no longer usable."));   //somehow incorporate the traceObsoleteAddress into each address class to make validDate variable usable 
    }

    public boolean equals(Object otherObject) {
        if (otherObject == null)
            return false;
        else if (getClass() != otherObject.getClass())
            return false;
        else {
            Address otherAddress = (Address) otherObject;
            return (validTo.equals(otherAddress.validTo) && validFrom.equals(otherAddress.validFrom));
        }
    }
}
