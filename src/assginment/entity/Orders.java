package assginment.entity;

import assginment.util.DateTimeUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Orders {
    private String iDOrder;
    private String customerName;
    private String product;
    private String prices;
    private Date createAt;
    private int status;

    @Override
    public String toString() {
        return String.format("%10s%10s%10s | %10s%15s%10s | %5s%10s%5s | %5s%10s%5s | %5s%20s%5s | %5s%5s%5s |  \n",
                "", iDOrder, "",
                "", customerName, "",
                "", product, "",
                "", prices, "",
                "",getDobString(), "",
                "", getStatusName(), "");
    }
    private String getDobString() {
        return DateTimeUtil.formatDateToString(createAt);
    }


    private String getStatusName() {
        return this.status == 1 ? "Active" :"Deactive";
    }


    public Orders() {
    }

    public Orders(String iDOrder, String customerName, String product, String prices, Date createAt, int status) {
        this.iDOrder = iDOrder;
        this.customerName = customerName;
        this.product = product;
        this.prices = prices;
        this.createAt = Calendar.getInstance().getTime();
        this.status = 1;
    }
    public Orders(String iDOrder, String customerName, String product, String prices, String strCreateAt, int status) {
        this.iDOrder = iDOrder;
        this.customerName = customerName;
        this.product = product;
        this.prices = prices;
        this.createAt = DateTimeUtil.parseDateFromString(strCreateAt);
        this.status = 1;
    }
    public String getiDOrder() {
        return iDOrder;
    }

    public void setiDOrder(String iDOrder) {
        this.iDOrder = iDOrder;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getPrices() {
        return prices;
    }

    public void setPrices(String prices) {
        this.prices = prices;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
