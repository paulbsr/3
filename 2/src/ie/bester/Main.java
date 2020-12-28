package ie.bester;

public class Main {

    private static int principal = (int) Vrae.leesInsette("Hoeveel het jy geleen? ", 1_000, 1_000_000);
    private static float annualInterest = (float) Vrae.leesInsette("Jaarlikse rentekoers? ", 1, 30);
    private static byte years = (byte) Vrae.leesInsette("Tydperk (in jare)? ", 1, 30);

    public static void main(String[] args) {

        System.out.println(principal);
        System.out.println(annualInterest);
        System.out.println(years);
        Berekening.opsomming();
        Berekening.metodeRekenaar();
        Nommers.metodeRekenaar3();
        }

    public static int getPrincipal() {return principal;}
    public static float getAnnualInterest() {return annualInterest;}
    public static byte getYears() {return years;}

}