package Task1;

public class Element {
    private String brand;
    private String model;
    private String tyres;
    Element(String brand, String model, String tyres){
        this.brand = brand;
        this.model = model;
        this.tyres = tyres;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public void setTyres(String tyres) {
        this.tyres = tyres;
    }

    @Override
    public String toString() {
        return "Element{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", tyres='" + tyres + '\'' +
                '}';
    }
}
