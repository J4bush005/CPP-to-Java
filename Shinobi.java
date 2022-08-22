public class Shinobi {
    private String name;
    private boolean rouge;
    private Rank rank;
    private Master master;
    private Clan clan;


    //Create a Constructor
    public Shinobi(String name, String clan, String genkai, String master, int missions) {
        this.name = name;
        this.rank = new Rank(missions);
        this.master = new Master(master);
        this.clan = new Clan(clan, genkai);
    }









    //Methods
    public Clan getClan() {return clan;}
    public Master getMaster() {return master;}
    public Rank getRank() {return rank;}
    public String getName() {return name;}
    public void goRouge() {rouge = true;}
    public boolean isRouge() {return rouge;}
    public void display() {
        if(rouge == true) {
            System.out.println(name + " has killed the Sixth Hokage!!! He must be hunted down.");
        }
        System.out.println("Name: " + name);
        getClan();
        clan.display();
        getRank();
        rank.display();
        getMaster();
        Master.display();
       
       
        
    }
}
