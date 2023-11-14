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
    
    public static void StartBrew(){
        System.out.println("Starting Brew");
    }

    @Override
    public String toString(){
        return this.name + " (HeatTime: ) " + this.HeatTime + " Sec, Brew Time: " + this.BrewTime + " Sec, ID: " + ID;
    }
}
