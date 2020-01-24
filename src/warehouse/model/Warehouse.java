package warehouse.model;

import java.util.Map;

public interface Warehouse {
    Warehouse add(Item item);

    void remove(String itemName);

    Warehouse displayAllItems();

    void updateItem(String itemName, Double price, Integer piece);

    void updatePrice(String itemName, Double price);

    //Increase number of pieces/item
    void addMorePieces(String itemName, Integer newPieceNumber);

    Map<String, Integer> getTotalNumberOFItems();

    Warehouse getTotalValue();

    public void printTotalNumberOfItems();
}
