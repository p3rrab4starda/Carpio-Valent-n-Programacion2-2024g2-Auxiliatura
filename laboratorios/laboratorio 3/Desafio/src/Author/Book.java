package Author;

public class Book extends Author{
    private String Title;
    private Double Price;
    public Book(String Title, String Name, Double Price){
        super(Name);
        this.Title = Title;
        this.Price = Price;
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }
    public Double getPrice() {
        return Price;
    }
    public void setPrice(Double price) {
        Price = price;
    }
    public void getInfo(){
        System.out.println("Titulo de la obra: " + getTitle() + " Autor: " + getName() + " Precio: " + getPrice());
    }
}
