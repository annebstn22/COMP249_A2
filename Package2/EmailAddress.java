package Package2;
import Package1.Address;

public class EmailAddress extends Package1.Address {
    private String userName;
    private String domainName;
    private String tld;

    public EmailAddress() {
        super(); //isn't this done automatically? for default constructor of super
        userName = "";
        domainName = "";
        tld = "";
    }

    public EmailAddress(String validTo, String validFrom, String userName, String domainName, String tld) {
        super(validTo, validFrom);
        this.userName = userName;
        this.domainName = domainName;
        this.tld = tld;
    }

    public EmailAddress(EmailAddress someEmail) {
        this(someEmail.validTo, someEmail.validFrom, someEmail.userName, someEmail.domainName, someEmail.tld);
    }

    public String toString() {  //fix to correct formatting later
        return (userName + "@" + domainName + "." + tld);
    }

    public boolean equals(Address otherObject) { 
        
        if (otherObject == null)
            return false;
        
        String thisClass = getClass().toString(), otherClass = otherObject.getClass().toString(); 
        if (!thisClass.substring(6).equals(otherClass.substring(6)))
            return false;
        else {
            EmailAddress otherEmailAddress = (EmailAddress)otherObject;
            return (validTo.equals(otherEmailAddress.validTo) && validFrom.equals(otherEmailAddress.validFrom) && userName.equals(otherEmailAddress.userName) && domainName.equals(otherEmailAddress.domainName) && tld.equals(otherEmailAddress.tld));
        }
    }
}