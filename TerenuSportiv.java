import java.util.Random;

public class TerenuSportiv {
    private String nume;
    private String locatie;
    private double pretPeOra;
    private boolean disponibil;
    private int rating; // Rating-ul terenului de la 1 la 5

    public TerenuSportiv(String nume, String locatie, double pretPeOra, boolean disponibil, int rating) {
        this.nume = nume;
        this.locatie = locatie;
        this.pretPeOra = pretPeOra;
        this.disponibil = disponibil;
        this.rating = rating;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public double getPretPeOra() {
        return pretPeOra;
    }

    public void setPretPeOra(double pretPeOra) {
        this.pretPeOra = pretPeOra;
    }

    public boolean isDisponibil() {
        return disponibil;
    }

    public void setDisponibil(boolean disponibil) {
        this.disponibil = disponibil;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void rezervaTeren(int ore) {
        if (disponibil) {
            disponibil = false;
            double costTotal = ore * pretPeOra;
            double discount = aplicaDiscount(ore, rating);
            double costFinal = costTotal - discount;
            System.out.println("Terenul " + nume + " a fost rezervat pentru " + ore + " ore. Cost total: " + costTotal + " RON. Discount: " + discount + " RON. Cost final: " + costFinal + " RON.");
        } else {
            System.out.println("Terenul " + nume + " nu este disponibil pentru rezervare.");
        }
    }

    private double aplicaDiscount(int ore, int rating) {
        double discount = 0;
        if (ore >= 3) {
            discount += ore * pretPeOra * 0.1; // 10% discount for 3 or more hours
        }
        if (rating >= 4) {
            discount += ore * pretPeOra * 0.05; // additional 5% discount for high rating
        }
        return discount;
    }

    public boolean verificaVremea() {
        Random rand = new Random();
        boolean vremeFavorabila = rand.nextBoolean();
        if (vremeFavorabila) {
            System.out.println("Vremea este favorabila pentru a juca pe terenul " + nume + ".");
        } else {
            System.out.println("Vremea nu este favorabila pentru a juca pe terenul " + nume + ".");
        }
        return vremeFavorabila;
    }

    public void afiseazaDetalii() {
        System.out.println("Teren: " + nume + ", Locatie: " + locatie + ", Pret pe ora: " + pretPeOra + " RON, Disponibil: " + disponibil + ", Rating: " + rating + "/5");
    }
}