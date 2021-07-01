package assginment.model;

import assginment.entity.Orders;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class OrdersModelImplement implements OrdersModel {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Orders> list = new ArrayList<>();
    {
        list.add(new Orders("A001","Hoang Kien","1kg thit",50000));
        list.add(new Orders("A002","Hoang Kien","1kg thit",50000));
        list.add(new Orders("A003","Hoang Kien","1kg thit",50000));
        list.add(new Orders("A004","Hoang Kien","1kg thit",50000));
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

//    @Override
//    public String validateText(String text) {
//        for (int i=0;i<5;i++){
//            if (text.length()<4 || text == null){
//                System.out.println("Please enter at least 5 character: ");
//               text = scanner.nextLine();
//                break;
//            }else {
//                System.out.println("");
//                break;
//            }
//        }
//        return text;
//    }
//
//    @Override
//    public int validatePrice(int price) {
//        return 0;
//    }
}
