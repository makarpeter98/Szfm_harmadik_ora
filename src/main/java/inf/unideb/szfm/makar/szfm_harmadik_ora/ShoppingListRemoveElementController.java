package inf.unideb.szfm.makar.szfm_harmadik_ora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ShoppingListRemoveElementController {
    @FXML
    public TextField ElementToDeleteTextField;

    @FXML
    public void onDeleteElementButtonClick(ActionEvent actionEvent)
    {
        System.out.println("Elem eltávolítása.");
    }
    @FXML
    public void onShowListViewButtonClick(ActionEvent actionEvent) throws IOException {
        App.setRoot("ShoppingListView");
    }
}