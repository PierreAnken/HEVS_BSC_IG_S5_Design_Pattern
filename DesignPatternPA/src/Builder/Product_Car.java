package Builder;

public class Product_Car {

    private String freins;
    private String couleur;
    private String phares;
    private String pneus;
    private String marque;

    public Product_Car(String marque){
        this.marque = marque;
    }


    public void setFreins(String freins) {
        this.freins = freins;
    }


    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }


    public void setPhares(String phares) {
        this.phares = phares;
    }

    public void setPneus(String pneus) {
        this.pneus = pneus;
    }

    public String toString(){
        return marque+" "+couleur+" avec freins "+freins+", phares "+phares+" et pneus "+pneus;
    }

}
