package Locale;
public class Locale {
    public String alphaCountryCode; // why are they public?
    public int numCountryCode;
    public String countryName;

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

    public String toString() {
        return (alphaCountryCode + " " + numCountryCode + " " + countryName);
    }

    public boolean equals(Object otherObject) {
        if (otherObject == null)
            return false;
        else if (getClass() != otherObject.getClass()) //check with substring
            return false;
        else {
            Locale otherLocale = (Locale) otherObject;
            return (alphaCountryCode.equals(otherLocale.alphaCountryCode) && numCountryCode == otherLocale.numCountryCode && countryName.equals(otherLocale.countryName));
        }
    }
}