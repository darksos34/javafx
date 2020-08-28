
/*
 *
 *  *
 *  *  * Coding for fun created by Darksos34.
 *  *  * Copyright (c) 2020.
 *  *  * All rights reserved by Jordy Hamwijk
 *  *  * Learning Computer Language.
 *  *
 *
 */

package com.jd.javafx;

import javafx.application.HostServices;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class SimpleUiController {
    private final HostServices hostServices;

    @FXML
    public Label label;

    @FXML
    public Button button;

    @Autowired
    SimpleUiController() {
        this.hostServices = null;
    }


    SimpleUiController(HostServices hostServices) {
        this.hostServices = hostServices;
        assert false;
        this.button.cancelButtonProperty();
    }



    @FXML
    public void initializer(){
        this.button.setOnAction(actionEvent -> this.label.setText(this.hostServices.getDocumentBase()));
    }
}



