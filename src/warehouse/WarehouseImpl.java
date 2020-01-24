package warehouse;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//Warehouse HAS items
public class WarehouseImpl implements Warehouse {
    private Queue<Item> items;

    public WarehouseImpl() {
        items = new LinkedList<>();
    }

    public Warehouse add(Item item) {
        System.out.println("Adding \"" + item.getName() + "\" to warehouse.");
        items.add(item);
        return this;
    }

    public Warehouse remove(String itemName) {
        System.out.println("Removing \"" + itemName + "\"");
        for (Item each : items) {
            //Cazul in care gaseste elementul cautat
            if (each.getName().equalsIgnoreCase(itemName)) {
                items.remove(each);
                System.out.println("\"" + each.getName() + "\" has been removed");
                break;//iese din corpul metodei cand ajunge la instructiune
            } else {
                //Cazul in care nu gaseste elementul cautat
                System.out.println("The item that you are tryin to remove does not exist.");
                break;
            }
        }
        return this;
    }

    public Warehouse displayAllItems() {
        System.out.println("The Warehouse has the next items: ");
        for (Item each : items) {
            System.out.println(each.getName() + " price " + each.getPrice() + " number of items " + each.getPiece());
        }
        return this;
    }

    //cautare in functie de numele itemului, actualizare pret si numar de bucati
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
            }
        }
        System.out.println("Updated");
        return;
    }


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

    public void updateNumberOfPieces(String itemName, Integer newPieceNumber) {
        Iterator<Item> each = items.iterator();
        while (each.hasNext()) {
            if (each.next().getName().equalsIgnoreCase(itemName)) {
                each.next().setPiece(newPieceNumber);
                System.out.println("Number of pieces has been updated to " + newPieceNumber + " for the product \"" + itemName + "\"");
                return;
            } else {
                System.out.println("\"" + itemName + "\" does not exist in the warehouse.");
                return;
            }
        }
    }

    public Warehouse getTotalItems() {
        System.out.println("Number of total items from warehouse: " + items.size());
        return this;
    }

    public Warehouse getTotalValue() {
        Double totalValue = 0D;
        for (Item each : items) {
            totalValue += each.getPrice();
        }
        System.out.println("Total value from the warehouse is " + totalValue);
        return this;
    }

    @Override
    public Warehouse updatePiece(String itemName, Integer numberOfPiece) {
        for (Item each : items) {
            if (each.getName().equalsIgnoreCase(itemName)) {
                Integer newNumberOfPieces = each.getPiece() + numberOfPiece;
                each.setPiece(newNumberOfPieces);
                System.out.println("Number of pieces for item " + itemName + " was increased.");
                break;
            } else {
                System.out.println("Item was not found");
                break;
            }
        }
        return this;
    }
}
