package Package2;
import Package1.Address;

public class EmailAddress extends Address {
    private String userName;
    private String domainName;
    private String tld;

    public EmailAddress() {
        userName = "user-name";
        domainName = "domain-name";
        tld = "com";
    }

    public EmailAddress(String validFrom, String validTo, String userName, String domainName, String tld) {
        super(validFrom, validTo);
        this.userName = userName;
        this.domainName = domainName;
        this.tld = tld;
    }

    public EmailAddress(EmailAddress someEmail) {
        this(someEmail.validFrom, someEmail.validTo, someEmail.userName, someEmail.domainName, someEmail.tld);
    }

    
    /** 
     * @return String
     */
    public String toString() {  //fix to correct formatting later
        return ("The EMAIL ADDRESS:\n" + userName + "@" + domainName + "." + tld + " is valid from " + validFrom + " to " + validTo);
    }

    
    /** 
     * @param otherAddress
     * @return boolean
     */
    public boolean equals(Address otherAddress) { 

        if (otherAddress == null){
            return false;
        }

        String thisClass = getClass().toString(), otherClass = otherAddress.getClass().toString(); 
        if (!thisClass.substring(6).equals(otherClass.substring(6)))
            return false;
        else {
            EmailAddress otherEmailAddress = (EmailAddress) otherAddress;
            return (validTo.equals(otherEmailAddress.validTo) && validFrom.equals(otherEmailAddress.validFrom) && userName.equals(otherEmailAddress.userName) && domainName.equals(otherEmailAddress.domainName) && tld.equals(otherEmailAddress.tld));
        }
    }
}