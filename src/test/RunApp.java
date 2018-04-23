/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import concretesubject.MySubject;
import java.util.Observer;
import subject.Subject;
import subjectobject.MySubjectObserver;

/**
 *
 * @author Win-7
 */
public class RunApp {
    public static void main(String[] args) {
        MySubject s1 = new MySubject();
        Object so1 = new MySubjectObserver();
        Object so2 = new MySubjectObserver();
        s1.addObserver((Observer) so1);
        ((Subject) so1).addObserver((Observer) so2);
        s1.changeState();
//        s1.changeState(); // Deve imprimir:
//        “s1 mudou estado para X, estou mudando o meu também para X” pelo objeto so1
//        “so1 mudou estado para X, estou mudando o meu também para X” pelo objeto so2
    }
}
