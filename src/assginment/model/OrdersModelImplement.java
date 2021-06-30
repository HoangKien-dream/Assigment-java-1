package assginment.model;

import assginment.entity.Orders;

import java.util.ArrayList;
import java.util.Date;

public class OrdersModelImplement implements OrdersModel {
    ArrayList<Orders> list = new ArrayList<>();
    {
        list.add(new Orders("A001","Hoang Kien","1kg thit","50000","2021-09-23",1));
        list.add(new Orders("A002","Hoang Kien","1kg thit","50000","2021-10-29",1));
        list.add(new Orders("A003","Hoang Kien","1kg thit","50000","2021-06-01",1));
        list.add(new Orders("A004","Hoang Kien","1kg thit","50000","2021-07-19",1));
    }
    @Override
    public boolean save(Orders obj) {
        list.add(obj);
        return true;
    }

    @Override
    public ArrayList<Orders> findAll() {
        return list;
    }

    @Override
    public Orders findById(String Id) {
        Orders obj = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getiDOrder().equals(Id)) {
                obj = list.get(i);
                break;
            }
        }
        return obj;
    }



    @Override
    public ArrayList<Orders> findByTime(Date startDate, Date endDate) {
        ArrayList<Orders> listDate = new ArrayList<>();
        for (int i =0;i<list.size();i++){
            Date creatAt = list.get(i).getCreateAt();
            if (startDate.before(creatAt)&&endDate.after(creatAt)){
                  listDate.add(list.get(i));
            }
        }
        return listDate;
    }
}
