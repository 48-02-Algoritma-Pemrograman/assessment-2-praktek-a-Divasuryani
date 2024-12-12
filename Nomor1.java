import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
            // Prosedur untuk menampilkan deret FizzBuzz
    public static void fizzBuzz(int n) {
        for (int i = 0; i <= n; i++) {
            // Cek kelipatan 3 dan 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            }
            // Cek kelipatan 3
            else if (i % 3 == 0) {
                System.out.print("Fizz ");
            }
            // Cek kelipatan 5
            else if (i % 5 == 0) {
                System.out.print("Buzz ");
            }
            // Jika bukan kelipatan 3 atau 5
            else {
                System.out.print(i + " ");
            }
        }
        System.out.println();  // Untuk mencetak baris baru setelah selesai
    }

    public static void main(String[] args) {
        // Scanner untuk input user
        Scanner Scanner = new Scanner(System.in);

        // Input dari user untuk nilai n
        System.out.print("Masukan nilai N: ");
        int n = Scanner.nextInt();

        // Memanggil prosedur fizzBuzz dengan "n"
        fizzBuzz(n);

        // Menutup scanner
        Scanner.close();
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
    
}
