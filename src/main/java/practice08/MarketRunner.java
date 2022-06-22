package practice08;

public class MarketRunner {
    public static void main(String[] args) {

        Market obj1 = new Market("Cheese",10,15);
        System.out.println("productName:"+obj1.productName+" productPrice: $"+obj1.productPrice+" expirationDate: "+obj1.expirationDate);

        Market obj2 =new Market("Doll",20.50);
        System.out.println("productName:"+obj2.productName+" productPrice: $"+obj2.productPrice+" expirationDate: "+obj2.expirationDate);

        Market obj3 = new Market("Milk", 4.99,12);
        System.out.println("productName:"+obj3.productName+" productPrice: $"+obj3.productPrice+" expirationDate: "+obj3.expirationDate);

        Market obj4 = new Market("Salt",3.5);
        System.out.println("productName:"+obj4.productName+" productPrice: $"+obj4.productPrice+" expirationDate: "+obj4.expirationDate);

    }


}
