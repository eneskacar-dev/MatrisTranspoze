public class App {
    public static void main(String[] args) throws Exception {
        
        int [][] matris = { {1,2,3}, {4,5,6} };

        int [][] transpozeMatris = new int[matris[0].length][matris.length];

        for (int i = 0; i < transpozeMatris.length; i++) {
            for (int j = 0; j < transpozeMatris[0].length; j++) {
                transpozeMatris[i][j] = matris[j][i];
            }
        }

        System.out.println("Matrisin Transpozsuz Hali: ");

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrisin Transpozlu Hali: ");

        for (int i = 0; i < transpozeMatris.length; i++) {
            for (int j = 0; j < transpozeMatris[0].length; j++) {
                System.out.print(transpozeMatris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
