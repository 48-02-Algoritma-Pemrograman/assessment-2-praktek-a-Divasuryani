import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
            import java.util.ArrayList;
import java.util.Scanner;

public class TokoBukuTogaPerak {

    // Daftar harga buku
    static int[] hargaBuku = {350000, 450000, 500000, 95000};
    
    // Nama buku
    static String[] daftarBuku = {
        "Sherlock Holmes", 
        "Arsene Lupin", 
        "Game of Throne", 
        "Psychology of Money"
    };

    // Prosedur untuk menghitung total harga dari buku yang dibeli
    public static int hitungTotalHarga(ArrayList<Integer> belanja) {
        int totalHarga = 0;
        for (int harga : belanja) {
            totalHarga += harga;
        }
        return totalHarga;
    }

    // Prosedur untuk menghitung voucher belanja
    public static int hitungVoucher(int totalHarga) {
        if (totalHarga < 200000) {
            return 0;
        } else if (totalHarga >= 200000 && totalHarga <= 500000) {
            return 50000;
        } else if (totalHarga > 500000 && totalHarga <= 750000) {
            return 100000;
        } else if (totalHarga > 750000 && totalHarga <= 1000000) {
            return 150000;
        } else {
            return 200000;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> belanja = new ArrayList<>();
        
        // Menampilkan daftar buku dan harga
        System.out.println("Daftar Buku:");
        for (int i = 0; i < daftarBuku.length; i++) {
            System.out.println((i + 1) + ". " + daftarBuku[i] + " - " + hargaBuku[i]);
        }

        boolean inputLagi = true;
        
        // Proses memilih buku dan menambahkannya ke dalam ArrayList belanja
        while (inputLagi) {
            System.out.print("Masukkan pilihan buku [1/2/3/4]: ");
            int pilihan = scanner.nextInt();
            
            // Validasi input pilihan
            if (pilihan < 1 || pilihan > 4) {
                System.out.println("Pilihan tidak valid. Silakan pilih angka antara 1 sampai 4.");
            } else {
                belanja.add(hargaBuku[pilihan - 1]);
            }

            System.out.print("Input lagi (Y/N)?: ");
            char input = scanner.next().charAt(0);
            if (input == 'N' || input == 'n') {
                inputLagi = false;
            }
        }
        
        // Menghitung total harga
        int totalHarga = hitungTotalHarga(belanja);
        int voucher = hitungVoucher(totalHarga);

        // Menampilkan total harga dan voucher
        System.out.println("Total voucher belanja = " + voucher);
        System.out.println("Total yang harus dibayar = " + (totalHarga - voucher));

        scanner.close();
    } 
}

        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
}
