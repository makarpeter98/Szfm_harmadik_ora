package inf.unideb.szfm.makar.szfm_harmadik_ora;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ShoppingListAddElementController
{
    @FXML
    public TextField AddElementTextField;

    @FXML
    public void onAddElementButtonClick(ActionEvent actionEvent)
    {
        System.out.println("Elem hozzáadása.");
    }


    @FXML
    public void onShowListButtonClick(ActionEvent actionEvent) throws IOException
    {
		
    }
}
