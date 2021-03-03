import Package1.Address; 
import Package2.*;
import Package3.*;

public class driver {
	public static void main(String[] args) {
        Address a1 = new Address();
        //Address a2 = new Address(2015, 05, 01);
        Address a3 = new Address();
        EmailAddress em1 = new EmailAddress("2022-12-20", "2021-11-30", "kingscross", "warnerbros", "com");
        //TelecomAddress tel1 = new TelecomAddress("2001-09-24", "1999-01-20", countryCode, nationalDialingPrefix, areaCode, number, extension, physicalType)
        //GeneralDeliveryAddress genD1 = new GeneralDeliveryAddress(validTo, validFrom, countryCode, nationalDialingPrefix, areaCode, number, extension, physicalType, addressLine, city, regionOrState, zipOrPostCode)
        System.out.println(em1); // just to test
        //WebPageAddress obj = 
        Address[] arr = {a1, a3, em1};


        traceObsoleteAddress(arr, 2004, 03, 21);
    }

    public static void traceObsoleteAddress(Address[] arr, int year, int month, int day) {
        String date = Integer.toString(year) + "-" + Integer.toString(month) + "-" + Integer.toString(day);
        
        /* System.out.println("The following addresses are obsolete in relation to " + date);
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            boolean obsolete = (arr[i].getValidFrom().compareTo(date)<=0 && arr[i].getValidTo().compareTo(date)>=0)? false:true; // wouldn't it be or || and is this the correct way to compare?
            if (obsolete){
                System.out.println(arr[i] + " is obsolete."); // check if prints the correct toString method.
            } else {
                count ++;
            }
        }

        if (count == 0){
            System.out.println("No match found.");
        } */

        boolean obsolete = true;
        for (int i=0; i<arr.length; i++){
            obsolete = (arr[i].getValidFrom().compareTo(date)<=0 && arr[i].getValidTo().compareTo(date)>=0)? false:true;
            System.out.println(obsolete? arr[i] + " is obsolete.": arr[i] + " is valid.");
        }
    }
}