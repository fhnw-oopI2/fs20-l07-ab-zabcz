package ch.fhnw.oop2.module07.ab2;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.Slider;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

// set basic layout to stackpane
public class ApplicationUI extends VBox {
    private Label labelValue;
    private Slider slider;
    private int value;
    // bring in stage
    public ApplicationUI() {
        initializeControls();
        layoutControls();
    }

    /*
    * init all control elements
    * */
    private void initializeControls() {
        labelValue = new Label("Select Brightness:");
        slider = new Slider();
        // set slider range
        slider.setMin(0);
        slider.setMax(100);
        // Current value
        slider.setValue(50);
        // set tick label visible
        slider.setShowTickLabels(true);
        // set tick marks visible
        slider.setShowTickMarks(true);
        // set tick unit
        slider.setMajorTickUnit(1);
        // Adding Listener to value property of slider
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable,
                    Number oldValue, Number newValue) {
                value = newValue.intValue();
                labelValue.setText("New value: " + value);
            }
        });

    }


    /*
     * layouting of controls
     * */
    private void layoutControls() {
        setCenterShape(true);
        setPadding(new Insets(20));
        setSpacing(10);
        getChildren().add(labelValue);
        getChildren().add(slider);
    }

}
