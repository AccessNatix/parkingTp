package generated.parking;

/**
 * @author yo
 */
public class Parking {
    private int _nbPlace;
    private int _currentNumber;
    private static Parking parking;

    public Parking(int aNb) {
            this._nbPlace = aNb;
            this._currentNumber = 0;
    }

    public static Parking getInstance(){
        if(parking==null) parking=new Parking(5);
        return parking;
    }

    public void addVehicule() {
            _currentNumber++;
    }

    public void removeVehicule() {
            _currentNumber--;
    }

    public int getVehiculeNumber()
    {
        return _currentNumber;
    }

    public boolean isPlein() {
        return !(this._currentNumber < this._nbPlace);
    }
    
    public boolean isEmpty() {
        return (this._currentNumber == 0);
    }
}