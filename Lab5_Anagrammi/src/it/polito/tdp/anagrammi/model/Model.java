package it.polito.tdp.anagrammi.model;


import java.util.LinkedList;

import it.polito.tdp.anagrammi.DAO.VocaboliDAO;

import java.util.HashSet;



public class Model {
Parole risultato ;
HashSet<String> soluzioniDaTestare;
int lunghezza=0;
LinkedList <String> lettere;
LinkedList<String> lettereRimanenti;


	public Parole trovaAnagrammi(String testoInserito) {



		
		lettere=new LinkedList<String>();
		soluzioniDaTestare=new HashSet<String>();
		risultato=new Parole();
		lunghezza=testoInserito.length();
		String[] lettereLinked=testoInserito.split("(?!^)");
		for (String l:lettereLinked) {
			lettere.add(l);
		}
		
		generaParole("",lettere,0);
		
		VocaboliDAO vd= new VocaboliDAO();
		for (String s:soluzioniDaTestare) {
			if (vd.parolaPresente(s)) {
		
		
			 risultato.aggiungiParolaEsatta(s);}
		
		else risultato.setParoleErrate(s);
		}
		
	
			
		
	
		return risultato;
	
	}
		

	
		
		
		//non la aggiungo
		void generaParole(String parziale,LinkedList<String>usabili, int livello) {
			
			
			if (livello==lunghezza) {
				soluzioniDaTestare.add(parziale);
				return;
			}
			else {
				if (usabili.size()>0) {
					for (int i=0;i<usabili.size();i++) {
						
					
			String	parziale2=parziale+usabili.get(i);
			LinkedList<String>usabili2=new LinkedList<String>();	
					usabili2.addAll(usabili);
					usabili2.remove(i);
					
					
				
				generaParole(parziale2,usabili2,livello+1);
				
			}
				}
			}
		
			
			
			
			
								
				
				}
		
			}
		
				
				
			
	


