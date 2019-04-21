package id.ac.umn.pointofsales;

public class Product {
    private String name;
    private int price;
    private String id;
    private int qty;

    public Product(String id, String name, int price) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.qty = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void minusQty() {
        this.qty--;
    }

    public void plusQty(){
        this.qty++;
    }
}
