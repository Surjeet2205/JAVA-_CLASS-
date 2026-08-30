import java.util.Scanner;

public class SmartTrafficViolationAnalyzer {

    static final int FLAG_OVER_SPEED   = 1;
    static final int FLAG_NO_HELMET    = 2;
    static final int FLAG_NO_SEATBELT  = 4; 
    static final int FLAG_NO_LICENSE   = 8;

    static final int FINE_OVER_SPEED  = 1500;
    static final int FINE_NO_HELMET   = 1000;
    static final int FINE_NO_SEATBELT = 1000;
    static final int FINE_NO_LICENSE  = 5000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine().trim().toUpperCase();

        System.out.print("Enter Vehicle Speed (km/h): ");
        int speed = sc.nextInt();

        System.out.print("Enter Speed Limit (km/h): ");
        int speedLimit = sc.nextInt();

        System.out.print("Enter Driver Age: ");
        int age = sc.nextInt();

        System.out.print("Is Helmet Worn? (true/false): ");
        boolean helmetOn = sc.nextBoolean();

        System.out.print("Is Seat Belt Worn? (true/false): ");
        boolean seatBeltOn = sc.nextBoolean();

        System.out.print("Does Driver have a Valid License? (true/false): ");
        boolean hasValidLicense = sc.nextBoolean();

        System.out.print("Is this an Emergency Vehicle? (true/false): ");
        boolean isEmergencyVehicle = sc.nextBoolean();

        sc.close();

       
        int excessSpeed = (speed > speedLimit) ? (speed - speedLimit) : 0;

      
        boolean isOverSpeed = (speed > speedLimit) && !isEmergencyVehicle;

        boolean isUnderage = age < 18;

        boolean helmetViolation   = !helmetOn;
        boolean seatBeltViolation = !seatBeltOn;
       
        boolean licenseViolation  = !hasValidLicense || isUnderage;

        
        int violationFlags = 0;
        violationFlags |= isOverSpeed        ? FLAG_OVER_SPEED  : 0;
        violationFlags |= helmetViolation     ? FLAG_NO_HELMET   : 0;
        violationFlags |= seatBeltViolation   ? FLAG_NO_SEATBELT : 0;
        violationFlags |= licenseViolation    ? FLAG_NO_LICENSE  : 0;

    
        int totalFine = 0;
        totalFine += (violationFlags & FLAG_OVER_SPEED)  != 0 ? FINE_OVER_SPEED  : 0;
        totalFine += (violationFlags & FLAG_NO_HELMET)   != 0 ? FINE_NO_HELMET   : 0;
        totalFine += (violationFlags & FLAG_NO_SEATBELT) != 0 ? FINE_NO_SEATBELT : 0;
        totalFine += (violationFlags & FLAG_NO_LICENSE)  != 0 ? FINE_NO_LICENSE  : 0;

        
        int violationCount = Integer.bitCount(violationFlags);

        String riskLevel;
        if (violationCount >= 2) {
            riskLevel = "HIGH";
        } else if (violationCount == 1) {
            riskLevel = "MEDIUM";
        } else {
            riskLevel = "LOW";
        }



        System.out.println("--------------------------------");
        System.out.println("      SMART TRAFFIC ANALYZER");
        System.out.println("--------------------------------");
        System.out.println("Vehicle Number   : " + vehicleNumber);
        System.out.println("Speed            : " + speed + " km/h");
        System.out.println("Speed Limit      : " + speedLimit + " km/h");
        System.out.println("Excess Speed     : " + excessSpeed + " km/h");
        System.out.println();
        System.out.println("Speed Status     : " + (isOverSpeed ? "OVER SPEED" : "NORMAL"));
        System.out.println("Helmet Status    : " + (helmetViolation ? "VIOLATION" : "VALID"));
        System.out.println("Seat Belt Status : " + (seatBeltViolation ? "VIOLATION" : "VALID"));
        System.out.println("License Status   : " + (licenseViolation ? "VIOLATION" : "VALID"));
        System.out.println();
        System.out.println("Total Fine       : \u20B9" + totalFine);
        System.out.println();
        System.out.println("Risk Level       : " + riskLevel);
        System.out.println();
        System.out.println("Violation Flags  : " + violationFlags);
        System.out.println("--------------------------------");
    }
}
