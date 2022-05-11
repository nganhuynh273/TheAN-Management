package hpn.model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Order {
    //    public Object getId;
    private long orderID;
    private String name;
    private String phone;
    private String address;
    private Instant createdAt;

    private List<OrderItem> orderItems = new ArrayList<>();

    public Order() {
    }

    public Order(long orderID, String name, String phone, String address) {
        this.orderID = orderID;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public Order(String record) {
        String[] field = record.split(",");
        orderID = Long.parseLong(field[0]);
        name = field[1];
        phone = field[2];
        address = field[3];
        createdAt = Instant.parse(field[4]);
//        createdAt = DateUtils.stringToDate(field[4]);
    }

//    public Order(long orderID, String name, String phone, String address, long currentTimeSecond) {
//    }


    public Instant getCreatedAt() {

        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {

        this.createdAt = createdAt;
    }

    public long getOrderID() {

        return orderID;
    }

    public void setOrderID(int orderID) {

        this.orderID = orderID;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    @Override
    public String toString() {
//        return orderID +
//                "," + name +
//                "," + phone +
//                "," + address
//                + "," + createdAt;
        return String.format("%d,%s,%s,%s,%s", orderID, name, phone, address, createdAt);
    }

}
