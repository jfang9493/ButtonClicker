package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label clicksText;
    private Integer numClicks = 0;

    public void buttonClicked(ActionEvent actionEvent)
    {
        numClicks++;
        clicksText.setText("Number of Clicks: " + numClicks.toString());
    }

}
