public class Product {
        public int id;
        public String name;
        public double quantity;
        public String unit;
        public double inputPrice;
        public double sellingPrice;
        public double sellingQuantity;

        public Product(int id, String name, double quantity, String unit, double inputPrice, double sellingPrice,
                       double sellingQuantity) {
            this.id = id;
            this.name = name;
            this.quantity = quantity;
            this.unit = unit;
            this.inputPrice = inputPrice;
            this.sellingPrice = sellingPrice;
            this.sellingQuantity = sellingQuantity;
        }

        @Override
        public String toString() {
            return "Sản phẩm - id: " + id +
                    ", Tên sản phẩm: " + name +
                    ", số lượng: " + quantity +
                    ", Đơn vị: " + unit +
                    ", Giá nhập: " + inputPrice +
                    ", Giá bán: " + sellingPrice +
                    ", Số lượng bán: " + sellingQuantity;
        }
    }

