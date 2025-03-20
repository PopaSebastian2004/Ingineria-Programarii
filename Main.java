import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Crearea terenurilor sportive
        TerenuSportiv teren1 = new TerenuSportiv("Teren Fotbal", "Strada Sportului, nr. 5", 50.0, true, 4);
        TerenuSportiv teren2 = new TerenuSportiv("Teren Tenis", "Strada Sportului, nr. 10", 30.0, true, 3);

        // Crearea clientului
        Client client1 = new Client("Ion Popescu", "ion.popescu@example.com");

        // Adaugarea terenurilor in lista clientului
        client1.adaugaTeren(teren1);
        client1.adaugaTeren(teren2);

        // Afisarea detaliilor terenurilor
        System.out.println("Detalii terenuri:");
        teren1.afiseazaDetalii();
        teren2.afiseazaDetalii();
        System.out.println();

        // Clientul cauta si rezerva un teren
        System.out.println("Rezervare teren:");
        client1.cautaTeren("Teren Fotbal", 3);
        System.out.println();

        // Clientul publica un anunt
        System.out.println("Publicare anunt:");
        client1.publicaAnunt("Caut coechipieri pentru un meci de fotbal vineri seara.");
        System.out.println();

        // Trimiterea unei notificari catre client
        System.out.println("Notificare client:");
        client1.trimiteNotificare("Rezervarea ta pentru Teren Fotbal a fost confirmata.");
        System.out.println();

        // Afisarea istoricului rezervarilor clientului
        System.out.println("Istoric rezervari:");
        client1.afiseazaIstoricRezervari();
        System.out.println();

        // Crearea unui eveniment si adaugarea participantilor
        System.out.println("Creare eveniment:");
        Eveniment eveniment1 = new Eveniment("Meci Fotbal", "Meci de fotbal intre prieteni", LocalDateTime.now(), LocalDateTime.now().plusHours(2));
        eveniment1.adaugaParticipant(client1);

        // Afisarea detaliilor evenimentului
        System.out.println("Detalii eveniment:");
        eveniment1.afiseazaDetaliiEveniment();
    }
}