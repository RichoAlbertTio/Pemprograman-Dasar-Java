/*
produk  : Richo Albert Tio
Nim   : 
Tugas : Modul 4
Program Daftar Sembako 
*/

import java.util.Scanner;       //fungsi Scanner untuk memasukan data
import java.io.IOException;     //fungsi IOException untuk membaca error tidaknya program
public class TugasAkhir {
    // Variabel isRunning adalah variabel global untuk membuat loop.
    static boolean isRunning = true; 

    //Fungsi tidak mengembalikan nilai (void), fungsi menampilkan DaftarProduk 
    static void DaftarProduk() 
    {
        // Deklarasi isi array produk
        String[] produk = {"Beras Lahap 10kg", "Sarden Jumbo", "1 dus Mie Sakura", "1 Tabak Telor", "Gula 1kg", "Minyak Goreng Bimoli 1 ltr", "Teh Sari Murni", "Kopi Kapal Api", "Bawang Merah 1kg", "Bawang Putih 1kg"};
        System.out.println("========================================");
        System.out.println("|        Daftar Produk Sembako         |");
        System.out.println("========================================");
        System.out.println("No \t Tabel Produk                      ");
        System.out.println("========================================");
        // Perulangan digunakan untuk menampilkan data pada array
        for (int i = 0; i < 10; i++) {  
            System.out.println((i + 0) + " \t " + produk[i]);    
            }
            System.out.println("========================================");
    }

    //Fungsi tidak mengembalikan nilai (void), fungsi mencari harga produk   
    static void CariData() 
    {   
        @SuppressWarnings("resource")
        //Membuat fungsi Scanner memasukan data
        Scanner scan = new Scanner(System.in); 
        boolean ada = false;
        int i;           
        System.out.print("Masukkan produk Brand Sembako : ");
        String value = scan.nextLine();
        // Deklarsi isi array produk dan harga
        String[] produk = {"Beras Lahap 10kg", "Sarden Jumbo", "1 dus Mie Sakura", "1 Tabak Telor", "Gula 1kg", "Minyak Goreng Bimoli 1 ltr", "Teh Sari Murni", "Kopi Kapal Api", "Bawang Merah 1kg", "Bawang Putih 1kg"};
        String[] harga = {"120.000", "15.000", "69.000", "52.000", "17.000", "35.000", "6.000", "1.000", "24.000", "15.000"};        
        
        // Pencarain harga dengan menggunakan sequential search
        for ( i = 0; i < produk.length; i++) {
            if (produk[i].equals(value)) {
            ada = true; 
            break;
            }
        // jika kondisi ditemukan datanya maka akan menampilkan data harga   
        } if (ada) {
            System.out.println("");
            System.out.println("Brand Sembako " + value + " terdapat pada index array ke-" + i);
            System.out.println("");
            System.out.println("Harga dari brand Sembako tersebut adalah : "+ "Rp." + harga[i]);
        
        //jika data tidak ada yang sama dengan yang di input maka data tidak ditemukan 
        } else {
            System.out.println("");
            System.err.println("Data yang anda masukkan tidak ditemukan.");
        }
    }

