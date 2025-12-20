public class evenandodduptotarget {
    public static void main(String[] args) {
        int target = 10;

        int even[] = new int[target/2 + 1];
        int odd[] = new int[target/2 + 1];

        int eIndex = 0;
        int oIndex = 0;

        for(int i = 0; i <= target; i++) {
            if(i % 2 == 0) {
                even[eIndex] = i; 
                eIndex++;
            } else {
                odd[oIndex] = i;
                oIndex++;
            }
        }

        System.out.println("even:");
        for(int i = 0; i < eIndex; i++) {
            System.out.println(even[i]);
        }

        System.out.println("odd:");
        for(int i = 0; i < oIndex; i++) {
            System.out.println(odd[i]);
        }
    }
}
