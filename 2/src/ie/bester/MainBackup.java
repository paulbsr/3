package ie.bester;

public class MainBackup {

    public static void main(String[] args) {

        int hoofBedrag_P = 268000;
        double jaarlikseRenteKoers_R = 3.6;
        byte termyn_N = 30;
        final byte maandeInJaar = 12;
        final byte persentasie = 100;
        float maandelikseRenteKoers_R = (float) (jaarlikseRenteKoers_R / persentasie / maandeInJaar);
        float verbandTerugBetalings = termyn_N * maandeInJaar;
        double mortgage = hoofBedrag_P * (maandelikseRenteKoers_R * Math.pow(1 + maandelikseRenteKoers_R, verbandTerugBetalings))
                / (Math.pow(1 + maandelikseRenteKoers_R, verbandTerugBetalings) - 1);

        System.out.println("Drolkop: " + mortgage);
    }

}