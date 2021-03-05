package Package1;

public class Address {
    protected String validFrom;
    protected String validTo;

    //Default Constructor
    public Address() {
        validFrom = "0000-00-00"; 
        validTo = "0000-00-00"; 
        
    }

    //Parameterized Constructor
    public Address(String validFrom, String validTo) {

        // Assign earliest date to validFrom and furthese date to validTo

        if (checkValidDateOrder(validFrom, validTo)){
            this.validFrom = validFrom;
            this.validTo = validTo; 
        } else {
            this.validFrom = validTo;
            this.validTo = validFrom; 
        }
        
        
    }

    //Copy Constructor
    public Address(Address someAddress) {
        this(someAddress.validFrom, someAddress.validTo);
    }

    /** 
     * @return String
     */
    public String toString() {
        return ("This address is valid from " + validFrom + " to " + validTo);
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
            // Address otherAddress = (Address) otherObject; // Not necessary I believe? since can't have EmailAddress = new Address()
            return (validTo.equals(otherAddress.validTo) && validFrom.equals(otherAddress.validFrom));
        }
    }

    //Accessors and Mutators

    /** 
     * @return String validFrom
     */

    public String getValidFrom(){
        return validFrom;
    }

    public void setValidFrom(String validFrom){
        this.validFrom = validFrom;
    }
    
    /** 
     * @return String validTo
     */
    public String getValidTo(){
        return validTo;
    }

    public void setValidTo(String validTo){
        this.validTo = validTo;
    }

    //Check if validFrom <= ValidTo
    public boolean checkValidDateOrder(String validFrom, String validTo){
        if (validFrom.compareTo(validTo)<=0){
            return true;
        } else {
            return false;
        }
    }
}
