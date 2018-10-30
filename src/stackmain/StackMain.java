/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackmain;

/**
 *
 * @author desio
 */
public class StackMain {


    public static void main(String[] args) {
        Prodotto p1=new Prodotto("patatine","PA",1.0);
        Prodotto p2=new Prodotto("carne","CA",25.5);
        Stack s=new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        System.out.println(s.size());
        s.push(p1);
        s.push(p2);
        System.out.println(s.size());
        s.stampa();
        System.out.println("pop:\n" +s.pop());
        System.out.println("top:\n"+s.top());
        System.out.println("Stampa: \n");
        s.stampa();
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
    }
    
}
