package leet_code;
public class sortPeople {
    public static void sortPeoplemain(String[] args) {
        int b;
        String[] names = new String[] { "John", "Dan", "Tim", "Bill"};
        int[] heights = new int[] {160, 180, 174, 171};

        for (int i = (names.length - 1); i >= 1; i--) {
            for (int j = (names.length - 1) - i; j >= 0; j--) {
                if (heights[i - 1] < heights[i + j]) {
                    b = heights[i - 1];
                    heights[i - 1] = heights[i + j];
                    heights[i + j] = b;
                    String a = names[i - 1];
                    names[i - 1] = names[i + j];
                    names[i + j] = a;
                }
            }
        }

        System.out.println("The ages entered are: ");
        for (int j = 0; j < names.length; j++) {
            System.out.print(heights[j] + " ");
        }
        System.out.println(" ");
        System.out.println("The names entered are: ");
        for (int j = 0; j < names.length; j++) {
            System.out.print(names[j] + " ");
        }    
    }
}
