package it.prova.provaset.test;

import java.util.HashSet;
import java.util.TreeSet;

import it.prova.provaset.model.ProvaHashSet;
import it.prova.provaset.model.ProvaTreeSet;

public class TestSet {

	public static void main(String[] args) {
		HashSet<ProvaHashSet> listaHashSet = new HashSet<ProvaHashSet>();
		ProvaHashSet phs1 = new ProvaHashSet(1,2);
		ProvaHashSet phs2 = new ProvaHashSet(3,4);
		
		listaHashSet.add(phs1);
		listaHashSet.add(phs1);
		
		for(ProvaHashSet prova : listaHashSet) {
			System.out.println(prova.getX() + "  :   " + prova.getY());
		}

		System.out.println("------------------");
		
		listaHashSet.add(phs2);
		for(ProvaHashSet prova2 : listaHashSet) {
			System.out.println(prova2.getX() + "  :   " + prova2.getY());
		}
		
		//----------------------------------------------------------------------
		System.out.println("------------------");
		System.out.println("------------------");
		
		TreeSet<ProvaTreeSet> listaTreeSet = new TreeSet<ProvaTreeSet>();
		ProvaTreeSet pts1 = new ProvaTreeSet(1,2);
		//ProvaTreeSet pts2 = new ProvaTreeSet(1,3);
		ProvaTreeSet pts3 = new ProvaTreeSet(1,4);
		ProvaTreeSet pts2 = new ProvaTreeSet(1,3);
		
		listaTreeSet.add(pts3);
		listaTreeSet.add(pts2);
		listaTreeSet.add(pts1);
		
		for(ProvaTreeSet prova : listaTreeSet) {
			System.out.println(prova.getX() + "  :   " + prova.getY());
		}
	}

}
