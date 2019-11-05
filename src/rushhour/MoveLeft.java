/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rushhour;

import search.Action;
import search.State;

/**
 *
 * @author steven + C1722325
 */
public class MoveLeft implements Action{

    private int car;
    private String direction;
    private int steps;

    public MoveLeft(int car, int steps){
        this.car=car;
        this.steps=steps;
    }

    public int getCar(){
        return car;
    }

    public String getDirection(){
        return "left";
    }

    public int getSteps(){
        return steps;
    }

    public int getCost() {
        return 1;
    }

    public String toString(){
        return "(" +car+","+"left"+","+steps+")";
    }
    
}
