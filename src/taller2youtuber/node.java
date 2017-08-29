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
    node prev;
    int popularidad;

}

class lista {

    node start;
    node end;
    int size;

    public lista() {
        size = 0;
        start = null;
        end = null;
    }

    public void add(int h) {
        node n = new node();
        n.popularidad = h;
        if (start == null) {
            start = n;
            end = n;
            start.next = end;
            start.prev = end;
        } else {
            end.next = n;
            n.prev = end;
            end = n;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void delete(int y) {
        node temp = start;
        if (y == 0) {
            start = start.next;
            temp = start;
            System.out.println("tu");
            size--;
        } else if (y == size) {
            end = end.prev;
            temp = end;
            System.out.println("yo");
            size--;
        } else {
            for (int i = 0; i < y; i++) {
                System.out.println("q");
                if (i == y) {
                    temp.next.prev = temp.prev;
                    temp.prev.next = temp.next;
                }
                temp = temp.next;
            }
            size--;
        }

    }

    public void print() {
        node tempor = start;
        for (int k = 0; k < size; k++) {
            System.out.print(tempor.popularidad + " ");
            tempor = tempor.next;
        }
    }
}
