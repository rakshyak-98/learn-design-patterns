package observer.ecommercesystem;

import java.util.ArrayList;
import java.util.List;

interface ProductObserver {
    void update(ProductUpdate ProductUpdate);

}

interface ProductObservable {
    void addObserver(ProductObserver observer);

    void removeObserver(ProductObserver observer);

    void notifyObservers();

}

class ProductCatalog implements ProductObservable {
    private List<ProductObserver> observers;
    private List<Product> products;

    public ProductCatalog() {
        observers = new ArrayList<>();
        products = new ArrayList<>();
    }

    @Override
    public void addObserver(ProductObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ProductObserver observer) {
        int i = observers.indexOf(observer);
        if (i >= 0)
            observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            ProductObserver observer = (ProductObserver) observers.get(i);
            observer.update(new ProductUpdate(products));
        }
    }

    public void updateProductList(List<Product> updateProducts) {
        this.products = updateProducts;
        notifyObservers();
    }
}

class Product {
    private String productId;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
}

class ProductUpdate {
    private List<Product> updateProducts;

    public ProductUpdate(List<Product> updateProducts) {
        this.updateProducts = updateProducts;
    }

    public List<Product> getUpdateProducts() {
        return updateProducts;
    }
}

class InventoryManagementSystem implements ProductObserver {

    @Override
    public void update(ProductUpdate ProductUpdate) {
        System.out.println("Inventory Management System updated with new product information");
    }

}

class PricingEngine implements ProductObserver {
    @Override
    public void update(ProductUpdate ProductUpdate) {
        System.out.println("Pricing Engine adjusted product prices");
    }
}

class CustomerNotificationService implements ProductObserver {

    @Override
    public void update(ProductUpdate ProductUpdate) {
        System.out.println("Customer Notification Service sent alerts to subscribed users");
    }

}

public class ECommerceSystem {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();

        ProductObserver inventoryManagement = new InventoryManagementSystem();
        ProductObserver pricingEngine = new PricingEngine();
        ProductObserver customerNotification = new CustomerNotificationService();

        productCatalog.addObserver(inventoryManagement);
        productCatalog.addObserver(pricingEngine);
        productCatalog.addObserver(customerNotification);

        List<Product> updatedProducts = new ArrayList<>();
        updatedProducts.add(new Product("P003", "Tablet", 299.99, 30));
        updatedProducts.add(new Product("P004", "Laptop", 299.99, 30));
        productCatalog.updateProductList(updatedProducts);
    }
}