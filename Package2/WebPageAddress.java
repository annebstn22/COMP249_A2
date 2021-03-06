// -----------------------------------------------------------------------------
// Part: 1
// Written by: Anne Bastien 40133471 and Alexandra Spyridakos 40175280
// -----------------------------------------------------------------------------

package Package2;
import Package1.Address;

public class WebPageAddress extends Address{
    private String domainName;
    private String resourceName;

    //Default Constructor
    public WebPageAddress(){
        domainName = "domain-name";
        resourceName = "";
    }

    // They wanted parameterized constructors to have a parameterized constructor - to change or remove?
    public WebPageAddress(String domainName, String resourceName){
        //super();
        domainNameMandatory(domainName);
        this.resourceName = resourceName; 
    }    

    //Parameterized Constructor
    public WebPageAddress(String validFrom, String validTo, String domainName, String resourceName){
        super(validFrom, validTo);
        domainNameMandatory(domainName);
        this.resourceName = resourceName;
    }  

    //Copy Constructor
    public WebPageAddress(WebPageAddress otherWebPageAddress){
        this(otherWebPageAddress.validFrom, otherWebPageAddress.validTo, otherWebPageAddress.domainName, otherWebPageAddress.resourceName);
    }
    
    
    /** Converts object attributes to a printable String format
     * @return String
     */
    public String toString() {
        return ("The WEB PAGE ADDRESS:\nwww." + domainName + "/" + resourceName + " is valid from " + validFrom + " to " + validTo);
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
            WebPageAddress otherWebPageAddress = (WebPageAddress) otherAddress;
            return (validTo.equals(otherWebPageAddress.validTo) && validFrom.equals(otherWebPageAddress.validFrom) && domainName.equals(otherWebPageAddress.domainName) && resourceName.equals(otherWebPageAddress.resourceName));
        }
    }

    public void domainNameMandatory(String domainName){
        if (domainName.isEmpty()){
            this.domainName = "unknown-domain-name";
        } 
        else {
            this.domainName = domainName;
        }
    }

    //Accessors and Mutators
    public String getDomainName(){
        return domainName;
    }

    public String getResourceName(){
        return resourceName;
    }

    public String getValidTo() {
        return validTo;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setDomainName(String domainName){
        this.domainName = domainName;
    }

    public void setResourceName(String resourceName){
        this.resourceName = resourceName;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }
}
