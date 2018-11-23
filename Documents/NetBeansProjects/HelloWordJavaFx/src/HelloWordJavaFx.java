import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class HelloWordJavaFx extends Application{
    public static void main(String[] args){
        launch();
    }
    
    @Override
    public void start(Stage palco){
        //personagem
        Label texto = new Label ("Ultimo dia de Aula");
        //historia
        StackPane historia = new StackPane();
        historia.getChildren().add(texto);
        //cena
        Scene cena = new Scene(historia, 300, 300);
        //colocando a cena no palco
        palco.setScene(cena);
        palco.show();
    
    }
}
