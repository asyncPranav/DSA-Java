// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

package dsa.array.search.binary.problems;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j', 'm'};
        char target = 'f';

        //search
        char ans = searchSmallestLetter(letters, target);

        //output
        System.out.println(ans);
    }
    static char searchSmallestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) end = mid - 1;
            else start = mid + 1;
        }

        /*
             At the end of the loop:
              - 'start' will point to the index of the smallest letter greater than the target.
              - If the target is greater than or equal to all letters in the array,
                then 'start' will go beyond the last index.
              - In that case, we use 'start % letters.length' to loop back (wrap around) to the beginning.
                This is because the array is circular — after the last letter, it starts again from the first letter.
         */

        return letters[start % letters.length];
    }
}