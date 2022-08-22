public class Master {
    private static String name;

    //constructor
    public Master() {name = "unknown";}
    public Master(String name) {this.name = name;}

    //methods
    public String getName() {return name;}
    public static void display() {System.out.println("Trained by: " + name + "\n");}
}
