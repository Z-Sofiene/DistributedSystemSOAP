package domaine;

import java.util.Date;

public class Produit {

    private Long id;
    private String designation;
    private double prix;
    private int quantite;
    private static final long serialVersionUID = 1L;
    private Date dateAchat;

    public Produit() {
    }

    public Produit(Long id, String designation, double prix, int quantite, Date dateAchat) {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
        this.quantite = quantite;
        this.dateAchat = dateAchat;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", prix=" + prix +
                ", quantite=" + quantite +
                ", dateAchat=" + dateAchat +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }
}
