package assginment;

import assginment.entity.Orders;
import assginment.view.OrdersView;
import assginment.view.OrdersViewImplement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrdersView ordersView = new OrdersViewImplement();
        ordersView.generateMenu();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your text: ");
//        String text = scanner.nextLine();
//        for (int i = 0; i < 5; i++) {
//            if (text.length() < 5) {
//                System.out.println("Please enter agian: ");
//                text = scanner.nextLine();
//            } else {
//                System.out.println(" ");
//            }
//            System.out.printf("%s", text);
//        }
  }
}
