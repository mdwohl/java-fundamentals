package inheritance;

public class Shop {
    String name;
    String description;
    int priceCategory;

    public Shop(String name, String description, int priceCategory){
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
    }

    public String toString(){
        return String.format("Name: %s Description: %s Price: %d", name, description, priceCategory);
    }

}
