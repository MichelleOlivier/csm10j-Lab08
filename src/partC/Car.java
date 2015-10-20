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
public class Car extends MotorVehicle
{
    public void TurnOn()
    {
        System.out.println(getName() + "Car is starting");
    }
    
    public void TurnOff()
    {
        System.out.println(getName() + "Car is stopping");
       
    }
    
    public Car(String _name)
    {
        super(_name);
    }
    
}

