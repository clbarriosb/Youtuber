/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2youtuber;

import java.util.Scanner;

/**
 *
 * @author Carmen_Lucia3
 */
public class Youtuber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for (int i = 0; i < testCases; i++) {
            int numberOfFriends = scan.nextInt();
            int friendsToDelete = scan.nextInt();
            lista list = new lista();
            for(int j=0; j<numberOfFriends; j++){
                int friends=scan.nextInt();
                list.add(friends);
            }
            
            node tempo=list.start;
            for(int h=0; h<list.size()-1;h++){
                if (tempo.popularidad<tempo.next.popularidad){
                    System.out.println(tempo.popularidad<tempo.next.popularidad);
                    list.delete(h);
                    tempo=tempo.prev.prev;
                    list.print();
                }
                else{
                   tempo=tempo.prev.prev;
                    System.out.print("2 ");list.print();
                }
            }
            list.print();
        }

    }

}
