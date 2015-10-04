package appli;

import java.util.List;

import conf.Marque;



public class Vehicule {

	private double prix;
	private String nom ;
	private List<Option> options;
	private Marque nomMarque;
	
	public double getPrix() {
		return prix;
	}
	public String getNom() {
		return nom;
	}
	public List<Option> getOptions() {
		return options;
	}
	public Marque getNomMarque() {
		return nomMarque;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	public void setNomMarque(Marque nomMarque) {
		this.nomMarque = nomMarque;
	}
	
}

