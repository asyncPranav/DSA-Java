// Search a character in a string

package dsa.array.search.linear;

import java.util.Scanner;

public class SearchCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input string
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        // input target character
        System.out.print("Which character you wanna find : ");
        char target = sc.next().charAt(0);

        // output
        int res = search(str, target);
        if(res != -1) System.out.println("Character found at "+res);
        else System.out.println("Character not found");
    }
    static int search(String str, char target){
        if(str.isEmpty()) return -1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == target){
                return i;
            }
        }
        return -1;
    }
}
