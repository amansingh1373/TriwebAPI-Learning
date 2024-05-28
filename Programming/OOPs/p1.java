import java.util.Scanner;



class Pen {
    String color;
    int price;

    void write(String s) {
        System.out.println("Writing " + s);
    }
    
}

class Ballpen extends Pen {
    String tipType;
    void write(String s) {
        System.out.println("Writing " + s + " with Ballpen");
    }
}


class Main {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        System.out.println("enter a color:");
        Scanner sc = new Scanner(System.in);
        p1.color = sc.nextLine();
        System.out.println("enter the price:");
        p1.price = sc.nextInt();
        sc.nextLine(); 
        Ballpen bp = new Ballpen();
        System.out.println("enter a color for ball pen:");
        bp.color = sc.nextLine();
        System.out.println("enter the price for ball pen:");
        bp.price = sc.nextInt();
        sc.nextLine(); 
        System.out.println("enter the tip type for ball pen:");
        bp.tipType = sc.nextLine();
        p1.write("Hello");
        bp.write("amazing");
    }
}