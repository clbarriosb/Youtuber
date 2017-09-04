/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2youtuber;

/**
 *
 * @author Carmen_Lucia3
 */
public class node {

    node next;
    int popularity;

}

class lista {

    node start;
    node end;

    public lista() {
   
        start = null;
        end = null;
    }

    public void add(int popularity) {
        node n = new node();
        n.popularity = popularity;
        if (start == null) {
            start = n;
            end = start;
            start.next = null;
        } else {
            end.next = n;
            n.next = null;
            end = n;
        }
    }

    
    public void print() {
        node actual = start;
        while(actual!=null){
            System.out.print(actual.popularity + " ");
            actual=actual.next;
        }
        System.out.println("");
    }
    
    public void unpopular( int friendsToDelete){
        node actual = new node();
        actual =start;
        node prev =new node();
        
        while(friendsToDelete!=0){
            if(actual.next==null){
                actual=start;
                continue;
            }
            else if(actual.popularity<actual.next.popularity){
                if(actual==start){
                    start=start.next;
                }
                else{
                    prev.next=actual.next;
                    actual=actual.next;
                }
                friendsToDelete--;
            }
            prev=actual;
            actual=actual.next;
        }
    }
}
