
package Package2;
import Package1.Address;

public class WebPageAddress extends Address{
    private String domainName;
    private String resourceName;

    public WebPageAddress(){
        // super();
        domainName = "domain-name";
        resourceName = "";
    }

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
    
    
    /** 
     * @param otherObject
     * @return String
     */
    public String toString() {
        return ("This web page address www." + domainName + "/" + resourceName + " is valid from " + validFrom + " to " + validTo + ".");
    }

    
    /** 
     * @param otherObject
     * @return boolean
     */
    public boolean equals(Address otherObject) {
        if (otherObject == null)
            return false;

        String thisClass = getClass().toString(), otherClass = otherObject.getClass().toString(); 

        if (!thisClass.substring(6).equals(otherClass.substring(6))) 
            return false;

        else {
            WebPageAddress otherWebPageAddress = (WebPageAddress)otherObject;
            return (validTo.equals(otherWebPageAddress.validTo) && validFrom.equals(otherWebPageAddress.validFrom) && domainName.equals(otherWebPageAddress.domainName) && resourceName.equals(otherWebPageAddress.resourceName));
        }
    }

    //accessor methods // shouldn't these all be public?   ***Depends on where they are needed, if its used as an internal method then private is fine, otherwise we should change them to public.
   /*private String getDomainName(){
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
    }*/
}
