import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
    // Daftar harga buku
    static int[] hargaBuku = {350000, 450000, 500000, 95000};
    static String[] namaBuku = {"Sherlock Holmes", "Arsene Lupin", "Game of Throne", "Psychology of Money"};

    // Prosedur untuk menampilkan daftar buku dan harga
    public static void tampilkanDaftarBuku() {
        System.out.println("Daftar Buku:");
        for (int i = 0; i < namaBuku.length; i++) {
            System.out.println((i + 1) + ". " + namaBuku[i] + " " + hargaBuku[i]);
        }
    }

    // Prosedur untuk menghitung total harga buku yang dibeli
    public static int hitungTotalHarga(ArrayList<Integer> hargaBelanja) {
        int totalHarga = 0;
        for (int harga : hargaBelanja) {
            totalHarga += harga;
        }
        return totalHarga;
    }

    // Prosedur untuk menghitung voucher belanja berdasarkan total pembelanjaan
    public static int hitungVoucher(int totalHarga) {
        int voucher = 0;
        if (totalHarga >= 1000000) {
            voucher = 200000;
        } else if (totalHarga >= 750000) {
            voucher = 150000;
        } else if (totalHarga >= 500000) {
            voucher = 100000;
        } else if (totalHarga >= 200000) {
            voucher = 50000;
        }
        return voucher;
    }

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        ArrayList<Integer> hargaBelanja = new ArrayList<>();
        boolean inputLagi = true;

        // Menampilkan daftar buku
        tampilkanDaftarBuku();

        while (inputLagi) {
            System.out.print("Masukan pilihan buku [1/2/3/4]: ");
            int pilihanBuku = Scanner.nextInt();
            
            // Validasi pilihan buku
            if (pilihanBuku >= 1 && pilihanBuku <= 4) {
                hargaBelanja.add(hargaBuku[pilihanBuku - 1]); // Menambah harga buku ke ArrayList
            } else {
                System.out.println("Pilihan tidak valid.");
            }

            // Menanyakan apakah ingin memasukkan buku lain
            System.out.print("Input lagi (Y/N)?: ");
            char input = Scanner.next().charAt(0);
            if (input == 'N' || input == 'n') {
                inputLagi = false;
            }
        }

        // Menghitung total harga dan voucher
        int totalHarga = hitungTotalHarga(hargaBelanja);
        int voucher = hitungVoucher(totalHarga);

        // Menampilkan hasil
        System.out.println("\nTotal voucher belanja = " + voucher);
        System.out.println("Total yang harus dibayar = " + (totalHarga - voucher));
    }
}

        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
}
