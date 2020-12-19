public class Dealership {


    public static void main(String[] args) {

        Client clt1 = new Client("Kevin", "11 9 6543-5678", 15);
        Pizza pizza1 = new Pizza("Margerita", 15);
        Sales sales1 = new Sales("Peter Parker", "Junior Sales");

        makeSale(clt1, sales1,pizza1, true);
    }

    public static void makeSale(Client client, Sales sales, Pizza pizza, boolean hasCashOnHand) {
        client.orderPizza(sales, pizza, hasCashOnHand);
    }
}