    //Fungsi tidak mengembalikan nilai (void), fungsi mengurutkan data harga produk   
    static void MengurutkanHarga() 
    {
        long tmp;
        String brand; 
        // Deklarsi isi array produk dan harga
        String[] produk = {"Beras Lahap 10kg", "Sarden Jumbo", "1 dus Mie Sakura", "1 Tabak Telor", "Gula 1kg", "Minyak Goreng Bimoli 1 ltr", "Teh Sari Murni", "Kopi Kapal Api", "Bawang Merah 1kg", "Bawang Putih 1kg"};  
        long[] harga = {120000, 15000, 69000, 52000, 17000, 35000, 6000, 1000, 24000, 15000};        
        System.out.println("");        
        // Mengurutkan data dengan cara bubble sort
        // c (sebagai nilai awal) = 1; jika (awal) c < 10 (batas); maka c bertambah 1 sampai <10 (batas) atau bernilai false
        for(int c=1; c<10; c++){     
            // d (sebagai nilai awal) = 0; jika (awal) d < 10 (batas)-c; maka d bertambah 1 sampai <10 (batas) atau bernilai false
            for(int d=0; d<10-c; d++){  
                // Membandingkan apakah data saat sekerang lebih besar dari data berikutnya
                if(harga[d] > harga[d+1])
                // Maka melakukan intruksi berikut    
                {
                    // Mengurutkan data produk berdasarkan harga
                    brand= produk[d];       
                    produk[d]=produk[d+1];  
                    produk[d+1]=brand;      

                    // Mengurutkan harga
                    tmp = harga[d];         
                    harga[d] = harga[d+1];  
                    harga[d+1]=tmp;      
                }
            }
        }
        // Menampilkan urutan datanya
        System.out.println("Urutan Harga Termurah Sampai Termahal : ");
        // Perulangan digunakan untuk menampilkan urutan datanya berdasarkan harga produk
        
        // i (sebagai nilai awal) = 1; jika (awal) i < 10 (batas); maka i bertambah 1 sampai <10 (batas) atau bernilai false
        for(int i=0;i<10;i++){ 
            // Menampilkan data
            System.out.println("Produk Sembako "+produk[i]+ " dengan harga " + "Rp. "+ harga[i]);
        }
    }

    //Fungsi tidak mengembalikan nilai (void), fungsi Pesan produk   
    static void PesanProduk(){
        // Deklarsi isi array produk dan harga
        String[] produk = {"Beras Lahap 10kg", "Sarden Jumbo", "1 dus Mie Sakura", "1 Tabak Telor", "Gula 1kg", "Minyak Goreng Bimoli 1 ltr", "Teh Sari Murni", "Kopi Kapal Api", "Bawang Merah 1kg", "Bawang Putih 1kg"};  
        int[] harga = {120000, 15000, 69000, 52000, 17000, 35000, 6000, 1000, 24000, 15000};        
        System.out.println("");
        //Membuat fungsi Scanner memasukan data
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);    
        int PilihProduk, item;
        int total, barang;
        System.out.print("Masukan Jumlah Item Barang : ");
        item = input.nextInt();
        // perulangan jumlah masukan item barang
        for (int b = 0; b < item; b++){
        System.out.print("Pilih Barang : ");
        PilihProduk = input.nextInt();
        // percabangan menggunakan swicth case untuk memesan produk
        switch(PilihProduk){
            case 0 : 
                     //  mengambil data array index 0
                     System.out.println("Nama Barang :" + produk[0] + "\nHarga :" + harga[0]);
                     System.out.print("Jumlah Beli Produk : ");
                     barang = input.nextInt();
                     total= harga[0] * barang;
                     System.out.println("Total Harga Belanja  = "+ total +"\n");
                     break;
            case 1 : 
                     //  mengambil data array index 1
                     System.out.println("Nama Barang :" + produk[1] + "\nHarga :" + harga[1]);
                     System.out.print("Jumlah Beli Produk : ");
                     barang = input.nextInt();
                     total= harga[1] * barang;
                     System.out.println("Total Harga Belanja  = "+ total + "\n");
                     break;
            case 2 : 
                     //  mengambil data array index 2
                     System.out.println("Nama Barang :" + produk[2] + "\nHarga :" + harga[2]);
                     System.out.print("Jumlah Beli Produk : ");
                     barang = input.nextInt();
                     total= harga[2] * barang;
                     System.out.println("Total Harga Belanja  = "+ total);
                     break;
            case 3 : 
                     //  mengambil data array index 3
                     System.out.println("Nama Barang :" + produk[3] + "\nHarga :" + harga[3]);
                     System.out.print("Jumlah Beli Produk : ");
                     barang = input.nextInt();
                     total= harga[3] * barang;
                     System.out.println("Total Harga Belanja  = "+ total);
                     break;
            case 4 : 
                     //  mengambil data array index 4
                     System.out.println("Nama Barang :" + produk[4] + "\nHarga :" + harga[4]);
                     System.out.print("Jumlah Beli Produk : ");
                     barang = input.nextInt();
                     total= harga[4] * barang;
                     System.out.println("Total Harga Belanja  = "+ total);
                     break;
            case 5 : 
                     //  mengambil data array index 5
                     System.out.println("Nama Barang :" + produk[5] + "\nHarga :" + harga[5]);
                     System.out.print("Jumlah Beli Produk : ");
                     barang = input.nextInt();
                     total= harga[5] * barang;
                     System.out.println("Total Harga Belanja  = "+ total);
                     break;
            case 6 : 
                     //  mengambil data array index 6
                     System.out.println("Nama Barang :" + produk[6] + "\nHarga :" + harga[6]);
                     System.out.print("Jumlah Beli Produk : ");
                     barang = input.nextInt();
                     total= harga[6] * barang;
                     System.out.println("Total Harga Belanja  = "+ total);
                     break;
            case 7 : 
                     //  mengambil data array index 7
                     System.out.println("Nama Barang :" + produk[7] + "\nHarga :" + harga[7]);
                     System.out.print("Jumlah Beli Produk : ");
                     barang = input.nextInt();
                     total= harga[7] * barang;
                     System.out.println("Total Harga Belanja  = "+ total);
                     break;
            case 8 : 
                     //  mengambil data array index 8
                     System.out.println("Nama Barang :" + produk[8] + "\nHarga :" + harga[8]);
                     System.out.print("Jumlah Beli Produk : ");
                     barang = input.nextInt();
                     total= harga[8] * barang;
                     System.out.println("Total Harga Belanja  = "+ total);
                     break;
            case 9 : 
                    //  mengambil data array index 9
                     System.out.println("Nama Barang :" + produk[9] + "\nHarga :" + harga[9]);
                     System.out.print("Jumlah Beli Produk : ");
                     barang = input.nextInt();
                     total= harga[9] * barang;
                     System.out.println("Total Harga Belanja  = "+ total);
                     break;
            case 10:
                    // digunakan untuk keluar dari output program
                     System.exit(0);     
                     break;              
            // kondisi jika memilih data tidak sesuai dengan menu pilihan 0 sampai 10
            default:
                     System.out.println("Pilihan tidak ada!!");
                    }
            } System.out.println("Selamat belanja kembali, Terima Kasih. :)"); 
    }

