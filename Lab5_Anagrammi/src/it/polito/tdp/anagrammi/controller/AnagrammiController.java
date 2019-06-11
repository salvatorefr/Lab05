package it.polito.tdp.anagrammi.controller;


import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import it.polito.tdp.anagrammi.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnagrammiController {
Model model;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textparolaInserita;

    @FXML
    private TextArea textAnagrammiCorretti;

    @FXML
    private TextArea textAnagrammiErrati;

    @FXML
    private Button reset;

    @FXML
    void calcolaAnagrammi(ActionEvent event) {
    	
    	final String testoInserito=	this.textparolaInserita.getText();
    	Parole parole =model.trovaAnagrammi(testoInserito);
    	this.textAnagrammiCorretti.clear();
    	for(String p:parole.getParoleEsatte()) {
    		this.textAnagrammiCorretti.appendText(p+"\n");
    	}
    	this.textAnagrammiErrati.clear();
    	for(String p:parole.getParoleErrate()) {
    		this.textAnagrammiErrati.appendText(p+"\n");}
    	

    }

    @FXML
    void initialize() {
        assert textparolaInserita != null : "fx:id=\"parolaInserita\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert textAnagrammiCorretti != null : "fx:id=\"textAnagrammiCorretti\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert textAnagrammiErrati != null : "fx:id=\"textAnagrammiErrati\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert reset != null : "fx:id=\"reset\" was not injected: check your FXML file 'Anagrammi.fxml'.";

    }

	public void setModel(Model model) {
	this.model=model;
		
	}
}
