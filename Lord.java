import java.util.ArrayList;
import java.util.Scanner;

public class Lord {
    private String name;
    private ArrayList<Shinobi> shinobiList = new ArrayList<Shinobi>();
    Scanner scanner = new Scanner(System.in);

    //Constructor
    public Lord(String name) {this.name = name;}


    //Method
    public String getName() {return name;}
    public void display() { 
        System.out.println("Feudal Lord: " + name + "\n");
        for (Shinobi shi : shinobiList) {
            System.out.println(shi.getRank().getRankName());
        }
    }
    public void look() {
        System.out.println("Lord Forbush is looking for a replacement Hokage..." + "\n");
        for(Shinobi shin : shinobiList) {
            if(shin.getRank().isHokageLevel()) {
                System.out.println(shin.getName() + " is the strongest shinobi alive!" + "\n" + "\n" + shin.getName() + " is the Hokage!!" + "\n");
            } else {
                System.out.println(shin.getName() + " is too weak... they're not ready");
            }
        }
    }

      public void addShinobi(Shinobi shin) {
        shinobiList.add(shin);
      }
    
}
