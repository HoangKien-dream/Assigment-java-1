package assginment.controller;

import assginment.entity.Orders;
import assginment.model.OrdersModel;
import assginment.model.OrdersModelImplement;
import assginment.util.DateTimeUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class OdersControllerImplement implements OrdersController {
    private OrdersModel ordersModel;
    private Scanner scanner;

    public OdersControllerImplement() {
        this.ordersModel = new OrdersModelImplement();
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void addNewOrder() {
        Orders orders = new Orders();
        System.out.println("Please enter ID Orders: ");
        String idOrder = scanner.nextLine();
        orders.setiDOrder(idOrder);
        System.out.println("Please enter nameCustomer: ");
        String nameCustomer = scanner.nextLine();
        orders.setCustomerName(nameCustomer);
        System.out.println("Please enter product: ");
        String product = scanner.nextLine();
        orders.setProduct(product);
        System.out.println("Please enter total prices: ");
        String prices = scanner.nextLine();
        orders.setPrices(prices);
        if (ordersModel.save(orders)) {
            System.out.println("Action success!!");
        } else {
            System.out.println("Action failed ");
        }
    }

    @Override
    public void searchById() {
        System.out.println("Please enter Id order u want to search: ");
        String idOrder = scanner.nextLine();
        Orders orders = ordersModel.findById(idOrder);
        if (orders == null) {
            System.out.println("Not Found!!!");
        } else {
            System.out.printf("Found information Orders\n %s", orders.toString());
        }

    }

    @Override
    public void revenueByTime() {
        System.out.println("Please enter starDate(yyyy-mm-DD),for example: 2001-10-29: ");
        String startDate = scanner.nextLine();
        Date startDob = DateTimeUtil.parseDateFromString(startDate);
        System.out.println("Please enter endDate (yyyy-mm-DD),for example: 2001-10-29: ");
        String endDate = scanner.nextLine();
        Date endDob = DateTimeUtil.parseDateFromString(endDate);
        ArrayList<Orders> date = ordersModel.findByTime(startDob,endDob);
        if (date == null){
            System.out.printf("Have no finished order from time %s to %s",startDate,endDate);
        }else {
            System.out.printf("%10s%10s%10s | %10s%15s%10s | %5s%15s%5s | %5s%10s%5s | %5s%20s%5s | %5s%5s%5s |  \n",
                    "", "IdOrder", "",
                    "", "CustomerName", "",
                    "", "Product", "",
                    "", "TotalPrices", "",
                    "", "CreateAt", "",
                    "", "Status", "");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            for (int i = 0; i < date.size(); i++) {
                System.out.println(date.get(i).toString());
            }
        }

    }

    @Override
    public void showList() {
        ArrayList<Orders> list = ordersModel.findAll();
        System.out.printf("%10s%10s%10s | %10s%15s%10s | %5s%15s%5s | %5s%10s%5s | %5s%20s%5s | %5s%5s%5s |  \n",
                "", "IdOrder", "",
                "", "CustomerName", "",
                "", "Product", "",
                "", "TotalPrices", "",
                "", "CreateAt", "",
                "", "Status", "");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
