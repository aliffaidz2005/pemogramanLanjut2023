package restaurant;

import java.util.ArrayList;
import java.util.List;

class MenuItem {
    String name;
    double price;
    double rating;

    public MenuItem(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
}

class Restaurant {
    private List<MenuItem> menuItems;

    public Restaurant() {
        menuItems = new ArrayList<>();
    }

    // Metode untuk menambahkan item ke menu
    public void addItem(String name, double price, double rating) {
        MenuItem newItem = new MenuItem(name, price, rating);
        menuItems.add(newItem);
        System.out.println("Item added: " + name);
    }

    // Metode untuk menghapus item dari menu berdasarkan nama
    public void removeItem(String name) {
        for (MenuItem item : menuItems) {
            if (item.name.equalsIgnoreCase(name)) {
                menuItems.remove(item);
                System.out.println("Item removed: " + name);
                return;
            }
        }
        System.out.println("Item not found: " + name);
    }

    // Metode untuk menghitung peringkat rata-rata
    public double calculateAverageRating() {
        if (menuItems.isEmpty()) {
            System.out.println("No items in the menu to calculate rating.");
            return 0;
        }

        double totalRating = 0;
        for (MenuItem item : menuItems) {
            totalRating += item.rating;
        }

        return totalRating / menuItems.size();
    }
    // Metode untuk menampilkan semua item menu
    public void displayMenu() {
        if (menuItems.isEmpty()) {
            System.out.println("Menu is empty.");
        } else {
            System.out.println("Menu items:");
            for (MenuItem item : menuItems) {
                System.out.println(item.name + " - Price: Rp." + item.price + ", Rating: " + item.rating);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        restaurant.addItem("Burger", 20000, 4.3);
        restaurant.addItem("Pasta", 15000, 4.5);
        restaurant.addItem("Salad", 10000, 3.8);

        restaurant.displayMenu();

        System.out.println("Average Rating: " + restaurant.calculateAverageRating());

        restaurant.removeItem("Pasta");
        restaurant.displayMenu();

        System.out.println("Average Rating after removal: " + restaurant.calculateAverageRating());
    }
}
