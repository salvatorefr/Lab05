package it.polito.tdp.anagrammi.model;

import java.util.HashSet;
import java.util.Set;

public class Parole {
	Set<String> paroleEsatte= new HashSet<String>();
	Set<String> paroleErrate= new HashSet<String>();
	public Set<String> getParoleEsatte() {
		return paroleEsatte;
	}
	public void aggiungiParolaEsatta(String parolaEsatta) {
		this.paroleEsatte.add(parolaEsatta);
	}
	public Set<String> getParoleErrate() {
		return paroleErrate;
	}
	public void setParoleErrate(String parolaErrata) {
		paroleErrate.add(parolaErrata);
	}
	

}
