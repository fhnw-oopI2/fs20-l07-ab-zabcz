package ch.fhnw.oop2.module07.ab3;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.css.converter.StringConverter;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.util.converter.NumberStringConverter;

import java.text.NumberFormat;

// set basic layout to stackpane
public class ApplicationUI extends VBox {

    private TextField txtField;
    private Slider slider;
    final static int DEFAULT_VALUE_SLIDER = 50;

    // bring in stage
    public ApplicationUI() {
        initializeControls();
        layoutControls();
    }

    /*
    * init all control elements
    * */
    private void initializeControls() {
        txtField = new TextField();
        slider = new Slider();
        // set slider range
        slider.setMin(0);
        slider.setMax(100);
        // set tick label visible
        slider.setShowTickLabels(true);
        // set tick marks visible
        slider.setShowTickMarks(true);
        // set tick unit
        slider.setMajorTickUnit(1);

        // defaulting
        slider.setValue(DEFAULT_VALUE_SLIDER);
        txtField.setText(Double.toString(DEFAULT_VALUE_SLIDER));

        // bidirect binding
        txtField.textProperty().bindBidirectional(slider.valueProperty(), new NumberStringConverter());

    }


    /*
     * layouting of controls
     * */
    private void layoutControls() {
        setCenterShape(true);
        setPadding(new Insets(20));
        setSpacing(10);
        getChildren().add(txtField);
        getChildren().add(slider);
    }

}
