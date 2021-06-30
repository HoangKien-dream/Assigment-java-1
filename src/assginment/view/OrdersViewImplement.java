package assginment.view;

import assginment.controller.OdersControllerImplement;
import assginment.controller.OrdersController;
import assginment.view.OrdersView;

import java.util.Scanner;

public class OrdersViewImplement implements OrdersView {
    private OrdersController ordersController;

    public OrdersViewImplement() {
        this.ordersController = new OdersControllerImplement();
    }

    Scanner scanner = new Scanner(System.in);
    public void generateMenu() {
         while (true){
             System.out.printf("Student Manager\n");
             System.out.printf("--------------------\n");
             System.out.printf("1. Create new order.\n");
             System.out.printf("2. Show list\n");
             System.out.printf("3. Search order by id.\n");
             System.out.printf("4. Revenue by time.\n");
             System.out.printf("5. Exit program\n");
             System.out.printf("--------------------\n");
             System.out.printf("Please enter your choice (1-4): \n");
             int choice = scanner.nextInt();
             scanner.nextLine();
             switch (choice){
                 case 1:
                    ordersController.addNewOrder();
                     break;
                 case 2:
                     ordersController.showList();
                     break;
                 case 3:
                      ordersController.searchById();
                     break;
                 case 4:
                     ordersController.revenueByTime();
                     break;
                 case 5:
                     System.out.println("Exit program");
                     break;
                 default:
                     System.out.printf("Please choice again (1-4)");
                     break;
             }
             scanner.nextLine();
             if (choice == 5){
                 break;
             }
         }
    }
}
