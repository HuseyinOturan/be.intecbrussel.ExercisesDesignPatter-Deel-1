package SingletonPattern;

public class App {

    public static void main(String[] args) {

        Product cips=new Product("cips");
        Product kola=new Product("kola");

        Inventory inventory=Inventory.getInventory();

        inventory.add(cips);
        inventory.add(kola);
        inventory.remove(kola);

        inventory.print();


    }
}
