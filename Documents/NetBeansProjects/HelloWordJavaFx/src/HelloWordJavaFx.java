import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class HelloWordJavaFx extends Application{
    public static void main(String[] args){
        launch();
    }
    
    @Override
    public void start(Stage palco){
        //personagem
        Rectangle ceu = new Rectangle (900, 400);
        Rectangle mar = new Rectangle(900, 450);
        Circle sol = new Circle(90);
        //historia
        StackPane historia = new StackPane();
        historia.getChildren().addAll(ceu, sol, mar);
        //cena
        Scene cena = new Scene(historia, 900, 900);
        //colocando a cena no palco
        palco.setScene(cena);
        palco.show();
    
    }
}
