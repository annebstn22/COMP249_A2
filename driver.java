import java.Package1.Address; 
import java.Package2.*;

public class driver {
    public void traceObsoleteAddress(Address[] arr, int year, int month, int day) {
        String date = Integer.toString(year) + "-" + Integer.toString(month) + "-" + Integer.toString(day);
        boolean obsolete = true;
        for (int i=0; i<arr.length; i++){
            obsolete = (arr[i].validFrom.compareTo(date)<=0 && arr[i].validTo.compareTo(date)>=0)? false:true;
            System.out.println(obsolete? "This address is obsolete.":"This address is valid.");
        }
    }
	public static void main(String[] args) {
        Address address1 = new Address();
        Address address2 = new Address(2015, 05, 01);
        Address address3 = new Address();
        WebPageAddress obj = 
        Object arr = {};


        System.out.println(traceObsoleteAddress(arr, 2004, 03, 21));
    }
}