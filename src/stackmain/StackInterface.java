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
public interface StackInterface {
    public boolean isEmpty();
    public boolean isFull();
    public Prodotto pop();
    public Prodotto top();
    public void push(Prodotto p);
    public int size();
    public void stampa();
   
}
