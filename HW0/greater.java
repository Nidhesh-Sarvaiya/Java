public class ClassNameHere {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int l = m.lenght;
        int n = 0;
        for (int i = 0; i < l; i++){
            if (m[i] > n){
                n = m[i];
            }
        }
        return n;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
       System.out.println(max(numbers));
    }
}