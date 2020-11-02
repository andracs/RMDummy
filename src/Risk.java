/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 02/11/2020
 */

public class Risk {

    private String description;
    private String consequence;
    private double probabilityPercent; // 0..1
    private Probability probabilityLevel;
    // private int probability; // 0..100
    // private String probability; // LOW, MEDIUM, HIGH

    public String hello() {
        return "Hello!";
    }

}
