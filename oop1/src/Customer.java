//burada inheritance yani kalıtım öğreneceğiz.
//hem bireysel hem de kurumsal müşteri olduğunu varsayalım.
//burada ortak olan fieldları oluşturuyoruz.
public class Customer {
    private int id;
    private String customerNumber;
    private String phone;

    //getter ve setter işlemlerini gerçekleştirelim.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
