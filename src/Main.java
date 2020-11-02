/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 02/11/2020
 */

public class Main {

    public static void main(String[] args) {
        Risk risk = new Risk();
        risk.setDescription("Noget forfærdeligt!");
        System.out.println(risk.getDescription() + " kommer til at ske med " + risk.getProbabilityPercent() + " chance. ");
    }
}
