package ChapterThree;

public class PetrolPurchase {

    private String stationLocation;
    private String typeOfPetrol;
    private int quantity;
    private double pricePerLiter;
    private double percentageDiscount;

    public PetrolPurchase() {
    }

    public PetrolPurchase(String stationLocation, String typeOfPetrol, int quantity, double pricePerLiter, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.typeOfPetrol = typeOfPetrol;
        this.quantity = quantity;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public void setTypeOfPetrol(String typeOfPetrol) {
        this.typeOfPetrol = typeOfPetrol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPurchaseAmount() {
        double netPurchaseAmount = quantity * pricePerLiter;

        return netPurchaseAmount;
    }
}
