package pl.sikora.entity;

public class Product {

    private Long id;
    private String productName;
    private float price;
    private float weigth;
    private String color;
    private int count;

    public Product(Long id, String productName, float price, float weigth, String color, int count) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.weigth = weigth;
        this.color = color;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public float getWeigth() {
        return weigth;
    }

    public String getColor() {
        return color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", weigth=" + weigth +
                ", color='" + color + '\'' +
                ", count=" + count +
                '}';
    }
}
