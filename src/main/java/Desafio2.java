import java.util.Arrays;

public class Desafio2 {
 public static Integer obterNumeroDePares(Integer[] arr, Integer x){
  if (arr.length < 2 || x <= 0 ) {
   return null;
  }
  Integer totalPares = 0;
  Arrays.sort(arr);
  for (int i = 0; i < arr.length; i++) {
    for (int j=0; j < arr.length; j++){
     if ((arr[j] - arr[i]) == x) {
      totalPares++;
    }

   }
  }
  return totalPares;
 }
}
