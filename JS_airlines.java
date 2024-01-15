import java.util.HashMap;
import java.util.Scanner;

public class JS_Airlines {

    static HashMap<Integer, String> seatMap911 = new HashMap<>();
    static HashMap<Integer, String> seatMap912 = new HashMap<>();
    static HashMap<Integer, String> seatMap913 = new HashMap<>();
    static HashMap<Integer, String> seatMap914 = new HashMap<>();
    static HashMap<Integer, String> seatMap915 = new HashMap<>();
    static final String ANSI_RESET = "\u001B[0m";
    static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";
    // CYAN
    static final String  ANSI_MAGENTA_BACKGROUND = "\033[45m"; // MAGENTA

    static void InitializeSeats() {

        for (int SeatNumber = 1; SeatNumber <= 60; SeatNumber++) {
            seatMap911.put(SeatNumber, "AVAILABLE");
            seatMap912.put(SeatNumber, "AVAILABLE");
            seatMap913.put(SeatNumber, "AVAILABLE");
            seatMap914.put(SeatNumber, "AVAILABLE");
            seatMap915.put(SeatNumber, "AVAILABLE");
        }
    }

    static void BookSeats() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Flight ID             DEPARTURE              DESTINATION           DEP_TIME          ARR_TIME           DEP_DATE           PRICE");
        Flights.FlightDetails(); //Since FlightDetails is static, no need to create an obj to access it
        System.out.println();
        System.out.print("Enter Flight ID to book: ");
        String fid = sc.nextLine();
//        Config c = new Config();  THIS OBJECT IS NOT USED SINCE reserveseat and viewseatmap is static

        switch (fid) {
            case "JS911" -> {
                Config.viewSeatMap(seatMap911);
                System.out.print("Enter Seat Number to be reserved: ");
                int seatnumberJS911 = sc.nextInt();
                Config.reserveSeat(seatMap911, seatnumberJS911);
                Config.viewSeatMap(seatMap911);
            }
            case "JS912" -> {
                Config.viewSeatMap(seatMap912);
                System.out.print("Enter Seat Number to be reserved: ");
                int seatnumberJS912 = sc.nextInt();
                Config.reserveSeat(seatMap912, seatnumberJS912);
                Config.viewSeatMap(seatMap912);
            }
            case "JS913" -> {
                Config.viewSeatMap(seatMap913);
                System.out.print("Enter Seat Number to be reserved: ");
                int seatnumberJS913 = sc.nextInt();
                Config.reserveSeat(seatMap913, seatnumberJS913);
                Config.viewSeatMap(seatMap913);
            }
            case "JS914" -> {
                Config.viewSeatMap(seatMap914);
                System.out.print("Enter Seat Number to be reserved: ");
                int seatnumberJS914 = sc.nextInt();
                Config.reserveSeat(seatMap914, seatnumberJS914);
                Config.viewSeatMap(seatMap914);
            }
            case "JS915" -> {
                Config.viewSeatMap(seatMap915);
                System.out.print("Enter Seat Number to be reserved: ");
                int seatnumberJS915 = sc.nextInt();
                Config.reserveSeat(seatMap915, seatnumberJS915);
                Config.viewSeatMap(seatMap915);
            }
            default -> {
                System.out.println(ANSI_RED_BACKGROUND+BLACK_BOLD+"         INVALID CHOICE ! TRY AGAIN          "+ANSI_RESET);
                BookSeats();
            }
        }
    }

    static void CancelSeats(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Flight ID to cancel ticket: ");
        String fid = sc.nextLine();
        System.out.print("Enter Seat to be cancelled: ");
        int seatnumber = sc.nextInt();
        Config.cancelSeat(fid,seatnumber);

    }
    public static void main(String[] args) {
            System.out.println(ANSI_PURPLE_BACKGROUND+BLACK_BOLD+"                                       WELCOME TO JETSETTER AIRLINES RESERVATION INTERFACE                                            "+ANSI_RESET);
        Scanner scanner = new Scanner(System.in);
        InitializeSeats();

        while (true) {
            System.out.println();
            System.out.println(ANSI_WHITE_BACKGROUND + BLACK_BOLD+"            1. Book Seats               "+ANSI_RESET);
            System.out.println(ANSI_WHITE_BACKGROUND + BLACK_BOLD+"            2. Cancel Seats             "+ANSI_RESET);
            System.out.println(ANSI_WHITE_BACKGROUND + BLACK_BOLD+"            3. EXIT INTERFACE           "+ANSI_RESET);
            System.out.print("Enter Choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> BookSeats();
                case 2 -> CancelSeats();
                case 3 -> {
                    System.out.println("Thank you for using the Airline Reservation System!");
                    System.exit(0);
                }
                default -> System.out.println(ANSI_RED_BACKGROUND+BLACK_BOLD+"              Invalid choice. Please try again.           "+ANSI_RESET);
            }
        }


    }
}
