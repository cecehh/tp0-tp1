package fr.chelie;

import fr.chelie.interfaces.IController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.net.URL;

public class SceneFactory {

    public static Scene getScene(double width, double height, URL url) throws IOException {
        FXMLLoader loader = new FXMLLoader(url);
        Parent root = loader.load();

        IController controller = loader.getController();
        controller.start();

        return new Scene(root,width,height);
    }
}
