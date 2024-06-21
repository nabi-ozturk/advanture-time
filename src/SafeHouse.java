public class SafeHouse extends normalLoc{
    
    public SafeHouse(Player player) {
        super(player,"Guvenli Ev");
    }
    public boolean getLocation(){
        player.setHealthy(player.getrHealthy());
        System.out.println("Iyilestiniz..");
        System.out.println("Su an Guvenli Evdesiniz");
        return true;
    }
}
