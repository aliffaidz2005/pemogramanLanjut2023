package circle;

class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}


public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Luas: " + String.format("%.2f", circle.calculateArea()));
        System.out.println("Keliling: " + String.format("%.2f", circle.calculateCircumference()));

        circle.setRadius(9);

        System.out.println("Radius setelah diubah: " + circle.getRadius());
        System.out.println("Luas setelah diubah: " + String.format("%.2f", circle.calculateArea()));
        System.out.println("Keliling setelah diubah: " + String.format("%.2f", circle.calculateCircumference()));
    }
}

