package structural.facade;

public class OrderFacade {
    private BankAccount account = new BankAccount();
    private Database database = new Database();
    private ParcelService parcelService = new ParcelService();
    private Warehouse warehouse = new Warehouse();

    public void buy() {
        account.moneyTransfer();
        database.changeItemStatus();
        warehouse.packItem();
        parcelService.orderdelivery();
    }
}
