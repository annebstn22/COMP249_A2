package Locale;
public class Locale {
    private String alphaCountryCode;      //DOUBLE CHECK: protected or private attributes
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
        this.numCountryCode = numCountryCode; // check that is 3 integers 
        this.countryName = countryName; 
    }

    //Copy Constructor
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
     * @param locale
     * @return boolean
     */
    public boolean equals(Locale locale) {

        if (locale == null){
            return false;
        }

        String thisClass = getClass().toString(), otherClass = locale.getClass().toString(); 

        if (!thisClass.substring(6).equals(otherClass.substring(6))) 
            return false;
        else {
            Locale otherLocale = (Locale) locale;
            return (alphaCountryCode.equals(otherLocale.alphaCountryCode) && numCountryCode == otherLocale.numCountryCode && countryName.equals(otherLocale.countryName));
        }
    }
}