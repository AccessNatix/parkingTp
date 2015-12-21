package generated.parking;

/**
 * @author yo
 */
public class BarriereSortie {
    
    private String state;
    private static BarriereSortie barriere;

    public BarriereSortie() {
        this.state = "close";
    }
    
    public static BarriereSortie getInstance(){
        if(barriere==null) barriere=new BarriereSortie();
        return barriere;
    }
    
    public void open() {
        System.out.println("La barriere de sortie s'ouvre");
            state="open";
    }

    public void close() {
        System.out.println("La barriere de sortie se ferme");
            state="close";
    }
    
    public String getState()
    {
        return this.state;
    }
}