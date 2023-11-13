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

    public static void startHeatUp(){
        System.out.println("Heating Up");
    }
    
    public static void StartBrew(){
        System.out.println("Starting Brew");
    }

    @Override
    public String toString(){
        return this.name + " (HeatTime: ) " + this.HeatTime + " Sec, Brew Time: " + this.BrewTime + " Sec, ID: " + ID;
    }
}
