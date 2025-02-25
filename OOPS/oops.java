class Pen {
    String color;
    String type;
    String name;
    int valid;

    public void write() {
        System.out.println("Writing something...");
        System.out.println(this.name);
        System.out.println(this.valid);
    }

    public void printColor() {
        System.out.println(this.color);
    }

    Pen(String name, int valid) {
        System.out.println("Constructor called");
        this.name = name;
        this.valid = valid;

    }
}

public class oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen("Rahul", 23);
        // pen1.color = "blue";
        // pen1.type = "gel";
        pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color = "Black";
        // pen2.type = "ballpoint";
        // pen1.printColor();
        // pen2.printColor();
    }
}