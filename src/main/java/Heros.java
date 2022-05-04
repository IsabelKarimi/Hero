import java.util.ArrayList;

public class Heros {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private static ArrayList<Heros>mInstance= new ArrayList<Heros>();
    private int id;
    private String squadId;


    public Heros(String name,int age ,String power,String weakness,String squadId){
        this.name=name;
        this.age=age;
        this.power=power;
        this.weakness=weakness;
        this.squadId = squadId;
        mInstance.add(this);
        this.id = mInstance.size();

    }
    public String getName() {return name;}

    public int getAge(){ return age;}

    public String getPower(){ return power;}

    public String getWeakness() {return weakness;}

    public void setSquadId(String squadId) {
        this.squadId = squadId;
    }

    public static ArrayList<Heros> getAll(){return mInstance;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSquadId() {
        return squadId;
    }

    public static Heros findById(int id){

        return mInstance.get(id -1);
    }

    public void deleteHero(){
        mInstance.remove(id-1);
    }
}
