
package Package2;

public class WebPageAddress extends Address{
    private String domainName;
    private String resourceName;

    public WebPageAddress(String domainName, String resourceName){
        super();
        this.domainName = domainName;
        this.resourceName = resourceName; 
    }    

    public WebPageAddress(int year, int month, int day, String domainName, String resourceName){
        super(year, month, day);
        this.domainName = domainName;
        this.resourceName = resourceName;
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
}
