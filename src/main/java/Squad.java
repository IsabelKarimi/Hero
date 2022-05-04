import java.util.ArrayList;

public class Squad {
    private String name;
    private  String cause;
    private int maxsize;
    private static ArrayList<Squad>mInstances=new ArrayList<>();
    private int id;

    public Squad(String name, String cause,int maxsize){
        this.name=name;
        this.cause=cause;
        this.maxsize=maxsize;
        mInstances.add(this);
        this.id = mInstances.size();
    }

    public String getName() {
        return name;
    }

    public String getCause() {
        return cause;
    }

    public int getMaxsize(){return maxsize;}

    public static ArrayList<Squad> getAll() {
        return mInstances;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Squad findById(int id){

        return mInstances.get(id -1);
    }
}

