
package Package2;

public class WebPageAddress extends Package1.Address{
    private String domainName;
    private String resourceName;

    public WebPageAddress(String domainName, String resourceName){
        super();
        this.domainName = domainName;
        this.resourceName = resourceName; 
    }    

    public WebPageAddress(String validTo, String validFrom, String domainName, String resourceName){
        super(validTo, validFrom);
        this.domainName = domainName;
        this.resourceName = resourceName;
    }  
    
    public String toString() {  //finish later
        return ("");
    }

    public boolean equals(Object otherObject) {
        if (otherObject == null)
            return false;
        else if (getClass()!= otherObject.getClass())
            return false;
        else {
            WebPageAddress otherWebPageAddress = (WebPageAddress)otherObject;
            return (validTo.equals(otherWebPageAddress.validTo) && validFrom.equals(otherWebPageAddress.validFrom) && domainName.equals(otherWebPageAddress.domainName) && resourceName.equals(otherWebPageAddress.resourceName));
        }
    }

    //accessor methods
    private String getDomainName(){
        return domainName;
    }

    private String getResourceName(){
        return resourceName;
    }

    private String getValidTo() {
        return validTo;
    }

    private String getValidFrom() {
        return validFrom;
    }

    //mutator methods
    private void setDomainName(String domainName){
        this.domainName = domainName;
    }

    private void setResourceName(String resourceName){
        this.resourceName = resourceName;
    }

    private void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    private void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }
}