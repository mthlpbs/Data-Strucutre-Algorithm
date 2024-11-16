public class selectionST {
    private static char[] arr;

    public static void charArraytoString (char[] arr) {
        String wd = "";
        for (int x=0; x<arr.length; x++ ) wd += arr[x] + " ";
        System.out.println("\t"+wd);
    }
    
    public static void selectionSort (String wd) {
        int len = wd.length();
        arr = wd.toCharArray();
        for (int i=0; i<(len-1); i++) {
            System.out.println("i = "+i);
            for (int j=i; j<(len-1); j++) {
                if (arr[i]>arr[j+1]) {
                    char tmp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = tmp;
                }
                charArraytoString(arr);
            }
        }
    }
    public static void main(String... args) {
        String wd = "EXAMPLE";
        selectionSort(wd);
        System.out.println("\nSortted Array : "+ new String(arr));
    }
}