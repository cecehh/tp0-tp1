package fr.chelie.components;

import fr.chelie.BDDNotesSaver;
import fr.chelie.Note;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.util.List;

public class NoteCard extends Pane {

    public NoteCard(){

        BDDNotesSaver bdd = new BDDNotesSaver();
        List<Note> lesNotes = bdd.ChargerFichier();
        HBox hBox = new HBox();
        for(Note note : lesNotes){
            Button card = createCard();
            card.setText(note.getTitre());
            card.setId(note.getTitre());
            hBox.getChildren().add(card);
        }

        Button card = createCard();
        card.setText("Nouvelle note...");
        hBox.getChildren().add(card);

        hBox.setAlignment(Pos.CENTER_LEFT);
        hBox.setSpacing(15.0);
        super.getChildren().add(hBox);
    }

    private Button createCard(){
        Button btn = new Button();
        btn.setText("Note 1 ");
        btn.setMinHeight(100.0);
        btn.setMinWidth(100.0);
        btn.setLineSpacing(9);
        return btn;
    }
}
