package fr.chelie;

import fr.chelie.interfaces.NotesSaver;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVNotesSaver implements NotesSaver {

    private static final String cheminFichier = "F:/lefichierdetest.csv";

    @Override
    public int SauvegarderListe(List<Note> lesNotes) throws IOException {
        File file = new File(cheminFichier);
        if(file.exists()){
            try (FileWriter fw = new FileWriter(file)){
                for(Note s : lesNotes){
                    System.out.println(s.toString());
                    fw.write(s + "\n");
                }
            }catch(IOException e){
                throw new IOException();
            }
        }else{
            throw new FileNotFoundException();
        }
        return 0;
    }

    public List<Note> ChargerFichier() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(cheminFichier));
        List<Note> lesNotes = new ArrayList<>();
        while(br.ready()){
            String result = br.readLine().replace('\\', ' ');
            List<String> line = new ArrayList<>(Arrays.asList(result.split(" ")));
            Note note = new Note(
                    line.get(0),
                    line.get(1), LocalDate.parse(line.get(2),
                    DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                    LocalDate.parse(line.get(3), DateTimeFormatter.ISO_LOCAL_DATE_TIME));
            System.out.println(note);
            lesNotes.add(note);

        }
        return lesNotes;
    }
}
