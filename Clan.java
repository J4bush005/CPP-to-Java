
public class Clan {
    private String name;
    private Genkai genkai;

    //Constructors
    public Clan() {name = "unknown";}
    public Clan(String name, String genkai) {
        this.name = name;
        this.genkai = new Genkai(genkai);
    }

    //Methods
    public String getName() {return name;}
    public Genkai getGenkai() {return genkai;}
    public void display() {
        System.out.println("Clan: " + name);
        getGenkai();
        Genkai.display();
    }

    
    

}
