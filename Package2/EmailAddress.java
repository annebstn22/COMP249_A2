package Package2;

public class EmailAddress extends Package1.Address {
    private String userName;
    private String domainName;
    private String tld;

    public EmailAddress() {
        super();
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

    public boolean equals(Object otherObject) {
        if (otherObject == null)
            return false;
        else if (getClass()!= otherObject.getClass())
            return false;
        else {
            EmailAddress otherEmailAddress = (EmailAddress)otherObject;
            return (validTo.equals(otherEmailAddress.validTo) && validFrom.equals(otherEmailAddress.validFrom) && userName.equals(otherEmailAddress.userName) && domainName.equals(otherEmailAddress.domainName) && tld.equals(otherEmailAddress.tdl));
        }
    }
}