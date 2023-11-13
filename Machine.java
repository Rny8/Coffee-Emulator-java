public class Machine {
    private int HeatTime;
    private String name;
    private int BrewTime;
    private int cost;
    private int ID;

    public Machine(String name, int HeatTime, int BrewTime, int cost, int ID){
        this.name = name;
        this.HeatTime = HeatTime;
        this.BrewTime = BrewTime;
        this.cost = cost;
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

    public int getMachineID(){
        return this.ID;
    }
    
    public int GetCost(){
        return this.cost;
    }

    @Override
    public String toString(){
        return this.name + " (HeatTime: ) " + this.HeatTime + " Sec, Brew Time: " + this.BrewTime + " Sec, ID: " + ID;
    }
}
