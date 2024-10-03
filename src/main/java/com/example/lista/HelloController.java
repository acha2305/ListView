package com.example.lista;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public class HelloController {

    @FXML
    private ListView<String> listView;
    @FXML
    private TextField inputField;
    @FXML
    private Button addButton;
    @FXML
    private Button removeButton;

    private ObservableList<String> items;

    public void initialize() {
        items = FXCollections.observableArrayList();
        listView.setItems(items);
    }

    @FXML
    private void handleAddButton() {
        String newItem = inputField.getText();
        if (!newItem.isEmpty()) {
            items.add(newItem);
            inputField.clear();
        }
    }

    @FXML
    private void handleRemoveButton() {
        String selectedItem = listView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            items.remove(selectedItem);
        }
    }
}