package Pizzeria;

public class Client extends Person{
    /*public Client(String name, Gender gender, DiscountCategory category) {
        super(name, gender);
    }
    private DiscountCategory discountCategory;

    public DiscountCategory getDiscountCategory() {
        return discountCategory;
    }

    public void setDiscountCategory(DiscountCategory discountCategory) {
        this.discountCategory = discountCategory;
    }*/
    private DiscountCategory discountCategory;
    public Client(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public Client(String name, Gender gender, DiscountCategory discountCategory) {
        this.name = name;
        this.gender = gender;
        this.discountCategory = discountCategory;
    }
}
