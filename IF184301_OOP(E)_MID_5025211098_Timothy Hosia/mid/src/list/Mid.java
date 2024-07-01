package list;
import java.util.ArrayList;

/*
 * Timothy Hosia
 * 5025211098
*/

public class Mid extends List {

    // 8
	// This will negate all the data in the linked list by multiplying by -1
    static List negateAll(List a) {
    	if(!a.tail.empty) {
            a.head = a.head *-1;
            negateAll(a.tail);
        }
        return a;
    }
    static ArrayList<Integer> arr = new ArrayList<Integer>();
    
    // 9
    // This will find x inside the linked list and if it finds x, It will return the position of index x
    // It will return -1 if it doesn't find x within the linked list.
    static int find(int x, List a) {
        return __find(x, a, 0);
    }

    private static int __find(int x, List a, int counter) {
        if(!a.empty()) {
            if(x == a.head()) return counter;
            return __find(x, a.tail(), ++counter);
        }
        return -1;
    }
   
    // 10
    // Return true if it reached the end of the linked list, Return false if there is still a node that contain
    // data less than zero (negative)
    static boolean allPositive(List a) {
    	if (a.empty()) {
            return true;
        }
        if (a.head < 0) {
            return false;
        }
        return allPositive(a.tail());
    }
   
    // 11
    // Return only the positive data in the linked list
    static List positives(List a) {
    	if (a.empty()) {
            return new List();
        }
        if (a.head >= 0) {
            return new List(a.head, positives(a.tail()));
        }
        return positives(a.tail());
    }
   

    // 12
    // Return true if its sorted, Return false if the next node less than the current node
    static boolean sorted(List a) {
    	 if (a.empty()) {
             return true;
         }
         if (a.tail().empty()) {
             return true;
         }
         if (a.head < a.tail().head) {
             return sorted(a.tail());
         }
         return false;
    }
    
    // 13
    // This will create a new linked list with sorted data of a and b. This method will take the lesser node
    // between a and b that will be inputed into the new list untill the end of each linked list
    static List merge(List a, List b) {
    	if (a.empty()) {
            return b;
        }
        if (b.empty()) {
            return a;
        }
        if (a.head <= b.head) {
            return new List(a.head, merge(a.tail(), b));
        }
        return new List(b.head, merge(a, b.tail()));
    }
    

    // 14
    // This will create a new linked list with the data taken from a. If the current node has equal value
    // to the next node, It will skip the node
    static List removeDuplicate(List a) {
    	 if (a.empty()) {
             return a;
         }
         if (a.tail().empty()) {
             return a;
         }
         if (a.head == a.tail().head) {
             return removeDuplicate(a.tail());
         }
         return new List(a.head, removeDuplicate(a.tail()));
     }
    
    
    // 15
    // It will compare each node to x. If it has equal value, It will skip into the next node. If it's not
    // equal It will add the current node into the new list
    static List skip(int x, List a) {
        if (a.empty()) {
            return a;
        }
        if (a.head != x) {
            return new List(a.head, skip(x, a.tail()));
        }
        return skip(x, a.tail());
    }
}   
