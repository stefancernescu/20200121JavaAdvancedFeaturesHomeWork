package warehouse;

import warehouse.model.Item;
import warehouse.model.Warehouse;
import warehouse.controller.WarehouseImpl;

public class Main {
    public static void main(String[] args) {
//        WarehouseImpl warehouse = new WarehouseImpl();
//        warehouse.add(new Item("Bicicleta", 478.0, 3));
//        warehouse.add(new Item("Placa de snowboard", 1278.0, 1));
//        warehouse.add(new Item("Sac de cartofi", 1278.0, 1));
//        warehouse.displayAllItems();

        //warehouse.updateItem("Placa de snowboard", 50.0, 2);
        //warehouse.updatePrice("Placa de snowboard", 10.0);
        //warehouse.remove("Placa de snowboard");
        //warehouse.updateItem("Trotineta",21.0,1);
        //warehouse.remove("Cartofi");
        //warehouse.updateNumberOfPieces("Bicicleta",100);
        //warehouse.getTotalItems();
        //warehouse.getTotalValue();
        //warehouse.updatePiece("Bicicleta", 3);
        //warehouse.displayAllItems();

        Warehouse warehouse = new WarehouseImpl();
        Item item = new Item("Bicicleta", 478.0, 3);
        warehouse.add(item);
        warehouse.add(new Item("Placa de snowboard", 1278.0, 1));
        warehouse.add(new Item("Sac de cartofi", 78.0, 1));
        warehouse.add(new Item("Cauciucuri", 1500.0, 4));
        warehouse.add(new Item("Skiuri", 2700.0, 1));
        warehouse.add(new Item("Cutii goale", 0.0, 10));
        //warehouse.remove("Masina de tuns");
        // warehouse.updatePrice("Bicicletaaaaaa",500.0);
        //warehouse.updateItem("Cauciucuriiiii",700D,4);
        //warehouse.updateNumberOfPieces("Cauciucuri", 5);
        //warehouse.addMorePieces("Cauciucuri", 10);
        warehouse.getTotalNumberOFItems();
        warehouse.printTotalNumberOfItems();
        System.out.println();
        warehouse.displayAllItems();


    }
}
