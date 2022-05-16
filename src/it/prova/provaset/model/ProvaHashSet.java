package it.prova.provaset.model;

public class ProvaHashSet {

	private int x;
	private int y;
	
	public  ProvaHashSet(int x, int y) {
		this.x = x;
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
	public boolean equals(ProvaHashSet provaHashSet){
		if(provaHashSet instanceof ProvaHashSet){
			ProvaHashSet pts = provaHashSet;
			 if(x==pts.x && y==pts.y) {
				 return true;
			 }
		}  return false;
	}
	
}
