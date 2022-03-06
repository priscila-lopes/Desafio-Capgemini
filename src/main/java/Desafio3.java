
public class Desafio3 {
    public static String encriptarTexto(String textoOriginal){
        Integer contador = 0;
        String textoResultado = "";
        textoOriginal = textoOriginal.replace(" ", "");
        Integer tamanhoGrid =  (int) Math.ceil(Math.sqrt(textoOriginal.length()));
        String[][] grid = new String[tamanhoGrid][tamanhoGrid];
        for (int i = 0; i < tamanhoGrid; i++) {
            for (int j = 0; j < tamanhoGrid; j++) {
                if (contador < textoOriginal.length()){
                    grid[i][j] = Character.toString(textoOriginal.charAt(contador));
                    contador++;
                }

            }
        }
        for (Integer i = 0; i < tamanhoGrid; i++) {

            for (Integer j = 0; j < tamanhoGrid; j++) {
                if (grid[j][i] != null){
                    textoResultado = textoResultado.concat(grid[j][i]);
                }

            }
            textoResultado = textoResultado.concat(" ");
        }
        return textoResultado.trim();
    }
}
