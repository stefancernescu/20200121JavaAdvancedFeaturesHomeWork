package warehouse;

public interface Warehouse {
    Warehouse add(Item item);

    Warehouse remove(String itemName);

    Warehouse displayAllItems();

    void updateItem(String itemName, Double price, Integer piece);

    void updatePrice(String itemName, Double price);

    Warehouse getTotalItems();

    Warehouse getTotalValue();

    Warehouse updatePiece(String itemName, Integer numberOfPiece);
}
