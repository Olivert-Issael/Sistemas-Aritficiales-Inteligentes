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
public class Agente_1_100 extends Agent {
    protected void setup()
    {
        addBehaviour(new Accionq(this));
    }
    
}
class Accionq extends Behaviour
{
    int cont=0;
    public Accionq (Agent A)
    {
        super(A);
    }
    public void action()
    {
     System.out.println(cont+1);
     cont++;
    }

    public boolean done() {
        return cont>=100;
    }
    
}
