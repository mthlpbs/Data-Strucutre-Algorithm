public class insertionST {
    private static char[] arr;

    public static void charArraytoString (char[] arr) {
        String wd = "";
        for (int x=0; x<arr.length; x++ ) wd += arr[x] + " ";
        System.out.println("\t"+wd);
    }
    
    public static void insertionSort (String wd) {
        int len = wd.length();
        arr = wd.toCharArray();
        for (int i=0; i<(len-1); i++) {
            System.out.println("i = "+i);
            for (int j=i+1, z=j+1; j>=0; j--) {
                if (arr[z]<arr[j]) {
                    char tmp = arr[j];
                    arr[j] = arr[z];
                    arr[z] = tmp;
                    z=j;
                }
             charArraytoString(arr);
            }
        }
    }
    public static void main(String... args) {
        String wd = "EXAMPLE";
        insertionSort(wd);
        System.out.println("\nSortted Array : "+ new String(arr));
    }
}
