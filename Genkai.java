import java.util.*;
import java.util.HashMap;


public class Genkai {
    public static final String display = null;
    private static String name;
    private static Map<String, Integer> levels = new HashMap<>() {
        {
            put("Sharingan, Chidori, Amaterasu, Susano'o, and Fireball Jutsu",300000000);
            put("Rasengan, Shadow Clone Jutsu, Sage Mode, SO6P, and Kurama",800000000 );
            put("Lightning Blade, Kamui",900000);
            put("Byakugan, 64 Palms, and Rotation",300000 );
            put("Flying Rajin, Rasengan, Sage Mode, KCM 2, and Reaper Death Seal",1500000);

        }
    };

    //Constructors
    public Genkai() {name = "unknown"; }
    public Genkai(String name) {this.name = name; }

    //Methods
    public String getName() {return name;}
    public static void display() {System.out.println("Power:" + name + "\n" + "Power Level: " + levels.get(name));}

   
    
    
}
