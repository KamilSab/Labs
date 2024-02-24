package Pizzeria;

public class Client extends Human {
    private Discount discount;
    public Client(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        if (gender == Gender.Female) {
            discount = Discount.Female;
        }
    }
}
