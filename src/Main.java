import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main extends Application{

    Stage window;
    Scene sceneMain;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Label mainTop = new Label("This is a short demo with konvert.me's free APIs");
        mainTop.setTextAlignment(TextAlignment.CENTER);
        mainTop.setWrapText(true);

        Label mainBot = new Label("Created by Hongda Zeng");
        mainBot.setTextAlignment(TextAlignment.CENTER);
        mainBot.setWrapText(true);

        Button reverseDNS = new Button("Reverse DNS Lookup");
        Button forwardDNS = new Button("Forward DNS Lookup");
        Button IPtoCity = new Button("IP to City Lookup");
        Button IPtoCountry = new Button("IP to Country Lookup");

        VBox layoutMain = new VBox(20);
        layoutMain.getChildren().addAll(mainTop,reverseDNS,forwardDNS,IPtoCity, IPtoCountry,mainBot);
        layoutMain.setPadding(new Insets(20, 20, 20, 20));
        layoutMain.setAlignment(Pos.CENTER);

        sceneMain = new Scene(layoutMain, 550, 300);

        window.setScene(sceneMain);
        window.setTitle("Walmart Store Helper");
        window.show();
    }
}
