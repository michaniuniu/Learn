package pl.sikora.entity;

public class Boots extends Product{

    private int size;
    private boolean isNaturalSkin;

    public Boots(Long id, String productName, float price, float weigth, String color, int count, int size, boolean isNaturalSkin) {
        super(id, productName, price, weigth, color, count);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    public int getSize() {
        return size;
    }

    public boolean isNaturalSkin() {
        return isNaturalSkin;
    }

    @Override
    public String toString() {
        return "Boots{" +
                "size=" + size +
                ", isNaturalSkin=" + isNaturalSkin +
                '}';
    }
}
