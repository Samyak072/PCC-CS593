import java.util.*;
public class ListDemo {
        static void populateList(Scanner sc,ArrayList<Integer> al) {
            String line=sc.nextLine();
            Scanner scs=new Scanner(line);
            while (scs.hasNext()) {
                al.add(Integer.parseInt(scs.next()));
                }
            }
        public static void displayList(String s,ArrayList<Integer>al) {
        System.out.print(s+":");
        for (int it:al) {
                System.out.print(" "+it);
         }
         System.out.println();
   }
public static void sortListDesc(ArrayList<Integer>al) {
Collections.sort(al);
Collections.reverse(al);
} 
	static int binSearch(ArrayList<Integer> al, int key) {
		int index = Collections.binarySearch( al, 
                                key, Collections.reverseOrder() );
		return index;
	}           
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // Handle inputs
		int key, index;
		ArrayList<Integer> al = new ArrayList<Integer>();
		populateList( sc, al );	
		displayList( "Original List", al );
		sortListDesc( al );
		displayList( "Sorted List", al );
		key = sc.nextInt();
		index = binSearch(al, key);
		if (index >= 0)
			System.out.println("Position: " + index);
		else
			System.out.println("Not found");
	}
}
