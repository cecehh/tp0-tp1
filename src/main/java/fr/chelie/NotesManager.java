package fr.chelie;

import fr.chelie.interfaces.NotesSaver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NotesManager {

    private NotesSaver noteSaver;

    private List<Note> listeNotes;

    public NotesManager() {
        this.listeNotes = new ArrayList<>();
    }

    public List<Note> getListeNotes() {
        return listeNotes;
    }

    public void setListeNotes(List<Note> listeNotes) {
        this.listeNotes = listeNotes;
    }

    public int saveUsingBDD(List<Note> lesNotes) throws IOException {
        noteSaver = new BDDNotesSaver();
        noteSaver.SauvegarderListe(lesNotes);
        return 0;
    }

    public int saveUsingCSV(List<Note> lesNotes) throws IOException {
        noteSaver = new CSVNotesSaver();
        noteSaver.SauvegarderListe(lesNotes);
        return 0;
    }
}
