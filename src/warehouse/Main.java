package warehouse;

import warehouse.controller.WarehouseFactory;
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

        //Warehouse warehouse = new WarehouseImpl();
//        Item item = new Item("Bicicleta", 478.0, 3);
//        warehouse.add(item);
//        warehouse.add(new Item("Placa de snowboard", 1278.0, 1));
//        warehouse.add(new Item("Sac de cartofi", 78.0, 1));
//        warehouse.add(new Item("Cauciucuri", 1500.0, 4));
//        warehouse.add(new Item("Skiuri", 2700.0, 1));
//        warehouse.add(new Item("Cutii goale", 0.0, 10));
        //warehouse.remove("Masina de tuns");
        // warehouse.updatePrice("Bicicletaaaaaa",500.0);
        //warehouse.updateItem("Cauciucuriiiii",700D,4);
        //warehouse.updateNumberOfPieces("Cauciucuri", 5);
        //warehouse.addMorePieces("Cauciucuri", 10);
        //warehouse.getTotalNumberOFItems();
        //warehouse.printTotalNumberOfItems();
        //warehouse.displayAllItems();

//        try {
//            WarehouseFactory newFactory = new WarehouseFactory();
//            Warehouse pentry = newFactory.getWarehouse("pentry");
//            pentry.add(new Item("Borcan1",10.0,1));
//            pentry.add(new Item("Borcan2",12.0,2));
//            pentry.add(new Item("Borcan3",9.0,4));
//            pentry.add(new Item("Borcan4",4.0,1));
//            pentry.displayAllItems();
//
//            Warehouse garage = newFactory.getWarehouse("garage");
//            garage.add(new Item("Honda", 23500.0, 1));
//            garage.add(new Item("Maserati", 50000.0, 1));
//            garage.displayAllItems();
//        } catch (Exception ex) {
//            System.out.println("Exception main");
//            ex.printStackTrace();
//        }

        try {
            Warehouse garage = new WarehouseFactory().getWarehouse("Garage");
            garage.add(new Item("Honda", 23500.0, 1));
            garage.add(new Item("Maserati", 50000.0, 1));
            garage.add(new Item("Mercedes", 50000.0, 5));
            garage.add(new Item("Porche", 50000.0, 2));
            garage.add(new Item("BMW", 50000.0, 2));
            garage.displayAllItems();
            garage.printTotalNumberOfItems();
        }catch (Exception ex){
            System.err.println("Exception from main");
            ex.printStackTrace();
        }

    }
}
