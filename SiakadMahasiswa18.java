import java.util.Scanner;
public class SiakadMahasiswa18 {
    public static void main(String[] args) {
        @SuppressWarnings("resource") //pengganti sc.close
        Scanner scanner = new Scanner(System.in);

        int [][] NilaiMahasiswa = new int [4][3];

        for (int i = 0; i < NilaiMahasiswa.length; i++) {
            System.out.println("input nilai mahasiswa ke-" + (i+1));
            double totalpersiswa = 0;

            for (int j = 0; j < NilaiMahasiswa[i].length; j++) {
                System.out.print("nilai mata kuliah " + (j+1) + ": ");
                NilaiMahasiswa[i][j] = scanner.nextInt();
                totalpersiswa += NilaiMahasiswa[i][j];
            }
            System.out.println();
            System.out.println("nilai rata-rata: " + totalpersiswa/3);
            System.out.println();
            
            }
            System.out.println("\n=====================================");
            System.out.println("rata-rata nilai setiap mata kuliah:");

                for (int j = 0; j < 3; j++) {
                    double totalpermatkul = 0;

                    for (int i = 0; i < 4; i++) {
                        totalpermatkul += NilaiMahasiswa[i][j];
            }
            System.out.println("mata kuliah " + (j+1) + ": " + totalpermatkul/4);
        }
    }
}