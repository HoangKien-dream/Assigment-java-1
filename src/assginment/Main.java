package assginment;

import assginment.entity.Orders;
import assginment.view.OrdersView;
import assginment.view.OrdersViewImplement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        OrdersView ordersView = new OrdersViewImplement();
//        ordersView.generateMenu();
        Orders orders = new Orders();
        System.out.println(orders.getCreateAt());
    }
}
