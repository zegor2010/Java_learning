import java.util.Scanner;

public class Calendar {
    public static Scanner sc = new Scanner(System.in);

    public static String getMonth() {
        System.out.println("Input number of the month");
        int month = sc.nextInt();
        switch(month) {
            case 1: return"-----------January---------";
            case 2: return"----------February---------";
            case 3: return"-----------March-----------";
            case 4: return"-----------April-----------";
            case 5: return"------------May------------";
            case 6: return"------------June-----------";
            case 7: return"------------July-----------";
            case 8: return"-----------August----------";
            case 9: return"---------September---------";
            case 10: return"----------October----------";
            case 11: return"----------November---------";
            case 12: return"----------December---------";
            default: return "Invalid month";
        }
    }
    public static int daysInMonth(int month, int year) {
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }
    public static int getYear() {
        System.out.println("Input a year: ");
        return sc.nextInt();
    }
    public static void printHeader(){
        System.out.println(getYear());
        System.out.println(getMonth());
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
    }
    public static boolean isLeapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true; }
        else{
            return false; }
    }
    public static int getStartDay(int year, int month) {
        int totalDays = getTotalDays(year, month);
        int startDay1800 = 3;
        return (startDay1800 + totalDays) % 7 == 0 ? 7 : (startDay1800 + totalDays) % 7;
    }
    public static int getTotalDays(int year, int month) {
        int totalDays = 0;
        for (int y = 1800; y < year; y++) {
            totalDays += isLeapYear(y) ? 366 : 365;
        }
        for (int m = 1; m < month; m++) {
            totalDays += daysInMonth(m, year);
        }
        return totalDays;
    }

}
