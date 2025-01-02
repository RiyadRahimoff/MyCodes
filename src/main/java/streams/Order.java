package streams;

import java.time.LocalDate;
import java.util.Locale;

public class Order {
    private long id;
    private String status;
    private LocalDate orderDate;


    public Order(long id, LocalDate orderDate, String status) {
        this.id = id;
        this.orderDate = orderDate;
        this.status = status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}
