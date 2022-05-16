package it.prova.provaset.model;

public class ProvaTreeSet implements Comparable<ProvaTreeSet> {

	private int x;
	private int y;
	
	public ProvaTreeSet(int x,int y) {
		this.x=x;
		this.y = y;
	}
	
	
	
	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	@Override
	public int compareTo(ProvaTreeSet provaTreeSet) {
		 if(x==provaTreeSet.x && y==provaTreeSet.y) return 0;
		 else if(x>provaTreeSet.x || y>provaTreeSet.y) return 1;
		 else return -1;
	}

	
		
	
	
}
