import java.util.Scanner;

public class Nomor1 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
    // Prosedur untuk menampilkan deret FizzBuzz
    public static void printFizzBuzz(int n) {
        // Iterasi dari 0 hingga n
        for (int i = 0; i <= n; i++) {
            // Cek apakah i merupakan kelipatan 3 dan 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            }
            // Cek apakah i merupakan kelipatan 3
            else if (i % 3 == 0) {
                System.out.print("Fizz ");
            }
            // Cek apakah i merupakan kelipatan 5
            else if (i % 5 == 0) {
                System.out.print("Buzz ");
            }
            // Jika tidak memenuhi kondisi di atas, cetak angka itu sendiri
            else {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // Membaca input dari user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai N: ");
        int n = scanner.nextInt();

        // Memanggil prosedur untuk menampilkan deret FizzBuzz
        printFizzBuzz(n);
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
    
}
