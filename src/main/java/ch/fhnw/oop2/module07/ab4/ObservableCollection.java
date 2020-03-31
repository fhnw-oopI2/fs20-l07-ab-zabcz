package ch.fhnw.oop2.module07.ab4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.VBox;

final class ObservableCollection extends VBox {
	
	private ObservableList<String> observableList;
	
	private Button btnShuffle;
	private ToolBar toolBar;
	private ListView<String> listView;
	
	ObservableCollection() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		String[] names = {"Anna", "Beatrice", "Charles", "Donald"};
		observableList = FXCollections.observableArrayList(names);
		
		btnShuffle = new Button("Shuffle");
		toolBar = new ToolBar(btnShuffle);
		
		listView = new ListView<>(observableList);
		btnShuffle.setOnAction(event -> shuffleList());

	}

	private void shuffleList() {
		FXCollections.shuffle(observableList);
	}

	private void layoutControls() {
		setPadding(new Insets(20));
		setSpacing(20);
		getChildren().addAll(toolBar, listView);
	}
}
