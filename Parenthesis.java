public class Parenthesis {
    public static void main(String [] args) {     
        String s = "01:34 PM";
        System.out.println("PM" == "PM");
        System.out.println(Integer.valueOf(s.substring(0,2)));
    }
    static String convertTime(String s)
    {
    String time24;
    int change;
    if (s.substring(6,8) == "PM" && Integer.valueOf(s.substring(0,2)) < 12) {
        change = 12;
    } else if (s.substring(6,8) == "PM" && Integer.valueOf(s.substring(0,2)) == 12) {
        change = 0;
    } else if (s.substring(6,8) == "AM" && Integer.valueOf(s.substring(0,2)) < 12) {
        change = 0;
    } else {
        change = -12;
    }
    int hours = Integer.valueOf(s.substring(0,2)) + change;
    if (hours > 9) {
        time24 = String.valueOf(hours) + s.substring(2,5);
    } else {
        time24 = "0" + String.valueOf(hours) + s.substring(2,5);
    }
    return time24;
    }
}