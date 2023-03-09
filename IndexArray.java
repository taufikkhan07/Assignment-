package March07_Assignment;
public class IndexArray {
public static int  findIndex (int[] myarray, int t) {
    if (myarray == null) return -1;
int len = myarray.length;
int i = 0;
    while (i < len) {
    if (myarray[i] == t) return i;
    else i=i+1;
}
return -1;
}
public static void main(String[] args) {
int[] my_array = {1, 2, 3, 4, 5, 6, 7};
   System.out.println("Index position of 2 is: " + findIndex(my_array, 2));
   System.out.println("Index position of 7 is: " + findIndex(my_array, 7));
    }
}

