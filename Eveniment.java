import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Eveniment {
    private String titlu;
    private String descriere;
    private LocalDateTime dataInceput;
    private LocalDateTime dataSfarsit;
    private List<Client> participanti;

    public Eveniment(String titlu, String descriere, LocalDateTime dataInceput, LocalDateTime dataSfarsit) {
        this.titlu = titlu;
        this.descriere = descriere;
        this.dataInceput = dataInceput;
        this.dataSfarsit = dataSfarsit;
        this.participanti = new ArrayList<>();
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public LocalDateTime getDataInceput() {
        return dataInceput;
    }

    public void setDataInceput(LocalDateTime dataInceput) {
        this.dataInceput = dataInceput;
    }

    public LocalDateTime getDataSfarsit() {
        return dataSfarsit;
    }

    public void setDataSfarsit(LocalDateTime dataSfarsit) {
        this.dataSfarsit = dataSfarsit;
    }

    public List<Client> getParticipanti() {
        return participanti;
    }

    public void adaugaParticipant(Client client) {
        this.participanti.add(client);
        client.trimiteNotificare("Ai fost adaugat la evenimentul: " + titlu);
    }

    public void afiseazaDetaliiEveniment() {
        System.out.println("Eveniment: " + titlu);
        System.out.println("Descriere: " + descriere);
        System.out.println("Data inceput: " + dataInceput);
        System.out.println("Data sfarsit: " + dataSfarsit);
        System.out.println("Participanti: ");
        for (Client participant : participanti) {
            System.out.println("- " + participant.getNume() + " (" + participant.getEmail() + ")");
        }
    }
}