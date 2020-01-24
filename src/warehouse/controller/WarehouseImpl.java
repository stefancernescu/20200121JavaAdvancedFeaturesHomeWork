package warehouse.controller;

import org.jetbrains.annotations.NotNull;
import warehouse.model.ItemEnum;
import warehouse.model.Warehouse;
import warehouse.model.Item;

import java.util.*;

//Warehouse HAS items
public class WarehouseImpl implements Warehouse {
    private Queue<Item> items;

    public WarehouseImpl() {
        items = new LinkedList<>();
    }

    @Override
    public Warehouse add(@NotNull Item item) {
        System.out.println("Adding \"" + item.getName() + "\" to warehouse.");
        items.add(item);
        return this;
    }

    @Override
    public void remove(String itemName) {
        System.out.println("Removing \"" + itemName + "\"");
        for (Item each : items) {
            //Cazul in care gaseste elementul cautat
            if (each.getName().equalsIgnoreCase(itemName)) {
                items.remove(each);
                System.out.println("\"" + each.getName() + "\" has been removed");
                //iese din corpul metodei cand ajunge la instructiune
                return;
            }
        }
        System.out.println("The item \"" + itemName + "\" does not exist.");
    }

    @Override
    public Warehouse displayAllItems() {
        System.out.println("The Warehouse has the next items: ");
        for (Item each : items) {
            System.out.println(each.getName() + " price " + each.getPrice() + " number of items " + each.getPiece());
        }
        return this;
    }

    //cautare in functie de numele itemului, actualizare pret si numar de bucati
    @Override
    public void updateItem(String itemName, Double price, Integer piece) {
        //parcurgerea cozii ce contine elemente
        for (Item each : items) {
            if (each.getName().equalsIgnoreCase(itemName)) {
                System.out.println("Updating price and number of products for the item " + "\"" + each.getName() + "\"");
                System.out.println("Price before updating " + each.getPrice());
                System.out.println("Pieces before updating " + each.getPiece());
                each.setPrice(price);
                each.setPiece(piece);
                System.out.println("Price after updating " + each.getPrice());
                System.out.println("Pieces after updating " + each.getPiece());
                return;
            }
        }
        System.out.println("\"" + itemName + "\" does not exist in the warehouse.");
    }

    @Override
    public void updatePrice(String itemName, Double price) {
        for (Item each : items) {
            if (each.getName().equals(itemName)) {
                each.setPrice(price);
                System.out.println("Price has been updated to " + each.getPrice() + " Lei for the item \"" + each.getName() + "\"");
                return;
            }
        }
        System.out.println("\"" + itemName + "\" doesn't exist in the warehouse.");
    }

    @Override
    public void addMorePieces(String itemName, Integer numberOfPiece) {
        for (Item each : items) {
            if (each.getName().equalsIgnoreCase(itemName)) {
                Integer newNumberOfPieces = each.getPiece() + numberOfPiece;
                each.setPiece(newNumberOfPieces);
                System.out.println("Number of pieces for item " + itemName + " was increased to " + each.getPiece());
                return;
            }
        }
        System.out.println("The item \"" + itemName + "\" does not exist in the warehouse.\nIt can't be updated.");
    }

    @Override
    public Map<String, Integer> getTotalNumberOFItems() {
        Integer numberTotalOfItems = 0;
        Map<String, Integer> numberOfItems = new TreeMap<>();
        for (Item each : items) {
            numberOfItems.put(each.getName(), each.getPiece());
            numberTotalOfItems += each.getPiece();
        }
        numberOfItems.put("Number of total Items", numberTotalOfItems);
        return numberOfItems;
    }

    @Override
    public void printTotalNumberOfItems() {
        Map<String, Integer> enumIntegerMap = getTotalNumberOFItems();
        Iterator<Map.Entry<String, Integer>> iterator = enumIntegerMap.entrySet().iterator();
        System.out.println("Number of items from warehouse: ");
        System.out.println("Type\t\tNumber of item(s)");
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            System.out.println(pair.getKey() + "\t\t" + pair.getValue());
        }
    }


    @Override
    public Warehouse getTotalValue() {
        Double totalValue = 0D;
        for (Item each : items) {
            totalValue += each.getPrice();
        }
        System.out.println("Total value from the warehouse is " + totalValue);
        return this;
    }


}
