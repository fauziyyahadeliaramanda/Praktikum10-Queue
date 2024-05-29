package Tugas14;
import java.util.Scanner;
public class QueueMain10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue10 antri = new Queue10 (jumlah);
        int pilih;

        do{
           menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih){
                case 1:
                    System.out.println("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("No.ID: "); 
                    int noID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Jenis kelamin (L/P): ");
                    char jenisKelamin = sc.nextLine().charAt(0);
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    Pasien10 pasien = new Pasien10 (nama, noID, jenisKelamin, umur);
                    antri.enqueue(pasien);
                    break;
                case 2:
                    Pasien10 keluar = antri.dequeue();
                    if(keluar != null){
                        System.out.println("Pasien yang keluar: " + keluar.nama);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.peekRear();
                    break;
                case 5:
                    System.out.print("Masukkan nama Pasien: ");
                    String namaCari = sc.nextLine();
                    antri.peekPosition(namaCari);
                    break;
                case 6:
                    antri.daftarPasien();
                    break;
            }
        } while (pilih >= 1 && pilih <= 6);
    }
    public static void menu(){
        System.out.println("Pilih menu: ");
        System.out.println("1. Antri Pasien");
        System.out.println("2. Panggil Pasien");
        System.out.println("3. Cek Pasien terdepan");
        System.out.println("4. Cek Pasien paling belakang");
        System.out.println("5. Cek posisi Pasien berdasarkan nama");
        System.out.println("6. Daftar Pasien dalam antrian");
        System.out.println("7. Keluar");
        System.out.println("--------------------------------------");
    }
}
