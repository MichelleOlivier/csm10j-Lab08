/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package partC;


/**
 *
 * @author Michelle
 */
public abstract class MotorVehicle 
{
    private String name;
    
    public abstract void TurnOn();
 
    public abstract void TurnOff();
    
    public String getName()
    {
        return name;   
    }
    public MotorVehicle(String _name)
    {
        name = _name;
    }

    
}
