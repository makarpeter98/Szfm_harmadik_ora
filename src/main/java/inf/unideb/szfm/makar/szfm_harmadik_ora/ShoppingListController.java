package inf.unideb.szfm.makar.szfm_harmadik_ora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.io.IOException;

public class ShoppingListController {

    @FXML
    ListView ShoppingListView;

    @FXML
    public void onAddElementButtonClick(ActionEvent actionEvent) throws IOException
    {
        System.out.println("Elem hozzáadása.");
        App.setRoot("ShoppingListAddElementView");
    }

    @FXML
    public void onDeleteElementButtonClick(ActionEvent actionEvent) throws IOException
    {
        System.out.println("Elem törlése.");
        App.setRoot("ShoppingListRemoveElementView");
    }

    @FXML
    public void onOrderButtonClick(ActionEvent actionEvent)
    {
        System.out.println("Elemek rendezése.");
    }

    public void initialize()
    {
        System.out.println("Inicializálás.");
    }
}
