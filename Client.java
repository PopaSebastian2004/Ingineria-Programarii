import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nume;
    private String email;
    private List<TerenuSportiv> terenuriInchiriate;
    private List<TerenuSportiv> terenuriRezervate;

    public Client(String nume, String email) {
        this.nume = nume;
        this.email = email;
        this.terenuriInchiriate = new ArrayList<>();
        this.terenuriRezervate = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<TerenuSportiv> getTerenuriInchiriate() {
        return terenuriInchiriate;
    }

    public void adaugaTeren(TerenuSportiv teren) {
        terenuriInchiriate.add(teren);
    }

    public void adaugaTerenRezervat(TerenuSportiv teren) {
        terenuriRezervate.add(teren);
    }

    public void cautaTeren(String numeTeren, int ore) {
        for (TerenuSportiv teren : terenuriInchiriate) {
            if (teren.getNume().equals(numeTeren)) {
                System.out.println("Terenul " + numeTeren + " a fost gasit si este disponibil pentru rezervare.");
                if (teren.verificaVremea()) {
                    teren.rezervaTeren(ore);
                    adaugaTerenRezervat(teren);
                    return;
                }
            }
        }
        System.out.println("Terenul " + numeTeren + " nu a fost gasit in lista de terenuri inchiriate.");
    }

    public void publicaAnunt(String mesaj) {
        System.out.println(nume + " a publicat un anunt: " + mesaj);
    }

    public void trimiteNotificare(String mesaj) {
        System.out.println("Notificare pentru " + nume + ": " + mesaj);
    }

    public void afiseazaIstoricRezervari() {
        System.out.println("Istoricul rezervarilor pentru " + nume + ":");
        for (TerenuSportiv teren : terenuriRezervate) {
            System.out.println("- " + teren.getNume() + " in " + teren.getLocatie());
        }
    }
}