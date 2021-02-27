public class Locale {
    public String alphaCountryCode;
    public int numCountryCode;
    public String countryName;

    public Locale() {
        alphaCountryCode = "";
        numCountryCode = 0;
        countryName = "";
    }

    public Locale(String alphaCountryCode, int numCountryCode, String countryName) {
        this.alphaCountryCode = alphaCountryCode;
        this.numCountryCode = numCountryCode;
        this.countryName = countryName;
    }

    public Locale(Locale some_locale) {
        this.alphaCountryCode = some_locale.alphaCountryCode;
        this.numCountryCode = some_locale.numCountryCode;
        this.countryName = some_locale.countryName;
    }

    public String toString() {
        return (alphaCountryCode + " " + numCountryCode + " " + countryName);
    }
}