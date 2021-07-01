package assginment.model;

import assginment.entity.Orders;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface OrdersModel {
    boolean save (Orders obj);
    public ArrayList<Orders> findAll();
    Orders findById(String Id);
    public ArrayList<Orders> findByTime(Date startDate, Date endDate);
//    public String validateText (String text);
//    public int validatePrice (int price);
}
