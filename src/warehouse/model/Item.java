package warehouse.model;

public class Item {
    private String name;
    private Double price;
    //numarul de bucati pentru fiecare item
    private Integer piece;

    public Item(){
        super();
    }

    public Item(String name, Double price, Integer piece) {
        super();
        this.name = name;
        this.price = price;
        this.piece = piece;
    }

    //Daca se introduce doar numele, obiectul va primi niste valori default pentru celelalte 2 variabile
    public Item(String name) {
        super();//apelarea constructorului din clasa parinte Object
        this.name = name;
        this.price = 300.0;
        this.piece = 1;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getPiece() {
        return piece;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setPiece(Integer piece) {
        this.piece = piece;
    }

}
