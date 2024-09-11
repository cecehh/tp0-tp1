package fr.chelie;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Note {

    private String titre;
    private String contenu;
    private LocalDate dateCreation;
    private LocalDate dateModif;

    public Note(String titre, String contenu, LocalDate dateCreation, LocalDate dateModif) {
        this.titre = titre;
        this.contenu = contenu;
        this.dateCreation = dateCreation;
        this.dateModif = dateModif;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public LocalDate getDateModif() {
        return dateModif;
    }

    public void setDateModif(LocalDate dateModif) {
        this.dateModif = dateModif;
    }

    @Override
    public String toString() {
        return titre + '\\' + contenu + '\\' + dateCreation + '\\' + dateModif;
    }
}
