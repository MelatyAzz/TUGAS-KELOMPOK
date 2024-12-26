import java.util.Scanner;

public class cafe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan jumlah pesanan: ");
        int totalpesanan = scanner.nextInt();

        // Membuat array untuk menyimpan nama pesanan dan harga
        String[] pesanan = new String[totalpesanan];
        double[] jumlahbayar = new double[totalpesanan]; 
        double totalharga = 0;

        // Membaca input pesanan dan harga
        scanner.nextLine(); // Membersihkan newline yang tersisa setelah nextInt()
        for (int i = 0; i < totalpesanan; i++) {
            System.out.print("masukan nama makanan/minuman pesanan ke-" + (i + 1) + " : ");
            pesanan[i] = scanner.nextLine();
            System.out.print("masukan harga makanan: Rp. ");
            jumlahbayar[i] = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan newline setelah nextDouble()

            totalharga += jumlahbayar[i];
        }

        // Menampilkan daftar pesanan
        System.out.println("daftar pesanan--------------------------------------");
        for (int i = 0; i < totalpesanan; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + " Rp " + jumlahbayar[i]);
        }

        // Menampilkan total harga
        System.out.println("total biaya: Rp. " + totalharga);
        
        // Menutup scanner
        scanner.close();
    }
}
