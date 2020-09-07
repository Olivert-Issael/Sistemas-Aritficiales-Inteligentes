/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
/**
 *
 * @author sayer
 */
public class Agente extends Agent
{
    protected void setup()
    {
        this.addBehaviour(new Behaviour()
        {
            public void action()
            {
                System.out.println("Hola bandita -- > "+getAID().getName());
            }
            public boolean done()
            {return true;}
        });        
    }
}
