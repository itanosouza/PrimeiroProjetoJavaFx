import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
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
        Rectangle ceu = new Rectangle (900, 450, Color.DARKORANGE);
        Rectangle mar = new Rectangle(900, 450, Color.DODGERBLUE);
        Circle sol = new Circle(95, Color.YELLOW);
        //posicionamento
        ceu.setTranslateY(-200);
        mar.setTranslateY(200);
        sol.setTranslateY(40);
        //historia
        StackPane historia = new StackPane();
        historia.getChildren().addAll(ceu, sol, mar);
        //cena
        Scene cena = new Scene(historia, 900, 900);
        //colocando a cena no palco
        palco.setScene(cena);
        palco.setTitle("Patamares");
        palco.show();
    
    }
}
