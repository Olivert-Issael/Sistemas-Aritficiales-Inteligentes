/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;

/**
 *
 * @author sayer
 */
import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class Agente_2_clases extends Agent {
    protected void setup()
    {
        addBehaviour(new Accion(this));
    }
    
}
class Accion extends Behaviour
{
    public Accion (Agent A)
    {
        super(A);
    }
    public void action()
    {
     System.out.println("Hola Bandita como andan.  Soy el Agente: " + myAgent.getAID().getName());
    }

    public boolean done() {
        return true;
    }
    
}
