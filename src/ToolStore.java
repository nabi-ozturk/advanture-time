public class ToolStore extends normalLoc{
    
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }
    public boolean getLocation(){
        System.out.println("Para: " + player.getMoney());
        System.out.println("1. Silahlar");
        System.out.println("2. Zirhlar");
        System.out.println("3. Cikis");
        System.out.println("Seciminiz: ");
        int selTool = scan.nextInt();
        int selItemID;
        switch (selTool) {
            case 1:
              selItemID = weaponMenu();
              buyWeapon(selItemID);
                break;
            case 2:
                selItemID = armorMenu();
                buyArmor(selItemID);
                break;
            default:
                break;
        }
        return true;
    }
    
    public int armorMenu(){
        System.out.println("1. Dokuma Zirh\t         <Para : 15 - Hasar 1>");
        System.out.println("2. Gargoyle\t         <Para : 25 - Hasar 3>");
        System.out.println("3. Guardian Angel\t <Para : 40 - Hasar 5>");
        System.out.println("4. Cikis");
        System.out.print("Armor Seciniz: ");
        int selArmorID = scan.nextInt();
        return selArmorID;
    }
    
    public void buyArmor(int itemID){
        int avoid=0,price=0;
        String aName=null;
        switch(itemID){
                case 1:
                    avoid=1;
                    aName="Dokuma Zirh";
                    price=15;
                    break;
                case 2:
                    avoid=3;
                    aName="Gargoyle";
                    price=25;
                    break;
                case 3:
                    avoid=5;
                    aName="Guardian Angel";
                    price=40;
                    break;
                case 4:
                    System.out.println("Cikis Yapiliyor..");
                    break;
                default:
                    System.out.println("Gecersiz Islem!");
                    break;
        }
       if(price>0){
        if(player.getMoney()>=price){
            player.getInv().setArmor(avoid);
            player.getInv().setaName(aName);
            player.setMoney(player.getMoney()-price);
            System.out.println(aName + " satin aldiniz, Engellenen Hasar: " + player.getInv().getArmor());
                    
            System.out.println("Kalan para:" + player.getMoney());
        }else{
            System.out.println("Bakiye Yetersiz!");
        }
       }
    }
    
    public int weaponMenu(){
        System.out.println("1. Sopa\t         <Para : 25 - Hasar 2>");
        System.out.println("2. Hancer\t <Para : 35 - Hasar 3>");
        System.out.println("3. Durendal\t <Para : 45 - Hasar 7>");
        System.out.println("4. Cikis");
        System.out.print("Silah Seciniz: ");
        int selWeaponID = scan.nextInt();
        return selWeaponID;
    }
    public void buyWeapon(int itemID){
        int damage=0,price=0;
        String wName=null;
        switch(itemID){
                case 1:
                    damage=2;
                    wName="Sopa";
                    price=25;
                    break;
                case 2:
                    damage=3;
                    wName="Hancer";
                    price=35;
                    break;
                case 3:
                    damage=7;
                    wName="Durendall";
                    price=45;
                    break;
                case 4:
                    System.out.println("Cikis Yapiliyor..");
                    break;
                default:
                    System.out.println("Gecersiz Islem!");
                    break;
        }
       if(price>0){
        if(player.getMoney()>price){
            player.getInv().setDamage(damage);
            player.getInv().setwName(wName);
            player.setMoney(player.getMoney()-price);
            System.out.println(wName + " satin aldiniz, Onceki Hasar: " + player.getDamage() + ",Yeni Hasar: "
                    +player.getTotalDamage());
            System.out.println("Kalan para:" + player.getMoney());
        }else{
            System.out.println("Bakiye Yetersiz!");
        }
       }
            
     }
  }

