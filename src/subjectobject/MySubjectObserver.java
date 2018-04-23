package subjectobject;


import concretesubject.MySubject;
import java.util.Observable;
import java.util.Observer;
import subject.Subject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win-7
 */
public class MySubjectObserver extends Subject implements Observer{
    private MySubject sub;
    
    public MySubjectObserver() {
        super();
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o + " mudando o estado para " + arg + ", Estou mudando o meu estado para " + arg + " Pelo Objeto" + o);
        sub.changeState();
    }
    
}

