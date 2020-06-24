package com.jd.javafx;

import javafx.application.HostServices;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.springframework.stereotype.Component;


@Component
public class SimpleUiController {
    private final HostServices hostServices;

    @FXML
    public Label label;

    @FXML
    public Button button;

    SimpleUiController(HostServices hostServices){
        this.hostServices = hostServices;
    }

    @FXML
    public void initializer(){
        this.button.setOnAction(actionEvent -> this.label.setText(this.hostServices.getDocumentBase()));
    };
}



