//package partC;
/**
 *
 * @author Michelle
 */
public class Convertible extends Car
{
    private boolean topUp;
    
    public Convertible(String _name, boolean _topUp)
    {
        super(_name);
        topUp = _topUp;
    }
    
    public void putTopUp ()
    {
        topUp = true;
        System.out.println("Putting top up");
    }
    
    public void TurnOff()
    {
        putTopUp();
        super.TurnOff();
    }
}
