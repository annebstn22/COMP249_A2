package Locale;
public class Locale {
    protected String alphaCountryCode;      //protected or private???
    protected int numCountryCode;
    protected String countryName;

    public Locale() {
        alphaCountryCode = "";
        numCountryCode = 000;
        countryName = "";
    }

    public Locale(String alphaCountryCode, int numCountryCode, String countryName) {
        this.alphaCountryCode = alphaCountryCode; // check that only 2 letters
        this.numCountryCode = numCountryCode; // check that is 3 integers
        this.countryName = countryName; 
    }

    public Locale(Locale some_locale) {
        this(some_locale.alphaCountryCode, some_locale.numCountryCode, some_locale.countryName);
    }

    
    /** 
     * @return String
     */
    public String toString() {
        return (alphaCountryCode + " " + numCountryCode + " " + countryName);
    }

    
    /** 
     * @param otherObject
     * @return boolean
     */
    public boolean equals(Object otherObject) {
        if (otherObject == null)
            return false;

        String thisClass = getClass().toString(), otherClass = otherObject.getClass().toString(); 

        if (!thisClass.substring(6).equals(otherClass.substring(6))) 
            return false;
        else {
            Locale otherLocale = (Locale) otherObject;
            return (alphaCountryCode.equals(otherLocale.alphaCountryCode) && numCountryCode == otherLocale.numCountryCode && countryName.equals(otherLocale.countryName));
        }
    }
}