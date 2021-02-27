package Package2;

public class EmailAddress extends Address {
    private String userName;
    private String domainName;
    private String tld;

    public EmailAddress() {
        super();
        userName = "";
        domainName = "";
        tld = "";
    }

    public EmailAddress(int year, int month, int day, String userName, String domainName, String tld) {
        super(year, month, day);
        this.userName = userName;
        this.domainName = domainName;
        this.tld = tld;
    }

    public EmailAddress(EmailAddress someEmail) {
        this(someEmail.getYear(), someEmail.getMonth(), someEmail.getDay(), someEmail.userName, someEmail.domainName, someEmail.tld);
    }

    private int getYear() {
        return (super.year);
    }    
    
    private int getMonth() {
        return (super.year);
    }

    private int getDay() {
        return (super.year);
    }

    public String toString() {
        return (userName + "@" + domainName + "." + tld);
    }
}