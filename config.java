import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public  class Config {
    static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    static final String ANSI_RESET = "\u001B[0m";
    static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void viewSeatMap(HashMap<Integer, String> map) {


        System.out.println();
        System.out.println(ANSI_WHITE_BACKGROUND + BLACK_BOLD + "                    SEAT MAP                  "+ ANSI_RESET);
        System.out.println("------------------------------------------------------------------------------------------------------------------");


        //1ST Row
        for (int j = 0; j < 16; j++) {
            if (Objects.equals(map.get(j), "AVAILABLE")) {
                System.out.print(ANSI_GREEN_BACKGROUND + BLACK_BOLD + " " + j + " " + ANSI_RESET);
                System.out.print("     ");// SPACES BETWEEN SEATS
            } else if (Objects.equals(map.get(j), "BOOKED")) {
                System.out.print(ANSI_RED_BACKGROUND + BLACK_BOLD + " " + j + " " + ANSI_RESET);
                System.out.print("     ");// SPACES BETWEEN SEATS
            }
        }
        //after printing 10 numbers, go to a new line
        System.out.println();


        // TO PRINT PATTERN BETWEEN SEATS
        for (int j = 0; j < 19; j++) {
            System.out.print("<---->");
            System.out.print(" ");
        }
        System.out.println();

        //2ND ROW
        for (int j = 16; j < 31; j++) {
            if (Objects.equals(map.get(j), "AVAILABLE")) {
                System.out.print(ANSI_GREEN_BACKGROUND + BLACK_BOLD + " " + j + " " + ANSI_RESET);
                System.out.print("     ");// SPACES BETWEEN SEATS
            } else if (Objects.equals(map.get(j), "BOOKED")) {
                System.out.print(ANSI_RED_BACKGROUND + BLACK_BOLD + " " + j + " " + ANSI_RESET);
                System.out.print("     ");// SPACES BETWEEN SEATS
            }
        }
        //after printing 10 numbers, go to a new line
        System.out.println();

        //3RD ROW
        for (int j = 31; j < 46; j++) {
            if (Objects.equals(map.get(j), "AVAILABLE")) {
                System.out.print(ANSI_GREEN_BACKGROUND + BLACK_BOLD + " " + j + " " + ANSI_RESET);
                System.out.print("     ");// SPACES BETWEEN SEATS
            } else if (Objects.equals(map.get(j), "BOOKED")) {
                System.out.print(ANSI_RED_BACKGROUND + BLACK_BOLD + " " + j + " " + ANSI_RESET);
                System.out.print("     ");// SPACES BETWEEN SEATS
            }
        }
        //after printing 10 numbers, go to a new line
        System.out.println();

        // TO PRINT PATTERN BETWEEN SEATS
        for (int j = 0; j < 19; j++) {
            System.out.print("<---->");
            System.out.print(" ");
        }
        System.out.println();

        //4TH ROW
        for (int j = 46; j < 61; j++) {
            if (Objects.equals(map.get(j), "AVAILABLE")) {
                System.out.print(ANSI_GREEN_BACKGROUND + BLACK_BOLD + " " + j + " " + ANSI_RESET);
                System.out.print("     ");// SPACES BETWEEN SEATS
            } else if (Objects.equals(map.get(j), "BOOKED")) {
                System.out.print(ANSI_RED_BACKGROUND + BLACK_BOLD + " " + j + " " + ANSI_RESET);
                System.out.print("     ");// SPACES BETWEEN SEATS
            }
        }
        //after printing 10 numbers, go to a new line
        System.out.println();

    }

    public static void reserveSeat(HashMap<Integer, String> map, int seatnumber) {
        Random r  = new Random();
        int x = r.nextInt(1000,9000);

        try {
            if (map.get(seatnumber).equals("BOOKED")) {
                System.out.println();
                System.out.println(ANSI_RED_BACKGROUND+BLACK_BOLD+"Sorry, that seat is already booked. PLEASE TRY ANOTHER SEAT !   "+ANSI_RESET);
                System.out.println();
            } else {
                map.put(seatnumber, "BOOKED");
                System.out.println("Seat " + seatnumber + " has been reserved.");
                System.out.println();
                System.out.println(ANSI_GREEN_BACKGROUND+BLACK_BOLD+"TICKET ID: "+"PK"+x+ANSI_RESET);
            }
        }catch (Exception exp){
            System.out.println(ANSI_RED_BACKGROUND+BLACK_BOLD+"Seat Number Not found ! Try Again..."+ANSI_RESET);
            JS_Airlines.BookSeats();
        }
    }


    public static void cancelSeat(String fid, int seatnumber) {

        if (Objects.equals(fid, "JS911")) {
            if (Objects.equals(JS_Airlines.seatMap911.get(seatnumber), "AVAILABLE")) {
                System.out.println(ANSI_RED_BACKGROUND+BLACK_BOLD+"THE SEAT WASN'T RESERVED AND CANNOT BE CANCELLED"+ANSI_RESET);
            } else {
                JS_Airlines.seatMap911.put(seatnumber, "AVAILABLE");
                System.out.println("THE SEAT HAS BEEN CANCELLED");
            }
        } else if (Objects.equals(fid, "JS912")) {
            if (Objects.equals(JS_Airlines.seatMap912.get(seatnumber), "AVAILABLE")) {
                System.out.println(ANSI_RED_BACKGROUND+BLACK_BOLD+"THE SEAT WASN'T RESERVED AND CANNOT BE CANCELLED"+ANSI_RESET);
            } else {
                JS_Airlines.seatMap912.put(seatnumber, "AVAILABLE");
                System.out.println("THE SEAT HAS BEEN CANCELLED");
            }
        } else if (Objects.equals(fid, "JS913")) {
            if (Objects.equals(JS_Airlines.seatMap913.get(seatnumber), "AVAILABLE")) {
                System.out.println(ANSI_RED_BACKGROUND+BLACK_BOLD+"THE SEAT WASN'T RESERVED AND CANNOT BE CANCELLED"+ANSI_RESET);
            } else {
                JS_Airlines.seatMap913.put(seatnumber, "AVAILABLE");
                System.out.println("THE SEAT HAS BEEN CANCELLED");
            }
        } else if (Objects.equals(fid, "JS914")) {
            if (Objects.equals(JS_Airlines.seatMap914.get(seatnumber), "AVAILABLE")) {
                System.out.println(ANSI_RED_BACKGROUND+BLACK_BOLD+"THE SEAT WASN'T RESERVED AND CANNOT BE CANCELLED"+ANSI_RESET);
            } else {
                JS_Airlines.seatMap914.put(seatnumber, "AVAILABLE");
                System.out.println("THE SEAT HAS BEEN CANCELLED");
            }
        } else if (Objects.equals(fid, "JS915")) {
            if (Objects.equals(JS_Airlines.seatMap915.get(seatnumber), "AVAILABLE")) {
                System.out.println(ANSI_RED_BACKGROUND+BLACK_BOLD+"THE SEAT WASN'T RESERVED AND CANNOT BE CANCELLED"+ANSI_RESET);
            } else {
                JS_Airlines.seatMap915.put(seatnumber, "AVAILABLE");
                System.out.println("THE SEAT HAS BEEN CANCELLED");
            }
        }
    }
}

