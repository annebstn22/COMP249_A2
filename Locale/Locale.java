// -----------------------------------------------------------------------------
// Part: 1
// Written by: Anne Bastien 40133471 and Alexandra Spyridakos 40175280
// -----------------------------------------------------------------------------

package Locale;
public class Locale {
    private String alphaCountryCode;
    private int numCountryCode;
    private String countryName;

    //Default Constructor
    public Locale() {
        alphaCountryCode = "UN";
        numCountryCode = 000;
        countryName = "Unknown";
    }

    //Parameterized Constructor
    public Locale(String alphaCountryCode, int numCountryCode, String countryName) {
        this.alphaCountryCode = alphaCountryCode.substring(0, 2); 
        this.numCountryCode = numCountryCode; // check that its 3 integers 
        this.countryName = countryName; 
    }

    //Copy Constructor
    public Locale(Locale some_locale) {
        this(some_locale.alphaCountryCode, some_locale.numCountryCode, some_locale.countryName);
    }
    
    /** 
     * Converts object attributes to a printable String format
     * @return String
     */
    public String toString() {
        return (alphaCountryCode + " " + numCountryCode + " " + countryName);
    }
    
    /** Checks equality of objects
     * @param locale of type Locale
     * @return boolean
     */
    public boolean equals(Locale locale) {
        if (locale == null)
            return false;

        String thisClass = getClass().toString(), otherClass = locale.getClass().toString(); 

        if (!thisClass.substring(6).equals(otherClass.substring(6))) 
            return false;
        else {
            Locale otherLocale = (Locale) locale;
            return (alphaCountryCode.equals(otherLocale.alphaCountryCode) && numCountryCode == otherLocale.numCountryCode && countryName.equals(otherLocale.countryName));
        }
    }
    
    //Accessors and Mutators
    public String getAlphaCountryCode(){
        return alphaCountryCode;
    }       

    public int getNumCountryCode(){
        return numCountryCode;
    }

    public String getCountryName() {
        return countryName; 
    }
    
    public void setAlphaCountryCode(String alphaCountryCode){
        this.alphaCountryCode = alphaCountryCode;
    }       

    public void setNumCountryCode(int numCountryCode){
        this.numCountryCode = numCountryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName; 
    }

}
