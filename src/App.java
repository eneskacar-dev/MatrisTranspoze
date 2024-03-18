public class App {
    public static void main(String[] args) throws Exception {
        
        // 2 Satır 3 Sütun matris tanımlıyoruz ve içini dolduruyoruz.
        int [][] matris = { {1,2,3}, {4,5,6} };
        // Matrisin transpozlu halini tanımlıyoruz.
        int [][] transpozeMatris = new int[matris[0].length][matris.length];

        // Transpozlu matrisi iç içe for döngüsü ile dolduruyoruz.
        for (int i = 0; i < transpozeMatris.length; i++) {
            for (int j = 0; j < transpozeMatris[0].length; j++) {
                transpozeMatris[i][j] = matris[j][i];
            }
        }
        // Ekrana matrisi yazdırıyoruz.
        System.out.println("Matrisin Transpozsuz Hali: ");
        

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        // Matrisi transpozlu halini ekrana yazdırıyoruz.
        System.out.println("Matrisin Transpozlu Hali: ");

        for (int i = 0; i < transpozeMatris.length; i++) {
            for (int j = 0; j < transpozeMatris[0].length; j++) {
                System.out.print(transpozeMatris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
