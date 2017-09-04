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
            
            list.unpopular(friendsToDelete);
            list.print();
        }

    }

}
