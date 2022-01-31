package Curs9;

public class Laptop extends Product{

    int buyingPrice;
    int TVA;
    int adaosCommercial;

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public int getTVA() {
        return TVA;
    }

    public void setTVA(int TVA) {
        this.TVA = TVA;
    }

    public int getAdaosCommercial() {
        return adaosCommercial;
    }

    public void setAdaosCommercial(int adaosCommercial) {
        this.adaosCommercial = adaosCommercial;
    }

    public Laptop (int buyingPrice, int TVA, int adaosCommercial){
        setBuyingPrice(buyingPrice);
        setAdaosCommercial(adaosCommercial);
        setTVA(TVA);
    }

    @Override
    int calculatePrice() {
        return buyingPrice + TVA + adaosCommercial;
    }
}
