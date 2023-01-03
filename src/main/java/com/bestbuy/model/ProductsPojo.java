package com.bestbuy.model;

public class ProductsPojo {
    private String name;
    private String type;
    private double price;
    private Integer shipping;
    private String upc;
    private String description;
    private String manufacture;
    private String model;
    private String url;
    private String image;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getShipping() {
        return shipping;
    }
    public void setShipping(Integer shipping) {
        this.shipping = shipping;
    }
    public String getUpc(){
        return upc;
    }
    public void setUpc(String upc){
        this.upc = upc;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getManufacture(){
        return manufacture;
    }
    public void setManufacture(String manufacture){
        this.manufacture = manufacture;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getUrl(){
        return url;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public String getImage(){
        return image;
    }
    public void setImage(String image){
        this.image = image;
    }

    public static ProductsPojo getProductsPojo(String name, String type, double price, Integer shipping, String upc, String description,
                                               String manufacture, String model, String url, String image){
        ProductsPojo productsPojo = new ProductsPojo();
        productsPojo.setName(name);
        productsPojo.setType(type);
        productsPojo.setPrice(price);
        productsPojo.setShipping(shipping);
        productsPojo.setUpc(upc);
        productsPojo.setDescription(description);
        productsPojo.setManufacture(manufacture);
        productsPojo.setModel(model);
        productsPojo.setUrl(url);
        productsPojo.setImage(image);
        return productsPojo;
    }

}
