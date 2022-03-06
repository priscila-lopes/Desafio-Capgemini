
import java.util.Arrays;

public class Desafio1 {

    public static Integer obterMediana(Integer[] arr){
        Arrays.sort(arr);
        if ((arr.length % 2) == 1){
            return arr[((arr.length - 1)/2)];
        }
        return null;
    }
}
