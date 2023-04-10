package showtime;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.List;


public class LabelListController {
    @FXML
    private List<Label> labelList;

    public void initialize() {
        int count = 1;
        for (Label label : labelList) {
            label.setText("Message " + (count++));
        }
    }
}