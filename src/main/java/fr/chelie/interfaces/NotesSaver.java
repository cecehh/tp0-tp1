package fr.chelie.interfaces;

import fr.chelie.Note;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface NotesSaver {

    int SauvegarderListe(List<Note> lesNotes) throws IOException;

    List<Note> ChargerFichier() throws IOException;
}
