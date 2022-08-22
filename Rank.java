public class Rank {
    private String rank;
    private int missions;

    //Constructors
   public Rank() {
        missions = 0;
    }

   public Rank(int r) { 
        missions = r;
    }

    //Methods
    public int getRank() {return missions;}
    public boolean isGenin() {return missions > 0 && missions <= 59;}
    public boolean isChunin() {return missions >= 60 && missions <= 79;}
    public boolean isJonin() {return missions >= 80 && missions <= 99;}
    public boolean isAnbu() {return missions >= 100 && missions <= 149;}
    public boolean isHokageLevel() {return missions > 150;}
    public String getRankName() {
        if(missions <= 20 && missions <= 59) {return "Genin";}
        if(missions >= 60 && missions <= 79) {return "Chunin";}
        if(missions >= 80 && missions <= 99) {return "Jonin";}
        if(missions >= 100 && missions <= 149) {return "Anbu";}
        if(missions > 150) {return "Hokage Worthy";}
        return "Academy";
    }
    public void display() {
        System.out.println("Missions Completed: " + missions);
        System.out.println("Rank: " + getRankName());
    }
}
