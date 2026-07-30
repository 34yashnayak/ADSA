import java.util.*;

public class Hash_func {
    public int hash(int key, int tableSize) {
        return key % tableSize;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Hash_func hf = new Hash_func();
     System.out.print("Enter the key: ");
     int key = sc.nextInt();
     System.out.print("Enter the table size: ");
        int tableSize = sc.nextInt();
        int hashValue = hf.hash(key, tableSize);
        System.out.println("Hash value: " + hashValue);
    }
}