/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretesubject;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import subject.Subject;

/**
 *
 * @author Win-7
 */
public class MySubject extends Subject{
    
    public MySubject(){
        super();
    }
    
    public void changeState() {
        super.state = super.state.toUpperCase();
        super.setChanged();
        super.notifyObservers(super.state);
    }
    
}
