import java.util.Arrays;

public class tekrarEdenCiftler {
    static boolean isFind(int [] arr, int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {2, 3, 6, 2, 5, 8, 9, 10, 8, 24, 36, 10};
        int[] dublist = new int[list.length];
        int indis = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (list[i] % 2 == 0) {
                        if (!isFind(dublist, list[i])){
                            dublist[indis++] = list[i];
                            break;
                        }

                    }
                }
            }
        }
        System.out.println(Arrays.toString(dublist));
    }
}