// Fungsi untuk menampilkan menu dan instruksinya 
static void showMenu() 
{
    System.out.println("=======================================================");
    System.out.println("|                 DAFTAR MENU SEMBAKO                 |");
    System.out.println("=======================================================");
    System.out.println("[1] Daftar Produk                                      ");        
    System.out.println("[2] Mencari Harga Produk                               ");
    System.out.println("[3] Mengurutkan Harga                                  ");
    System.out.println("[4] Pesan Produk                                       ");
    System.out.println("[5] Exit                                               ");
    System.out.println("=======================================================");
    // Membuat fungsi Scanner memasukan pilihan menu 
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    int selectedMenu;
    System.out.println("");
    System.out.print("Masukkan Menu : ");
    selectedMenu = scan.nextInt();
    // pemilihan menunya menggunakan percabangan switch case
    switch(selectedMenu){
        // Pilihan 1
        case 1:             
            DaftarProduk();     
            break;              
        // Pilihan 2            
        case 2:
            CariData();         
            break;              
        // Pilihan 3
        case 3:
            MengurutkanHarga(); 
            break;    
        // Pilihan 3
        case 4:
            PesanProduk(); 
            break;           
        case 5:
            // digunakan untuk keluar dari output program
            System.exit(0);     
            break;              
        // kondisi jika memilih data tidak sesuai dengan menu pilihan 1 sampai 5
        default:
            System.out.println("Pilihan tidak ada!!");

    }
}

// Fungsi Program utama untuk menjalankan menu program dan tambahan fungsi untuk membaca error tidaknya program
public static void main(String[] args) throws IOException {
    //Perulangan yang digunakan untuk melakukan instruksi menu program
    do {
        // Menampilkan menu Sembako
        showMenu();
     // Mengecek kondisi sampai kondisi true / sampai pilihan menu pilihan 5 dijalankan
    }while (isRunning);    
}  
}

