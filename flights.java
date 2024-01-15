import java.util.LinkedList;
import java.time.LocalDate;
public class Flights {

    static void FlightDetails() {
        // Get the current date
        LocalDate today = LocalDate.now();
        // Add one day to get tomorrow's date
        LocalDate JS911dep = today.plusDays(7);
        String departDate911 = JS911dep.toString();
        LocalDate JS912dep = today.plusDays(9);
        String departDate912 = JS912dep.toString();
        LocalDate JS913dep = today.plusDays(6);
        String departDate913 = JS913dep.toString();
        LocalDate JS914dep = today.plusDays(10);
        String departDate914 = JS914dep.toString();
        LocalDate JS915dep = today.plusDays(10);
        String departDate915 = JS915dep.toString();

         LinkedList<String> JS911 = new LinkedList();
        JS911.add("JS911");
        JS911.add("BANGALORE INTERNATIONAL");
        JS911.add("NYC      ");
        JS911.add("2200 hrs");
        JS911.add("1700 hrs");
        JS911.add(departDate911);
        JS911.add("87091");
        System.out.println();
        for (int i = 0; i < 7; i++) {
            System.out.print(JS911.get(i));
            System.out.print("          ");
        }

        LinkedList<String> JS912 = new LinkedList();
        JS912.add("JS912");
        JS912.add("BANGALORE INTERNATIONAL");
        JS912.add("PARIS    ");
        JS912.add("2300 hrs");
        JS912.add("0900 hrs");
        JS912.add(departDate912);
        JS912.add("55182");
        System.out.println();
        for (int i = 0; i < 7; i++) {
            System.out.print(JS912.get(i));
            System.out.print("          ");
        }

        LinkedList<String> JS913 = new LinkedList();
        JS913.add("JS913");
        JS913.add("BANGALORE INTERNATIONAL");
        JS913.add("LONDON   ");
        JS913.add("1600 hrs");
        JS913.add("0200 hrs");
        JS913.add(departDate913);
        JS913.add("78223");
        System.out.println();
        for (int i = 0; i < 7; i++) {
            System.out.print(JS913.get(i));
            System.out.print("          ");
        }

        LinkedList<String> JS914 = new LinkedList();
        JS914.add("JS914");
        JS914.add("BANGALORE INTERNATIONAL");
        JS914.add("SINGAPORE");
        JS914.add("0400 hrs");
        JS914.add("1100 hrs");
        JS914.add(departDate914);
        JS914.add("25999");
        System.out.println();
        for (int i = 0; i < 7; i++) {
            System.out.print(JS914.get(i));
            System.out.print("          ");
        }

        LinkedList<String> JS915 = new LinkedList();
        JS915.add("JS915");
        JS915.add("BANGALORE INTERNATIONAL");
        JS915.add("TOKYO    ");
        JS915.add("1300 hrs");
        JS915.add("0200 hrs");
        JS915.add(departDate914);
        JS915.add("35678");
        System.out.println();
        for (int i = 0; i < 7; i++) {
            System.out.print(JS915.get(i));
            System.out.print("          ");
        }
    }

    public static void main(String[] args) {
        System.out.println();
        FlightDetails();
    }
}
