import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> items;
    private double total;

    public Order(List<String> items, double total) {
        this.items = new ArrayList<>(items); 
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public List<String> getItems() {
        return items;
    }

    public void addItem(String item, double price) {
        items.add(item);
        total += price;
    }

    public void removeItem(String item, double price) {
        if (items.remove(item)) { 
            total -= price;
        }
    }
}
