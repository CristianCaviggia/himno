package shopping;

public class Product {

    private String code;
    private String title;
    private String description;
    private Double price;

    public Product(String code, String title, String description, Double price) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

}
