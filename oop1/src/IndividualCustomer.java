public class IndividualCustomer extends Customer{
    //bireysel müşteri bir müşteridir. Maine gidip bireysel müşteri nesnesi oluşturduğumuzda ortak olan fieldlar gelecektir.
    //burada oluşturacağımız fieldlar sadece bireysel müşteriye ait olan ortak olmayanlardır.
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
