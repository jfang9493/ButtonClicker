package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label clicksText;
    private Integer numClicks = 0;
    private boolean gameStart = false;

    public void buttonClicked(ActionEvent actionEvent)
    {

        if(!gameStart)
        {
            gameStart = true;
        }
        numClicks++;
        clicksText.setText("Number of Clicks: " + numClicks.toString());
    }
}
