public class Main {
    private static char[] arr;

    public static void bubbleSort (String wd) {
        int len = wd.length();
        arr = wd.toCharArray();
        for (int i=0; i<(len-1); i++) {
            for (int j=0; j<(len-1-i); j++) {
                if (arr[j]>=arr[j+1]) {
                    char tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    public static void main(String... args) {
        String wd = "EXAMPLE";
        bubbleSort(wd);
        System.out.println("Sortted Array : "+ new String(arr));
    }
}
