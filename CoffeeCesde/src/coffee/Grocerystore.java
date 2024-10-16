package coffee;

import java.util.Date;
import java.util.Scanner;

public class Grocerystore {
    static Scanner sc = new Scanner(System.in);
    //Cliente
    static int id;
    static String name;
    static String email;
    static String password;
    //Product
    static int productId;
    static String productName;
    static double productPrice;
    static double quantity;
    //Sale
    static int saleId;
    static Date date;
    static String costumer;
    static String product;
    static double price;
    static double quantityToSale;
    static double total;

    static String[][] costumers = new String[3][4];
    static String[][] products = new String[3][4];

    public static void main(String[] args) {
        agregateToCostumers();
        listCostumers();
        agregateToProducts();
        listProducts();
    }

    public static String[] createCostumer() {
        String[] costumer = new String[4];

        System.out.println("ingrese el id");
        id = sc.nextInt();
        costumer[0] = id + "";
        sc.nextLine();

        System.out.println("ingrese el nombre");
        name = sc.nextLine();
        costumer[1] = name;

        System.out.println("ingrese el correo");
        email = sc.nextLine();
        costumer[2] = email;

        System.out.println("ingrese la password");
        password = sc.nextLine();
        costumer[3] = password;

        return costumer;


    }

    static void agregateToCostumers() {
        int i = 0;
        while (i < costumers.length) {

            costumers[i] = createCostumer();
            i++;
        }
    }

    public static void listCostumers() {
        for (int i = 0; i < costumers.length; i++) {
            for (int j = 0; j < costumers[i].length; j++)
                System.out.println(costumers[i][j]);
        }
    }

    public static void createAdmin(String[] args) {
        String[] admin = new String[3];

        System.out.println("ingrese el id");
        id = sc.nextInt();

        admin[0] = id + "";
        sc.nextLine();

        System.out.println("ingrese el nombre");
        name = sc.nextLine();
        admin[1] = name;

        System.out.println("ingrese el correo");
        email = sc.nextLine();
        admin[2] = email;

        System.out.println("ingrese el password");
        password = sc.nextLine();
        admin[3] = password;
    }

    public static String[] createProducts() {
        String[] products = new String[4];

        System.out.println("ingrese el id");
        productId = sc.nextInt();
        products[0] = productId + "";
        sc.nextLine();

        System.out.println("ingrese el nombre del producto");
        productName = sc.nextLine();
        products[1] = productName;

        System.out.println("ingrese el precio");
        productPrice = sc.nextDouble();
        products[2] = productPrice + "";
        sc.nextLine();

        System.out.println("ingrese la cantidad");
        quantity = sc.nextDouble();
        products[3] = quantity + "";
        sc.nextLine();

        return products;
    }

    static void agregateToProducts() {
        int i = 0;
        while (i < products.length) {

            products[i] = createCostumer();
            i++;
        }
    }
    public static void listProducts(){
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++)
                System.out.println(products[i][j]);
        }
    }
}