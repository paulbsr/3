package ie.bester;

import static ie.bester.Nommers.repayments;

public class Berekening {

// FOR ENCAPSULATION DECLARE ALL FIELDS/VARIABLES AS PRIVATE SO THAT THEY ARE NOT ACCESSIBLE

    //private static int hoofBedrag_P = 268000;
    private static int hoofBedrag_P = Main.getPrincipal();
    // private static double jaarlikseRenteKoers_R = 3.6;
    private static double jaarlikseRenteKoers_R = Main.getAnnualInterest();
    // private static byte termyn_N = 30;
    private static byte termyn_N = Main.getYears();
    private static final byte maandeInJaar = 12;
    private static final byte persentasie = 100;
    private static float maandelikseRenteKoers_R = (float) (jaarlikseRenteKoers_R / persentasie / maandeInJaar);
    private static float verbandTerugBetalings = termyn_N * maandeInJaar;
    private static double mortgage = hoofBedrag_P * (maandelikseRenteKoers_R * Math.pow(1 + maandelikseRenteKoers_R, verbandTerugBetalings))
            / (Math.pow(1 + maandelikseRenteKoers_R, verbandTerugBetalings) - 1);

// FOR ENCAPSULATION DECLARE ALL METHODS AS PUBLIC & FOR ENCAPSULATION USE GETTER & SETTER METHODS

    public static double getMortgage() {return mortgage;}
    public static double getHoofBedrag() {return hoofBedrag_P;}
    public static void opsomming() {System.out.println("Drolkop het " + Nommers.prinsipaal + " geleen oor " + termyn_N +" jaar teen " + jaarlikseRenteKoers_R +"% APR.");}
    // public static void opsomming1() {System.out.println("Drolkop het " + Main.getPrincipal(); + " geleen oor " + termyn_N +" jaar teen " + jaarlikseRenteKoers_R +"% APR.");}
    public static void metodeRekenaar() {System.out.println("Drolkop het te veel geleen.........." + Nommers.repayments);}

}

