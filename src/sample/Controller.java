package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class Controller {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private VBox mainVBOX;

    @FXML
    private Button loadButton;

    @FXML
    private ListView<?> listView;

    @FXML
    private StackedAreaChart<?, ?> graph;

    @FXML
    private Label labelMaxValue;

    @FXML
    private Label labelMinValue;

    @FXML
    void loadFile(ActionEvent event) {

    }

    @FXML
    void initialize() {
        //Creating the mouse event handler
        EventHandler<MouseEvent> eventHandler =
                new EventHandler<javafx.scene.input.MouseEvent>() {

                    @Override
                    public void handle(javafx.scene.input.MouseEvent e) {
                        loadButton.setText("Kojan 1 TEST");
                    }
                };
        //Adding the event handler
        loadButton.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandler);

    }

}

