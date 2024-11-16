public class bubbleST {
    private static char[] arr;

    public static void charArraytoString (char[] arr) {
        String wd = "";
        for (int x=0; x<arr.length; x++ ) wd += arr[x] + " ";
        System.out.println("\t"+wd);
    }
    
    public static void bubbleSort (String wd) {
        int len = wd.length();
        arr = wd.toCharArray();
        for (int i=0; i<(len-1); i++) {
            System.out.println("i = "+i);
            for (int j=0; j<(len-1-i); j++) {
                if (arr[j]>=arr[j+1]) {
                    char tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
             charArraytoString(arr);
            }
        }
    }
    public static void main(String... args) {
        String wd = "EXAMPLE";
        bubbleSort(wd);
        System.out.println("\nSortted Array : "+ new String(arr));
    }
}
