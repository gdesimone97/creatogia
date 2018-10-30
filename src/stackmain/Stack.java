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
public class Stack implements StackInterface {
    private final int DEFAULT_SIZE=5;
    private int s;
    private Prodotto pA[];
    
    public Stack(int maxSize){
        pA=new Prodotto[maxSize];
        s=0;
    }
    
    public Stack(){
        //this(DEFAULT_SIZE);
    }

    @Override
    public boolean isEmpty() {
        if(s==0)
            return true;
        else
            return false;
    }

    @Override
    public boolean isFull() {
        if(s==20)
            return true;
        else
            return false;
    }

    @Override
    public Prodotto pop() {
        s--;
        return pA[s];
    }
    
    @Override
    public Prodotto top() {
        return pA[s-1];
    }

    @Override
    public void push(Prodotto p) {
        pA[s]=p;
        s++;
    }

    @Override
    public int size() {
       return s;
    }
    
    @Override
    public void stampa(){
        for(int i=0;i<s;i++){
            System.out.println(pA[i]);
            System.out.println();
       }
    }
    
}
