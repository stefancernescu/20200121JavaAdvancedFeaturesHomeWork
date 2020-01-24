package warehouse;

public class Item {
    private String name;
    private Double price;
    private Integer piece;

    public Item(String name, Double price, Integer piece) {
        this.name = name;
        this.price = price;
        this.piece = piece;
    }

    //Daca se introduce doar numele, obiectul va primi niste valori default
    public Item(String name) {
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
