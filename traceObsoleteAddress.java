import Package1.Address;

public abstract class traceObsoleteAddress {
    /* public abstract String traceObsoleteAddress(Address[] arr, int year, int month, int day) {
        String date = Integer.toString(year) + "-" + Integer.toString(month) + "-" + Integer.toString(day);
        boolean obsolete = true;
        for (int i=0; i<arr.length; i++){ */
            /*int startYear = Integer.parseInt(arr[i].validFrom.substring(0,3));
            int startMonth = Integer.parseInt(arr[i].validFrom.substring(5,7));
            int startDay = Integer.parseInt(arr[i].validFrom.substring(7,9));

            int endYear = Integer.parseInt(arr[i].validTo.substring(0,3));
            int endMonth = Integer.parseInt(arr[i].validTo.substring(5,7));
            int endDay = Integer.parseInt(arr[i].validTo.substring(7,9));

            if (startYear<year && endYear>year) {
                if (startMonth<month && endMonth>month) {
                    if (startDay<day && endDay>day) {
                        obsolete = false;
                    }
                }
            }*/

            /*obsolete = (arr[i].validFrom.compareTo(date)<=0 && arr[i].validTo.compareTo(date)>=0)? false:true;
            return(obsolete? arr[i] + " is obsolete." : arr[i] + " is valid.");*/
       /* }
        
    }*/
}
