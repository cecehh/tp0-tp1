package fr.chelie;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("TEST");
        try {
            Scene scene = SceneFactory.getScene(800,600,getClass().getResource("/fr.chelie/mainPage.fxml"));
            stage.setScene(scene);
        }catch(Exception e){
            e.printStackTrace();
        }

        stage.show();
    }

    public static void main(String[] args) {
        BDDNotesSaver bdd = new BDDNotesSaver();
        List<Note> lesNotes = new ArrayList<>(){{
            //add(new Note("titreee45255","le titre", LocalDate.now(),LocalDate.now()));
        }};
        bdd.SauvegarderListe(lesNotes);
        launch();
    }
}
