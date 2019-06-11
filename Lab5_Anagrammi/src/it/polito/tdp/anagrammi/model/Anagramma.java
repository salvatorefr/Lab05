package it.polito.tdp.anagrammi.model;

public class Anagramma {
	String anagramma=new String();
	int size=0;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getAnagramma() {
		return anagramma;
	}

	public void setAnagramma(String anagramma) {
		this.anagramma = anagramma;
	}

	@Override
	protected Object clone()  {
		String altra= anagramma;
		
		return altra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anagramma == null) ? 0 : anagramma.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Anagramma altro= (Anagramma)obj;
		return (altro.getAnagramma().compareTo(this.anagramma)==0) ;
	
	}
	

}
