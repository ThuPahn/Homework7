import java.util.Scanner;

public class ProductService {
    public Product inputProduct() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập Tên Sản Phẩm :");
        String name = sc.nextLine();

        System.out.print("Nhập Số Lượng : ");
        double quantity = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập Đơn vị: ");
        String unit = sc.nextLine();

        System.out.print("Nhập Giá Đầu Vào: ");
        double inputPrice = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập Giá Bán: ");
        double sellingPrice = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập Số Lượng Bán: ");
        double sellingQuantity = Double.parseDouble(sc.nextLine());

        return new Product(id, name, quantity, unit, inputPrice, sellingPrice, sellingQuantity);
    }

    public Product[] createProductArray(int size) {
        Product[] products = new Product[size];
        for (int i = 0; i < size; ++i) {
            System.out.println("Nhập Sản Phẩm [" + i + "]");
            products[i] = inputProduct();
        }
        return products;
    }

    public double calculateProfit(Product product) {
        return (product.sellingPrice - product.inputPrice) * product.sellingQuantity;
    }

    public void showProducts(Product[] products) {
        for (Product p : products) {
            System.out.printf("%s, Lợi Nhuận: %.1f\n", p, calculateProfit(p));
        }
    }

}