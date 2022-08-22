public class Main {

    public static void main(String[] args) {

    

        Lord feudal = new Lord("Lord Forbush from the Land of Fire");
        feudal.display();

        Shinobi dude = new Shinobi("Sauske Uchiha", "Uchiha", "Sharingan, Chidori, Amaterasu, Susano'o, and Fireball Jutsu", "Orochimaru", 80);
        dude.display();
        dude.goRouge();
        

        Shinobi boy = new Shinobi("Kakashi Hatake", "Hatake", "Lightning Blade, Kamui", "Itachi", 60 );
        boy.display();

        Shinobi teen = new Shinobi("Neji Hyuga", "Hyuga", "Byakugan, 64 Palms, and Rotation",  "Hiruzen" , 80);
        teen.display();

        Shinobi man = new Shinobi("Minato Namikaze", "Namikaze", "Flying Rajin, Rasengan, Sage Mode, KCM 2, and Reaper Death Seal", "Hashirama", 100 );
        man.display();

        Shinobi kid = new Shinobi("Naruto Uzamaki", "Uzamaki", "Rasengan, Shadow Clone Jutsu, Sage Mode, SO6P, and Kurama", "Tobirama", 160);
        kid.display();

      feudal.addShinobi(dude);
      feudal.addShinobi(boy);
      feudal.addShinobi(teen);
      feudal.addShinobi(man);
      feudal.addShinobi(kid);
       
        feudal.look();

        

        
           
    


    }

}
