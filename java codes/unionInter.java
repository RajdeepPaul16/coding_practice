import java.util.ArrayList;
public class unionInter {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 3, 5};
        int arr2[] = {3, 5, 6, 7, 8, 9};
        ArrayList<Integer> union = new ArrayList<Integer>();
        ArrayList<Integer> inter = new ArrayList<Integer>();
        for(int i = 0; i < arr1.length; i++) {
            union.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++) {
            boolean r = false;
            for(int j = 0; j < union.size(); j++) {
                if(union.get(j) == arr2[i]) {
                    r = true;
                }
            }
            if(r) {
                inter.add(arr2[i]);
            }
            else {
                union.add(arr2[i]);
            }
        }
        System.out.println("Union: ");
        for(int i = 0; i < union.size(); i++) {
            System.out.println(union.get(i));
        }
        System.out.println("Intersection: ");
        for(int i = 0; i < inter.size(); i++) {
            System.out.println(inter.get(i));
        }
    }
}
