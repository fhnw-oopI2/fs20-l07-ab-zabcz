package ch.fhnw.oop2.module07.ab1;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;

// set basic layout to stackpane
public class ApplicationUI extends GridPane {
    private Button buttonAdd;
    private int counter = 0;
    private int row_index = 0;
    private int column_index = 0;

    // bring in stage
    public ApplicationUI() {
        initializeControls();
        layoutControls();
    }

    /*
    * init all control elements
    * */
    private void initializeControls() {
        buttonAdd = new Button("Hello World");
        buttonAdd.setOnAction(event -> createLabel());
    }

    private void createLabel() {
        Label eventLabel = new Label();
        counter++; column_index++;
        eventLabel.setText(String.valueOf("Label"+counter));
        if (column_index > 4){
            column_index = 0;
            row_index++;
        }
        add(eventLabel, column_index, row_index);
    }

    /*
     * layouting of controls
     * */
    private void layoutControls() {
        add(buttonAdd, 0, 0);
        this.setPadding(new Insets(20));
        this.setHgap(20);
    }

}
