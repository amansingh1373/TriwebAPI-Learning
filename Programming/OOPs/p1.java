class Pen {
    String color;
    int price;

    void write(String s) {
        System.out.println("Writing " + s);
    }
    
}

class p1 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.price = 10;
        p1.write("Hello");
    }
}