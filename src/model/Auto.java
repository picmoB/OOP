package model;

public class Auto {
    private String auto;
    private final int godina;
    private String model;

    public Auto(String auto, int godina, String model) {
        this.godina = godina;
        this.model = model;
        this.auto = auto;
    }

    // Getteri
    public String getAuto() {
        return auto;
    }

    public int getGodina() {
        return godina;
    }

    public String getModel() {
        return model;
    }

    // Setteri
    public void setModel(String model) {
        this.model = model;
    }

    public void showCarInfo() {
        System.out.println("Auto: " + auto + "\nGodina: " + godina + "\nModel: " + model);
    }
}
