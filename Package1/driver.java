package Package1;
import Package2.*;
import Package3.*;
import Locale.Locale;

public class driver {
    
    /** 
     * @param arr
     */
    public static void copyAddresses(Address[] arr) {
        Address[] arr_copy = new Address[arr.length];
        for (int i=0; i<arr.length; i++) {
            arr_copy[i] = new Address(arr[i]);  
            System.out.println(arr_copy[i]);    
        }
    }

	
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Locale loc1 = new Locale ("CA", 124, "Canada");
        Locale loc2 = new Locale();


        WebPageAddress web1 = new WebPageAddress ("2000-12-20", "1980-04-13", "", ""); //Testing that if wrong order, still works;
        EmailAddress em1 = new EmailAddress("2002-12-20", "2021-11-30", "kingscross", "warnerbros", "com");
        TelecomAddress telec1 = new TelecomAddress("2005-06-27", "2018-05-14", 1, "(0)", 450, 6892347, 122, "mobile");
        GeographicAddress geo1 = new GeographicAddress("2013-02-11", "2013-03-24", "1034 martian Rd", "Olympus", "Mars", "K2W M4R", loc1);
        PostOfficeBoxAddress postOff1 = new PostOfficeBoxAddress("1989-08-16", "1989-08-16", "23 BobRoss Rd", "Netflix City", "New York", "T75 7V4", loc1, 282);
        GeneralDeliveryAddress genD1 = new GeneralDeliveryAddress("2004-10-21", "2100-03-03", "145 Wolfe Crescent", "PineCity", "Colorado", "M8Y 3R5", telec1);
        GeographicAddress genD2 = new PostOfficeBoxAddress("1989-08-16", "1989-08-16", "23 BobRoss Rd", "Netflix City", "New York", "T75 7V4", loc1, 282);
        Address a1 = new PostOfficeBoxAddress("1989-08-16", "1989-08-16", "23 BobRoss Rd", "Netflix City", "New York", "T75 7V4", loc1, 282);
        WebPageAddress web2 = new WebPageAddress (web1);
        PostOfficeBoxAddress postOff2;
        //ADD more addresses - try complicated or tricky cases (such as genD2)

        if (postOff1.equals(genD2)){
            System.out.println("\n====They are equal====\n");
        } else {
            System.out.println("\n====They are NOT equal====\n");
        }

        if (genD2.equals(postOff1)){
            System.out.println("\n====They are equal====\n");
        } else {
            System.out.println("\n====They are NOT equal====\n");
        }

        if (postOff1.equals(a1)){
            System.out.println("\n====They are equal====\n");
        } else {
            System.out.println("\n====They are NOT equal====\n");
        }

        //TO CHECK: ===Instructions said that we had to check if object was null - but compiler won't let it run anyway if its null?===

        /*if (postOff1.equals(postOff2)){
            System.out.println("\n====They are equal====\n");
        } else {
            System.out.println("\n====They are NOT equal====\n");
        } */
        
        

        Address[] arr = {web1, em1, telec1, geo1, postOff1, genD1, web2, genD2, a1};


        System.out.println("\n\n\n========Checking for Obsolete Addresses========\n\n");
        traceObsoleteAddress(arr, 2004, 1, 21);
        traceObsoleteAddress(arr, 1989, 8, 16); 
        traceObsoleteAddress(arr, 2006, 12, 31);
        /*copyAddresses(arr);*/

    }

    
    /** 
     * @param arr
     * @param year
     * @param month
     * @param day
     */
    public static void traceObsoleteAddress(Address[] arr, int year, int month, int day) {
        String yearString = Integer.toString(year);
        String monthString = Integer.toString(month);
        String dayString = Integer.toString(day);

        //Add a 0 before single digit months or day (necessary for proper comparison)
        if(monthString.length()==1){
            monthString = 0 + monthString;
        }

        if(dayString.length() == 1){
            dayString = 0 + dayString;
        }

        String date = yearString + "-" + monthString + "-" + dayString;
        System.out.println("Comparing the addresses validity period to "+ date + "...\n\n");
        boolean obsolete = true;
        for (int i=0; i<arr.length; i++){  
            obsolete = (arr[i].getValidFrom().compareTo(date)<=0 && arr[i].getValidTo().compareTo(date)>=0)? false:true;
            System.out.println(obsolete? arr[i] + " and therefore is obsolete on " + date + ". Found at index " + i + ".\n": arr[i] + " and therefore is valid on " + date + ". Found at index " + i + ".\n");
        }
    }
}