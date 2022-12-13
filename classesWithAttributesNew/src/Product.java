public class Product {

    public Product(int id, String name, String description, double price, int stockAmount){
        System.out.println("Yapici blok calisti");
        this._id = id;
        this._name = name;
        this._description = description;
        this._price = price;
        this._stockAmount = stockAmount;

    }
    public Product(){

    }

    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;

    //getter
    public int getID() {
        return _id;
    }
    //setter
    public void setId(int id) {
        _id = id;
    }
}
