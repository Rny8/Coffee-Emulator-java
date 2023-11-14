import java.util.Random;


public class Machine {

    private int HeatTime;
    private String name;
    private int BrewTime;
    private int ID;

    public Machine(String name, int HeatTime, int BrewTime, int ID){
        this.name = name;
        this.HeatTime = HeatTime;
        this.BrewTime = BrewTime;
        this.ID = ID;
    }

    public String getName(){
        return this.name;
    }

    public int getHeatTime(){
        return this.HeatTime;
    }

    public int getBrewTime(){
        return this.BrewTime;
    }
    static Random rand = new Random();
    static int tempature = 0;
    public static void startHeatUp(){
        if (tempature >= 150) {
            System.out.println("Machine is already at operating tempature");
        }
        else {
            System.out.println("Heating Up");
            while (tempature < 150) {
            try{
                Thread.sleep(1500);
                tempature += rand.nextInt(15);
                System.out.print("\rTemp: " + tempature + "°F ");
            }catch(InterruptedException ex){
                System.out.println(ex);
            }
            if (tempature >= 150) {
                System.out.println("\nReached temperature");
            }
            }
        }
    }
    static float ouncesBrewed = 0;
    public static void StartBrew(int Ounces){
        ouncesBrewed = 0;
        if (tempature < 150) {
            System.out.println("Machine is not at operating tempature please heat up");
        }
        else {
            System.out.println("Starting Brew");
            while (ouncesBrewed < Ounces) {
                try{
                    Thread.sleep(1500);
                    ouncesBrewed += .5;
                    System.out.print("\rOunces Brewed: " + ouncesBrewed + "oz");
                    
                }catch(InterruptedException ex){
                    System.out.println(ex);
                };
                if (ouncesBrewed == Ounces) {
                    System.out.println("\nBrew Amount Reached");
                    ouncesBrewed = 0;
                    break;
                }
            }
        }
    }

    @Override
    public String toString(){
        return this.name + " (HeatTime: ) " + this.HeatTime + " Sec, Brew Time: " + this.BrewTime + " Sec, ID: " + ID;
    }
}
