import java.util.Scanner;
public class TugasAzziz{
    static Scanner sc000= new Scanner(System.in);
    static Scanner sc00= new Scanner(System.in);
    static Scanner sc0= new Scanner(System.in);
    static Scanner sc01= new Scanner(System.in);
    static Scanner sc= new Scanner(System.in);  
    static Scanner sc1= new Scanner(System.in);
    static Scanner sc2= new Scanner(System.in);
    static Scanner sc3= new Scanner(System.in);
    //Jakarta
    static String [] jenisPesawat = {"\t||   1. Lion Air 703       ||","\t||   2. Batik Air 401      ||"};
    //LionAir
    static String [] lionAir = {" 07.00 - 09.00 WIB "," 12.00 - 14.00 WIB "," 18.00 - 20.00 WIB "};
    static int [] hargaLionAir = {1200000,1300000,1400000};
    static int [] kursiLionAir = new int[10];
    //BatikAir
    static String [] batikAir = {" 08.00 - 09.30 WIB "," 12.00 - 15.00 WIB "," 18.00 - 19.30 WIB "};
    static int [] hargaBatikAir = {1400000,1800000,1500000};
    static int [] kursiBatikAir = new int[7];

    //Pekanbaru
    static String [] jenisPesawatP = {"\t||   1. Citilink 737       ||","\t||   2. Garuda 403         ||"};
    //citilink
    static String [] citilink = {" 08.00 - 10.30 WIB "," 13.00 - 15.30 WIB "," 19.00 - 21.00 WIB "};
    static int [] hargaCitilink = {1750000,1600000,1850000};
    static int [] kursiCitilink = new int[15];
    //Garuda
    static String [] garuda = {" 09.00 - 11.30 WIB "," 12.00 - 14.30 WIB "," 18.00 - 19.30 WIB "};
    static int [] hargaGaruda = {1400000,1800000,1500000};
    static int [] kursiGaruda = new int[0];
    
    //Bali
    static String [] jenisPesawatB = {"\t||   1. Sriwijaya 700      ||","\t||   2. Air Asia 408       ||"};
    //citilink
    static String [] sriwijaya = {" 06.00 - 9.30 WIB  "," 11.00 - 13.30 WIB "," 17.00 - 19.00 WIB "};
    static int [] hargaSriwijaya = {2000000,1850000,1900000};
    static int [] kursiSriwijaya = new int[9];
    //Garuda
    static String [] airAsia = {" 08.30 - 11.30 WIB "," 11.30 - 14.30 WIB "," 18.45 - 19.45 WIB "};
    static int [] hargaAirAsia = {1400000,1800000,1500000};
    static int [] kursiAirAsia = new int[10];
    static double total = 0;
    static String opsi = "\tKetik opsi : ";
    static char lanjut;



    public static void main(String[]args){
        do{
            System.out.println("\t============================================================================================");
            System.out.println("\t\t\tSELAMAT DATANG DI LAYANAN PEMESANAN TIKET PESAWAT AZZIZ TOUR                ");
            System.out.println("\t============================================================================================");
            System.out.print("\t\t\t\tTekan y untuk Pemesanan & t untuk keluar : ");
            lanjut = sc000.next().charAt(0);
            if(lanjut=='y'||lanjut=='Y'){
                System.out.println("\t1. Pesan Tiket\n\t2. Lihat Jadwal Penerbangan\n\t3. Exit from the program");
                System.out.print(opsi);
                int o=sc0.nextInt();
                if(o==1){
                    Tujuan();
                    Proses();
                }else if(o==2){
                    Tujuan();
                }else if(o==3){
                    System.out.println("\n\tANDA KELUAR");
                }else{
                    System.out.println("\n\tANDA KELUAR");
                    System.exit(0);
                }
            }else{
                System.out.println("\n\tANDA KELUAR");
                System.exit(0);
            }
            System.out.println();
            System.out.print("Lakukan Tranksaksi Ulang ? (y/t) : ");
            lanjut = sc000.next().charAt(0);
            if(lanjut=='t'||lanjut=='T'){
                System.out.println("\n\tANDA KELUAR");
                System.exit(0);
            }
        }while(lanjut=='y'||lanjut=='Y');  
    }

    static void Tujuan(){
        System.out.println();
        System.out.println("\t||===========================================================================================||");
        System.out.println("\t||                                  TIKET YANG TERSEDIA                                      ||");
        System.out.println("\t||===========================================================================================||");
        System.out.println("\t||  mm/dd/yy           ||     ASAL              ||           TUJUAN                          ||");
        System.out.println("\t||-------------------------------------------------------------------------------------------||");
        System.out.println("\t||  Jan-Jul/1-20/2022  ||     SURABAYA          -            JAKARTA                         ||");
        System.out.println("\t||  Feb-Des/1-30/2022  ||     JAKARTA           -            PEKANBARU                       ||");
        System.out.println("\t||  Mar-Jun/2-15/2022  ||     SURABAYA          -            BALI                            ||");
        System.out.println("\t||-------------------------------------------------------------------------------------------||");

    }

    static void Proses(){
        IsiNomorKursiLion(0);
        IsiNomorKursiBatik(0);
        IsiNomorKursiCitilink(0);
        IsiNomorKursiGaruda(0);
        IsiNomorKursiSriwijaya(0);
        IsiNomorKursiAirAsia(0);
        System.out.println();
        System.out.print("\tDari             : ");
        String dari = sc01.nextLine();
        System.out.print("\tTujuan           : ");
        String tempatTujuan = sc01.nextLine();
        System.out.print("\tMasukkan bulan   : ");
        int bulan = sc.nextInt();
        System.out.print("\tMasukkan Tanggal : ");
        int tanggal = sc.nextInt();
        System.out.print("\tMasukkan Tahun   : ");
        int tahun = sc.nextInt();

        if(dari.equalsIgnoreCase("Surabaya")&&tempatTujuan.equalsIgnoreCase("Jakarta")){
            Jakarta(dari, tempatTujuan, bulan , tanggal , tahun);
        }
        else if(dari.equalsIgnoreCase("Jakarta")&&tempatTujuan.equalsIgnoreCase("Pekanbaru")){
            Pekanbaru(dari, tempatTujuan, bulan , tanggal , tahun);
        }
        else if(dari.equalsIgnoreCase("Surabaya")&&tempatTujuan.equalsIgnoreCase("Bali")){
            Bali(dari, tempatTujuan, bulan , tanggal , tahun);
        }else {
            System.out.println("\n\tMOHON MAAF, PENERBANGAN TIDAK TERSEDIA");
        }
    }

    //Kursi Batik Yang Tersedia
    static int IsiNomorKursiBatik(int b){
        for(int k=b;k<kursiBatikAir.length;k++){
            kursiBatikAir[k]=k+1;
        }
        return b;
    }
    static int IsiNomorKursiCitilink(int b){
        for(int k=b;k<kursiCitilink.length;k++){
            kursiCitilink[k]=k+1;
        }
        return b;
    }
    static int IsiNomorKursiGaruda(int b){
        for(int k=b;k<kursiGaruda.length;k++){
            kursiGaruda[k]=k+1;
        }
        return b;
    }
    static int IsiNomorKursiSriwijaya(int b){
        for(int k=b;k<kursiSriwijaya.length;k++){
            kursiSriwijaya[k]=k+1;
        }
        return b;
    }
    static int IsiNomorKursiAirAsia(int b){
        for(int k=b;k<kursiAirAsia.length;k++){
            kursiAirAsia[k]=k+1;
        }
        return b;
    }




    //Jenis Maskapai
    static void JenisMaskapaiJakarta(){
        System.out.println();
        System.out.println("\t||=========================||");
        System.out.println("\t||  PILIH JENIS MASKAPAI   ||");
        System.out.println("\t||=========================||");
        for(int i=0;i<jenisPesawat.length;i++){
            System.out.println(jenisPesawat[i]);
        }
        System.out.println("\t||-------------------------||");
        System.out.println();
    }
    static void JenisMaskapaiPekanbaru(){
        System.out.println();
        System.out.println("\t||=========================||");
        System.out.println("\t||  PILIH JENIS MASKAPAI   ||");
        System.out.println("\t||=========================||");
        for(int i=0;i<jenisPesawatP.length;i++){
            System.out.println(jenisPesawatP[i]);
        }
        System.out.println("\t||-------------------------||");
        System.out.println();
    }
    static void JenisMaskapaiBali(){
        System.out.println();
        System.out.println("\t||=========================||");
        System.out.println("\t||  PILIH JENIS MASKAPAI   ||");
        System.out.println("\t||=========================||");
        for(int i=0;i<jenisPesawatB.length;i++){
            System.out.println(jenisPesawatB[i]);
        }
        System.out.println("\t||-------------------------||");
        System.out.println();
    }

    //Jadwal Penerbangan Lion Air SBY-JKT
    static void JadwalPenerbanganLion(){
        System.out.println("\t||===========================================================================================||");
        System.out.println("\t||                                PILIH JADWAL PENERBANGAN                                   ||");
        System.out.println("\t||===========================================================================================||");
        System.out.println("\t|| KODE PESAWAT ||     JADWAL PENERBANGAN      ||    HARGA            || KURSI YANG TERSEDIA ||");
        for(int i=0;i<lionAir.length;i++){  
            System.out.println("\t|| JKT"+(i+1) +"         ||     "+lionAir[i] + "     ||    Rp. " + hargaLionAir[i] + "      ||   "+kursiLionAir.length+ " kursi          ||" );
        }
        System.out.println("\t||-------------------------------------------------------------------------------------------||");
    }

    //Jadwal Penerbangan Batik Air SBY-JKT
    static void JadwalPenerbanganBatik(){
        System.out.println("\t||===========================================================================================||");
        System.out.println("\t||                                PILIH JADWAL PENERBANGAN                                   ||");
        System.out.println("\t||===========================================================================================||");
        System.out.println("\t|| KODE PESAWAT ||     JADWAL PENERBANGAN      ||    HARGA            || KURSI YANG TERSEDIA ||");  
        for(int i=0;i<batikAir.length;i++){  
            System.out.println("\t|| JKB"+(i+1) +"         ||     "+batikAir[i] + "     ||    Rp. " + hargaBatikAir[i] + "      ||   "+kursiBatikAir.length+ " kursi           ||" );
        }
        System.out.println("\t||-------------------------------------------------------------------------------------------||");
    }

    static void JadwalPenerbanganCililink(){
        System.out.println("\t||===========================================================================================||");
        System.out.println("\t||                                PILIH JADWAL PENERBANGAN                                   ||");
        System.out.println("\t||===========================================================================================||");
        System.out.println("\t|| KODE PESAWAT ||     JADWAL PENERBANGAN      ||    HARGA            || KURSI YANG TERSEDIA ||");  
        for(int i=0;i<citilink.length;i++){  
            System.out.println("\t|| PKU"+(i+1) +"         ||     "+citilink[i] + "     ||    Rp. " + hargaCitilink[i] + "      ||   "+kursiCitilink.length+ " kursi          ||" );
        }
        System.out.println("\t||-------------------------------------------------------------------------------------------||");
    }

    static void JadwalPenerbanganSriwijaya(){
        System.out.println("\t||===========================================================================================||");
        System.out.println("\t||                                PILIH JADWAL PENERBANGAN                                   ||");
        System.out.println("\t||===========================================================================================||");
        System.out.println("\t|| KODE PESAWAT ||     JADWAL PENERBANGAN      ||    HARGA            || KURSI YANG TERSEDIA ||");
        for(int i=0;i<sriwijaya.length;i++){  
            System.out.println("\t|| BLI"+(i+1) +"         ||     "+sriwijaya[i] + "     ||    Rp. " + hargaSriwijaya[i] + "      ||   "+kursiSriwijaya.length+ " kursi           ||" );
        }
        System.out.println("\t||-------------------------------------------------------------------------------------------||");
    }

    static void JadwalPenerbanganAirAsia(){
        System.out.println("\t||===========================================================================================||");
        System.out.println("\t||                                PILIH JADWAL PENERBANGAN                                   ||");
        System.out.println("\t||===========================================================================================||");
        System.out.println("\t|| KODE PESAWAT ||     JADWAL PENERBANGAN      ||    HARGA            || KURSI YANG TERSEDIA ||");
        for(int i=0;i<airAsia.length;i++){  
            System.out.println("\t|| BLA"+(i+1) +"         ||     "+airAsia[i] + "     ||    Rp. " + hargaAirAsia[i] + "      ||   "+kursiAirAsia.length+ " kursi          ||" );
        }
        System.out.println("\t||-------------------------------------------------------------------------------------------||");
    }



    static void Jakarta(String dari, String tempatTujuan , int bulan , int tanggal , int tahun){
        if(dari.equalsIgnoreCase("Surabaya") && tempatTujuan.equalsIgnoreCase("Jakarta")){
            //Penentuan jadwal penerbangan yang tersedia
            if(bulan>=1 && bulan<=7 && tanggal>=1 && tanggal<=20 && tahun==2022){
                JenisMaskapaiJakarta();
                System.out.print(opsi);
                int jenis = sc.nextInt();
                System.out.println();
                if(jenis==1){
                    jenisPesawatL(1);
                }
                else if(jenis==2){
                    jenisPesawatB(2);
                    if(kursiBatikAir.length==0){
                        System.out.println("\tMAAF PENERBANGAN UNTUK MASKAPAI BATIK AIR SEMENTARA TIDAK TERSEDIA !!!");
                    }
                }else{
                    System.out.println("\tMOHON MAAF , JENIS MASKAPAI TIDAK TERSEDIA");
                }
            }
            else{
                if(bulan < 1 || bulan > 7){
                    System.out.println("\tPenerbangan Pada Bulan "+bulan +" Tidak Tersedia, Penerbangan yang tersedia hanya bulan 1-7");
                }if(tanggal<1 || tanggal>10){
                    System.out.println("\tPenerbangan Pada Tanggal "+tanggal+ " Tidak Tersedia, Penerbangan yang tersedia hanya tanggal 1-7");
                }if(tahun != 2022){
                    System.out.println("\tPenerbangan Pada Tahun "+tahun+" Tidak Tersedia, Penerbangan Hanya Ada Pada Tahun 2022");
                }
            }
        }
    }

    static void Pekanbaru(String dari, String tempatTujuan , int bulan , int tanggal , int tahun){
        if(dari.equalsIgnoreCase("Jakarta") && tempatTujuan.equalsIgnoreCase("Pekanbaru")){
            if(bulan>=2 && bulan<=12 && tanggal>=1 && tanggal<=30 && tahun==2022){
                JenisMaskapaiPekanbaru();
                System.out.print(opsi);
                int jenis = sc.nextInt();
                System.out.println();
                if(jenis==1){
                    jenisPesawatC(1);
                }
                else if(jenis==2){
                    if(kursiGaruda.length==0){
                        System.out.println("\tMAAF PENERBANGAN UNTUK MASKAPAI GARUDA INDONESIA SEMENTARA TIDAK TERSEDIA !!!");
                    }
                }else{
                    System.out.println("\tMOHON MAAF , JENIS MASKAPAI TIDAK TERSEDIA");
                }
            }
            else{
                if(bulan < 2 || bulan > 12){
                    System.out.println("\tPenerbangan Pada Bulan "+bulan +" Tidak Tersedia, Penerbangan yang tersedia hanya bulan 2-12");
                }if(tanggal<1 || tanggal>30){
                    System.out.println("\tPenerbangan Pada Tanggal "+tanggal+ " Tidak Tersedia, Penerbangan yang tersedia hanya tanggal 1-30");
                }if(tahun != 2022){
                    System.out.println("\tPenerbangan Pada Tahun "+tahun+" Tidak Tersedia, Penerbangan Hanya Ada Pada Tahun 2022");
                }
            }
        }
    }
    static void Bali(String dari, String tempatTujuan , int bulan , int tanggal , int tahun){
        if(dari.equalsIgnoreCase("Surabaya") && tempatTujuan.equalsIgnoreCase("Bali")){
            if(bulan>=3 && bulan<=6 && tanggal>=2 && tanggal<=15 && tahun==2022){
                JenisMaskapaiBali();
                System.out.print(opsi);
                int jenis = sc.nextInt();
                System.out.println();
                if(jenis==1){
                    jenisPesawatS(1);
                }
                else if(jenis==2){
                    jenisPesawatA(2);
                    if(kursiAirAsia.length==0){
                        System.out.println("\tMAAF PENERBANGAN UNTUK MASKAPAI SRIWIJAYA SEMENTARA TIDAK TERSEDIA !!!");
                    }
                }else{
                    System.out.println("\tMOHON MAAF , JENIS MASKAPAI TIDAK TERSEDIA");
                }
            }
            else{
                if(bulan < 3 || bulan > 6){
                    System.out.println("\tPenerbangan Pada Bulan "+bulan +" Tidak Tersedia, Penerbangan yang tersedia hanya bulan 3-6");
                }if(tanggal<2 || tanggal>15){
                    System.out.println("\tPenerbangan Pada Tanggal "+tanggal+ " Tidak Tersedia, Penerbangan yang tersedia hanya tanggal 2-15");
                }if(tahun != 2022){
                    System.out.println("\tPenerbangan Pada Tahun "+tahun+" Tidak Tersedia, Penerbangan Hanya Ada Pada Tahun 2022");
                }
            }
        }
    }




//---------------------------------------------------------------SURABAYA-JAKARTA---------------------------------------------------------------------------------------
    static void jenisPesawatL(int jenis){
        if(jenis==1){
            JadwalPenerbanganLion();
            System.out.print("\n\tMasukkan Kode Pesawat         : ");
            String kodePesawat= sc1.nextLine();
            kodeJKT(kodePesawat);
        }
    }
    static void kodeJKT(String kodePesawat){
        if(kodePesawat.equalsIgnoreCase("JKT1") || kodePesawat.equalsIgnoreCase("JKT2") || kodePesawat.equalsIgnoreCase("JKT3")){
        //Input Data Penumpang\
            System.out.print("\tMasukkan Jumlah Penumpang     : ");
            int jumlah = sc.nextInt();
             //Perulangan Untuk input data penumpang
            System.out.println();
             System.out.println(" |-------------------------------------------------------------------------");
            System.out.println(" |                        IDENTITAS PENUMPANNG                             ");
            for(int i=1;i<=jumlah;i++){
                System.out.println(" |-------------------------------------------------------------------------");
                System.out.print(" | Nama Penumpang "+i+"              : ");
                String nama = sc2.nextLine();
                System.out.print(" | umur                          : ");
                int umur = sc.nextInt();
                if(kodePesawat.equalsIgnoreCase("JKT1")){
                    total += hargaLionAir[0];
                }
                else if(kodePesawat.equalsIgnoreCase("JKT2")){
                    total += hargaLionAir[1];
                }
                else if(kodePesawat.equalsIgnoreCase("JKT3")){
                    total += hargaLionAir[2];
                }  
                //Untuk Penumpang Dewasa
                ifL(kodePesawat, umur);
            }
            System.out.println(" |-------------------------------------------------------------------------");
            System.out.println(" | Total Bayar                   : Rp. "+total);
            System.out.println(" |-------------------------------------------------------------------------");
            int totalkursi = kursiLionAir.length-jumlah;
            if(kodePesawat.equalsIgnoreCase("JKT1")){
                System.out.println(" | SISA KURSI PADA JAM PENERBANGAN "+lionAir[0] + " : " + totalkursi + " kursi");
            }
            else if(kodePesawat.equalsIgnoreCase("JKT2")){
                System.out.println(" | SISA KURSI PADA JAM PENERBANGAN "+lionAir[1] + " : " + totalkursi + " kursi");
            }
            else if(kodePesawat.equalsIgnoreCase("JKT3")){
                System.out.println(" | SISA KURSI PADA JAM PENERBANGAN "+lionAir[2] + " : " + totalkursi + " kursi");
            }
            System.out.println(" |-------------------------------------------------------------------------");
            System.out.println("\n\n\n\n\n");
            System.out.println("\t =========================================================================");
            System.out.println("\t                          STRUK PEMBAYARAN                                ");
            System.out.println("\t -------------------------------------------------------------------------");
            System.out.println("\t  TAGIHAN                  : Rp. "+total);
            System.out.print("\t  NOMINAL UANG             : Rp. ");
            int nominal = sc00.nextInt();
            double kembalian = nominal-total;
            System.out.println("\t  UANG KEMBALIAN           : Rp. "+kembalian);
            System.out.println("\t =========================================================================");
            System.out.println("\t                            TERIMA KASIH                                  ");
            System.out.println("\t =========================================================================");
        }else{
            System.out.println("\n\tKODE PESAWAT YANG ANDA MASUKKAN SALAH"); 
            jenisPesawatL(1);
        }
    }

    static void ifL(String kodePesawat, int umur){
        if(umur>1){
            //Pilih Kursi Yang Tersedia
            System.out.print(" | Pilih Nomor Kursi '1 - "+kursiLionAir.length+"'     : ");
            inputL();
        
            System.out.println();
            //Proses total harga Tiket Dewaasa
            if(kodePesawat.equalsIgnoreCase("JKT1")){
                double tt=hargaLionAir[0];
                System.out.println(" | Harga Tiket Dewasa            : "+tt);
            }
            else if(kodePesawat.equalsIgnoreCase("JKT2")){
                double tt=hargaLionAir[1];
                System.out.println(" | Harga Tiket Dewasa            : "+tt);
            }
            else if(kodePesawat.equalsIgnoreCase("JKT3")){
                double tt=hargaLionAir[2];
                System.out.println(" | Harga Tiket Dewasa            : "+tt);
            }
        }else if(umur<=1){
            System.out.println(" | Tanpa Kursi");
            //Total Harga tiket Anak-anak
            if(kodePesawat.equalsIgnoreCase("JKT1")){
                double t = hargaLionAir[0]*0.25;
                double  tt = hargaLionAir[0]-t;
                System.out.println(" | Harga Tiket Anak-anak         : "+tt);
                total-= t;
            }
            else if(kodePesawat.equalsIgnoreCase("JKT2")){
                double t = hargaLionAir[1]*0.25;
                double  tt = hargaLionAir[1]-t;
                System.out.println(" | Harga Tiket Anak-anak         : "+tt);
                total-= t;
            }
            else if(kodePesawat.equalsIgnoreCase("JKT3")){
                double t = hargaLionAir[2]*0.25;
                double  tt = hargaLionAir[2]-t;
                System.out.println(" | Harga Tiket Anak-anak         : "+tt);
                total-= t;
            }
        }
    }

    static void jenisPesawatB(int jenis){
        if(jenis==2){
            JadwalPenerbanganBatik();
            System.out.print("\n\tMasukkan Kode Pesawat         : ");
            String kodePesawat= sc1.nextLine();
            kodeJKB(kodePesawat);
        }
    }

    static void kodeJKB(String kodePesawat){
        if(kodePesawat.equalsIgnoreCase("JKB1") || kodePesawat.equalsIgnoreCase("JKB2") || kodePesawat.equalsIgnoreCase("JKB3")){
        //Input Data Penumpang
            System.out.print("\tMasukkan Jumlah Penumpang     : ");
            int jumlah = sc.nextInt();
            //Perulangan Untuk input data penumpang
            System.out.println();
            System.out.println(" |-------------------------------------------------------------------------");
            System.out.println(" |                        IDENTITAS PENUMPANNG                             ");
            for(int i=1;i<=jumlah;i++){
                 System.out.println(" |-------------------------------------------------------------------------");
                System.out.print(" | Nama Penumpang "+i+"              : ");
                String nama = sc2.nextLine();
                System.out.print(" | umur                          : ");
                int umur = sc.nextInt();
                if(kodePesawat.equalsIgnoreCase("JKB1")){
                    total += hargaBatikAir[0];
                }
                else if(kodePesawat.equalsIgnoreCase("JKB2")){
                    total += hargaBatikAir[1];
                }
                else if(kodePesawat.equalsIgnoreCase("JKB3")){
                    total += hargaBatikAir[2];
                }
                //Untuk Penumpang Dewasa
                ifB(kodePesawat, umur);
            }
            System.out.println(" |-------------------------------------------------------------------------");
            System.out.println(" | Total Bayar                   : Rp. "+total);
            System.out.println(" |-------------------------------------------------------------------------");
            int totalkursi = kursiBatikAir.length-jumlah;
            if(kodePesawat.equalsIgnoreCase("JKB1")){
                System.out.println(" | SISA KURSI PADA JAM PENERBANGAN "+batikAir[0] + " : " + totalkursi + " kursi");
            }
            else if(kodePesawat.equalsIgnoreCase("JKB2")){
                System.out.println(" | SISA KURSI PADA JAM PENERBANGAN "+batikAir[1] + " : " + totalkursi + " kursi");
            }
            else if(kodePesawat.equalsIgnoreCase("JKB3")){
                System.out.println(" | SISA KURSI PADA JAM PENERBANGAN "+batikAir[2] + " : " + totalkursi + " kursi");
            }
            System.out.println(" |-------------------------------------------------------------------------");
            System.out.println("\n\n\n\n\n");
            System.out.println("\t =========================================================================");
            System.out.println("\t                          STRUK PEMBAYARAN                                ");
            System.out.println("\t -------------------------------------------------------------------------");
            System.out.println("\t  TAGIHAN                  : Rp. "+total);
            System.out.print("\t  NOMINAL UANG             : Rp. ");
            int nominal = sc00.nextInt();
            double kembalian = nominal-total;
            System.out.println("\t  UANG KEMBALIAN           : Rp. "+kembalian);
            System.out.println("\t =========================================================================");
            System.out.println("\t                            TERIMA KASIH                                  ");
            System.out.println("\t =========================================================================");
        }else{
            System.out.println("\n\tKODE PESAWAT YANG ANDA MASUKKAN SALAH");
            jenisPesawatB(2);
        }
    }

    static void ifB(String kodePesawat, int umur){
        if(umur>1){
        //Pilih Kursi Yang Tersedia
            System.out.print(" | Pilih Nomor Kursi '1 - "+kursiBatikAir.length+"'     : ");
            inputB();
        
            System.out.println();
            //Proses total harga Tiket Dewaasa
            if(kodePesawat.equalsIgnoreCase("JKB1")){
                double tt=hargaBatikAir[0];
                System.out.println(" | Harga Tiket Dewasa            : "+tt);
            }
            else if(kodePesawat.equalsIgnoreCase("JKB2")){
                double tt=hargaBatikAir[1];
                System.out.println(" | Harga Tiket Dewasa            : "+tt);
            }
            else if(kodePesawat.equalsIgnoreCase("JKB3")){
                double tt=hargaBatikAir[2];
                System.out.println(" | Harga Tiket Dewasa            : "+tt);
            }
        }else if(umur<=1){
            System.out.println(" | Tanpa Kursi");
            //Total Harga tiket Anak-anak
            if(kodePesawat.equalsIgnoreCase("JKB1")){
                double t = hargaBatikAir[0]*0.25;
                double  tt = hargaBatikAir[0]-t;
                System.out.println(" | Harga Tiket Anak-anak         : "+tt);
                total-= t;
            }
            else if(kodePesawat.equalsIgnoreCase("JKB2")){
                double t = hargaBatikAir[1]*0.25;
                double  tt = hargaBatikAir[1]-t;
                System.out.println(" | Harga Tiket Anak-anak         : "+tt);
                total-= t;
            }
            else if(kodePesawat.equalsIgnoreCase("JKB3")){
                double t = hargaBatikAir[2]*0.25;
                double  tt = hargaBatikAir[2]-t;
                System.out.println(" | Harga Tiket Anak-anak         : "+tt);
                total-= t;
            }
        }
    }


//-------------------------------------------------------------------JAKARTA-PEKANBARU--------------------------------------------------------------------------------

    static void jenisPesawatC(int jenis){
        if(jenis==1){
            JadwalPenerbanganCililink();
            System.out.print("\n\tMasukkan Kode Pesawat         : ");
            String kodePesawat= sc1.nextLine();
            kodePKU(kodePesawat);
        }
    }

    static void kodePKU(String kodePesawat){
        if(kodePesawat.equalsIgnoreCase("PKU1") || kodePesawat.equalsIgnoreCase("PKU2") || kodePesawat.equalsIgnoreCase("PKU3")){
        //Input Data Penumpang
            System.out.print("\tMasukkan Jumlah Penumpang     : ");
            int jumlah = sc.nextInt();
            //Perulangan Untuk input data penumpang
            System.out.println();
            System.out.println(" |-------------------------------------------------------------------------");
            System.out.println(" |                        IDENTITAS PENUMPANNG                             ");
            for(int i=1;i<=jumlah;i++){
                 System.out.println(" |-------------------------------------------------------------------------");
                System.out.print(" | Nama Penumpang "+i+"              : ");
                String nama = sc2.nextLine();
                System.out.print(" | umur                          : ");
                int umur = sc.nextInt();
                if(kodePesawat.equalsIgnoreCase("PKU1")){
                    total += hargaCitilink[0];
                }
                else if(kodePesawat.equalsIgnoreCase("PKU2")){
                    total += hargaCitilink[1];
                }
                else if(kodePesawat.equalsIgnoreCase("PKU3")){
                    total += hargaCitilink[2];
                }
                    
                //Untuk Penumpang Dewasa
                ifC(kodePesawat, umur);
            }
            System.out.println(" |-------------------------------------------------------------------------");
            System.out.println(" | Total Bayar                   : Rp. "+total);
            System.out.println(" |-------------------------------------------------------------------------");
            int totalkursi = kursiCitilink.length-jumlah;
            if(kodePesawat.equalsIgnoreCase("PKU1")){
                System.out.println(" | SISA KURSI PADA JAM PENERBANGAN "+citilink[0] + " : " + totalkursi + " kursi");
            }
            else if(kodePesawat.equalsIgnoreCase("PKU2")){
                System.out.println(" | SISA KURSI PADA JAM PENERBANGAN "+citilink[1] + " : " + totalkursi + " kursi");
            }
            else if(kodePesawat.equalsIgnoreCase("PKU3")){
                System.out.println(" | SISA KURSI PADA JAM PENERBANGAN "+citilink[2] + " : " + totalkursi + " kursi");
            }
            System.out.println(" |-------------------------------------------------------------------------");
            System.out.println("\n\n\n\n\n");
            System.out.println("\t =========================================================================");
            System.out.println("\t                          STRUK PEMBAYARAN                                ");
            System.out.println("\t -------------------------------------------------------------------------");
            System.out.println("\t  TAGIHAN                  : Rp. "+total);
            System.out.print("\t  NOMINAL UANG             : Rp. ");
            int nominal = sc00.nextInt();
            double kembalian = nominal-total;
            System.out.println("\t  UANG KEMBALIAN           : Rp. "+kembalian);
            System.out.println("\t =========================================================================");
            System.out.println("\t                            TERIMA KASIH                                  ");
            System.out.println("\t =========================================================================");
        }else{
            System.out.println("\n\tKODE PESAWAT YANG ANDA MASUKKAN SALAH");
            jenisPesawatC(1);
        }
    }

    static void ifC(String kodePesawat, int umur){
        if(umur>1){
        //Pilih Kursi Yang Tersedia
            System.out.print(" | Pilih Nomor Kursi '1 - "+kursiCitilink.length+"'     : ");
            inputC();
        
            System.out.println();
            //Proses total harga Tiket Dewaasa
            if(kodePesawat.equalsIgnoreCase("PKU1")){
                double tt=hargaCitilink[0];
                System.out.println(" | Harga Tiket Dewasa            : "+tt);
            }
            else if(kodePesawat.equalsIgnoreCase("PKU2")){
                double tt=hargaCitilink[1];
                System.out.println(" | Harga Tiket Dewasa            : "+tt);
            }
            else if(kodePesawat.equalsIgnoreCase("PKU3")){
                double tt=hargaCitilink[2];
                System.out.println(" | Harga Tiket Dewasa            : "+tt);
            }
        }else if(umur<=1){
            System.out.println(" | Tanpa Kursi");
            //Total Harga tiket Anak-anak
            if(kodePesawat.equalsIgnoreCase("PKU1")){
                double t = hargaCitilink[0]*0.25;
                double  tt = hargaCitilink[0]-t;
                System.out.println(" | Harga Tiket Anak-anak         : "+tt);
                total-= t;
            }
            else if(kodePesawat.equalsIgnoreCase("PKU2")){
                double t = hargaCitilink[1]*0.25;
                double  tt = hargaCitilink[1]-t;
                System.out.println(" | Harga Tiket Anak-anak         : "+tt);
                total-= t;
            }
            else if(kodePesawat.equalsIgnoreCase("PKU3")){
                double t = hargaCitilink[2]*0.25;
                double  tt = hargaCitilink[2]-t;
                System.out.println(" | Harga Tiket Anak-anak         : "+tt);
                total-= t;
            }
        }
    }

    //-------------------------------------------------------------------SURABAYA-BALI--------------------------------------------------------------------------------
    static void jenisPesawatS(int jenis){
        if(jenis==1){
        JadwalPenerbanganSriwijaya();
        System.out.print("\n\tMasukkan Kode Pesawat         : ");
        String kodePesawat= sc1.nextLine();
        kodeBLI(kodePesawat);
        }
    }

    static void kodeBLI(String kodePesawat){
        if(kodePesawat.equalsIgnoreCase("BLI1") || kodePesawat.equalsIgnoreCase("BLI2") || kodePesawat.equalsIgnoreCase("BLI3")){
        //Input Data Penumpang
            System.out.print("\tMasukkan Jumlah Penumpang     : ");
            int jumlah = sc.nextInt();
            //Perulangan Untuk input data penumpang
            System.out.println();
            System.out.println(" |-------------------------------------------------------------------------");
            System.out.println(" |                        IDENTITAS PENUMPANNG                             ");
            for(int i=1;i<=jumlah;i++){
                 System.out.println(" |-------------------------------------------------------------------------");
                System.out.print(" | Nama Penumpang "+i+"              : ");
                String nama = sc2.nextLine();
                System.out.print(" | umur                          : ");
                int umur = sc.nextInt();
                if(kodePesawat.equalsIgnoreCase("BLI1")){
                    total += hargaSriwijaya[0];
                }
                else if(kodePesawat.equalsIgnoreCase("BLI2")){
                    total += hargaSriwijaya[1];
                }
                else if(kodePesawat.equalsIgnoreCase("BLI3")){
                    total += hargaSriwijaya[2];
                }
                    
                //Untuk Penumpang Dewasa
                ifS(kodePesawat, umur);
            }
            System.out.println(" |-------------------------------------------------------------------------");
            System.out.println(" | Total Bayar                   : Rp. "+total);
            System.out.println(" |-------------------------------------------------------------------------");
            int totalkursi = kursiSriwijaya.length-jumlah;
            if(kodePesawat.equalsIgnoreCase("BLI1")){
                System.out.println(" | SISA KURSI PADA JAM PENERBANGAN "+sriwijaya[0] + " : " + totalkursi + " kursi");
            }
            else if(kodePesawat.equalsIgnoreCase("BLI2")){
                System.out.println(" | SISA KURSI PADA JAM PENERBANGAN "+sriwijaya[1] + " : " + totalkursi + " kursi");
            }
            else if(kodePesawat.equalsIgnoreCase("BLI3")){
                System.out.println(" | SISA KURSI PADA JAM PENERBANGAN "+sriwijaya[2] + " : " + totalkursi + " kursi");
            }
            System.out.println(" |-------------------------------------------------------------------------");
            System.out.println("\n\n\n\n\n");
            System.out.println("\t =========================================================================");
            System.out.println("\t                          STRUK PEMBAYARAN                                ");
            System.out.println("\t -------------------------------------------------------------------------");
            System.out.println("\t  TAGIHAN                  : Rp. "+total);
            System.out.print("\t  NOMINAL UANG             : Rp. ");
            int nominal = sc00.nextInt();
            double kembalian = nominal-total;
            System.out.println("\t  UANG KEMBALIAN           : Rp. "+kembalian);
            System.out.println("\t =========================================================================");
            System.out.println("\t                            TERIMA KASIH                                  ");
            System.out.println("\t =========================================================================");
        }else{
            System.out.println("\n\tKODE PESAWAT YANG ANDA MASUKKAN SALAH");
            jenisPesawatS(1);
        }
    }
    static void ifS(String kodePesawat, int umur){
        if(umur>1){
        //Pilih Kursi Yang Tersedia
            System.out.print(" | Pilih Nomor Kursi '1 - "+kursiSriwijaya.length+"'     : ");
            inputS();
        
            System.out.println();
            //Proses total harga Tiket Dewaasa
            if(kodePesawat.equalsIgnoreCase("BLI1")){
                double tt=hargaSriwijaya[0];
                System.out.println(" | Harga Tiket Dewasa            : "+tt);
            }
            else if(kodePesawat.equalsIgnoreCase("BLI2")){
                double tt=hargaSriwijaya[1];
                System.out.println(" | Harga Tiket Dewasa            : "+tt);
            }
            else if(kodePesawat.equalsIgnoreCase("BLI3")){
                double tt=hargaSriwijaya[2];
                System.out.println(" | Harga Tiket Dewasa            : "+tt);
            }
        }else if(umur<=1){
            System.out.println(" | Tanpa Kursi");
            //Total Harga tiket Anak-anak
            if(kodePesawat.equalsIgnoreCase("BLI1")){
                double t = hargaSriwijaya[0]*0.25;
                double  tt = hargaSriwijaya[0]-t;
                System.out.println(" | Harga Tiket Anak-anak         : "+tt);
                total-= t;
            }
            else if(kodePesawat.equalsIgnoreCase("BLI2")){
                double t = hargaSriwijaya[1]*0.25;
                double  tt = hargaSriwijaya[1]-t;
                System.out.println(" | Harga Tiket Anak-anak         : "+tt);
                total-= t;
            }
            else if(kodePesawat.equalsIgnoreCase("BLI3")){
                double t = hargaSriwijaya[2]*0.25;
                double  tt = hargaSriwijaya[2]-t;
                System.out.println(" | Harga Tiket Anak-anak         : "+tt);
                total-= t;
            }
        }
    }


    static void jenisPesawatA(int jenis){
        if(jenis==2){
            JadwalPenerbanganAirAsia();
            System.out.print("\n\tMasukkan Kode Pesawat         : ");
            String kodePesawat= sc1.nextLine();
            kodeBLA(kodePesawat);
        }
    }
       
    static void kodeBLA(String kodePesawat){
        if(kodePesawat.equalsIgnoreCase("BLA1") || kodePesawat.equalsIgnoreCase("BLA2") || kodePesawat.equalsIgnoreCase("BLA3")){
        //Input Data Penumpang
            System.out.print("\tMasukkan Jumlah Penumpang     : ");
            int jumlah = sc.nextInt();
            //Perulangan Untuk input data penumpang
            System.out.println();
            System.out.println(" |-------------------------------------------------------------------------");
            System.out.println(" |                        IDENTITAS PENUMPANNG                             ");
            for(int i=1;i<=jumlah;i++){
                 System.out.println(" |-------------------------------------------------------------------------");
                System.out.print(" | Nama Penumpang "+i+"              : ");
                String nama = sc2.nextLine();
                System.out.print(" | umur                          : ");
                int umur = sc.nextInt();
                if(kodePesawat.equalsIgnoreCase("BLA1")){
                    total += hargaAirAsia[0];
                }
                else if(kodePesawat.equalsIgnoreCase("BLA2")){
                    total += hargaAirAsia[1];
                }
                else if(kodePesawat.equalsIgnoreCase("BLA3")){
                    total += hargaAirAsia[2];
                }
                    
                //Untuk Penumpang Dewasa
                ifA(kodePesawat, umur);
            }
            System.out.println(" |-------------------------------------------------------------------------");
            System.out.println(" | Total Bayar                   : Rp. "+total);
            System.out.println(" |-------------------------------------------------------------------------");
            int totalkursi = kursiAirAsia.length-jumlah;
            if(kodePesawat.equalsIgnoreCase("BLA1")){
                System.out.println(" | SISA KURSI PADA JAM PENERBANGAN "+airAsia[0] + " : " + totalkursi + " kursi");
            }
            else if(kodePesawat.equalsIgnoreCase("BLA2")){
                System.out.println(" | SISA KURSI PADA JAM PENERBANGAN "+airAsia[1] + " : " + totalkursi + " kursi");
            }
            else if(kodePesawat.equalsIgnoreCase("BLA3")){
                System.out.println(" | SISA KURSI PADA JAM PENERBANGAN "+airAsia[2] + " : " + totalkursi + " kursi");
            }
            System.out.println(" |-------------------------------------------------------------------------");
            System.out.println("\n\n\n\n\n");
            System.out.println("\t =========================================================================");
            System.out.println("\t                          STRUK PEMBAYARAN                                ");
            System.out.println("\t -------------------------------------------------------------------------");
            System.out.println("\t  TAGIHAN                  : Rp. "+total);
            System.out.print("\t  NOMINAL UANG             : Rp. ");
            int nominal = sc00.nextInt();
            double kembalian = nominal-total;
            System.out.println("\t  UANG KEMBALIAN           : Rp. "+kembalian);
            System.out.println("\t =========================================================================");
            System.out.println("\t                            TERIMA KASIH                                  ");
            System.out.println("\t =========================================================================");
        }else{
            System.out.println("\n\tKODE PESAWAT YANG ANDA MASUKKAN SALAH");
            jenisPesawatA(2);
        }
    }

    static void ifA(String kodePesawat, int umur){
        if(umur>1){
        //Pilih Kursi Yang Tersedia
            System.out.print(" | Pilih Nomor Kursi '1 - "+kursiAirAsia.length+"'     : ");
            inputA();
        
            System.out.println();
            //Proses total harga Tiket Dewaasa
            if(kodePesawat.equalsIgnoreCase("BLA1")){
                double tt=hargaAirAsia[0];
                System.out.println(" | Harga Tiket Dewasa            : "+tt);
            }
            else if(kodePesawat.equalsIgnoreCase("BLA2")){
                double tt=hargaAirAsia[1];
                System.out.println(" | Harga Tiket Dewasa            : "+tt);
            }
            else if(kodePesawat.equalsIgnoreCase("BLA3")){
                double tt=hargaAirAsia[2];
                System.out.println(" | Harga Tiket Dewasa            : "+tt);
            }
        }else if(umur<=1){
            System.out.println(" | Tanpa Kursi");
            //Total Harga tiket Anak-anak
            if(kodePesawat.equalsIgnoreCase("BLA1")){
                double t = hargaAirAsia[0]*0.25;
                double  tt = hargaAirAsia[0]-t;
                System.out.println(" | Harga Tiket Anak-anak         : "+tt);
                total-= t;
            }
            else if(kodePesawat.equalsIgnoreCase("BLA2")){
                double t = hargaAirAsia[1]*0.25;
                double  tt = hargaAirAsia[1]-t;
                System.out.println(" | Harga Tiket Anak-anak         : "+tt);
                total-= t;
            }
            else if(kodePesawat.equalsIgnoreCase("BLA3")){
                double t = hargaAirAsia[2]*0.25;
                double  tt = hargaAirAsia[2]-t;
                System.out.println(" | Harga Tiket Anak-anak         : "+tt);
                total-= t;
            }
        }
    }



//ISI KURSI
    //Kursi Lion Yang Tersedia
    static int IsiNomorKursiLion(int b){
        for(int k=b;k<kursiLionAir.length;k++){
            kursiLionAir[k]=k+1;
        }
        return b;
    }




//INPUT KURSI
    static void inputL(){
           for(int z=0;z<1000;z++){
            int p = sc3.nextInt();
                if(p<1 || p>kursiLionAir.length){
                    System.out.println(" | Kursi Tidak Tersedia");
                    System.out.print(" | Masukkan Nomor Kursi Kembali  : ");
                }else if(p>=1 || p<=kursiLionAir.length){
                    boolean cekKursi = false;
                    for(int x=0;x<kursiLionAir.length;x++){
                        if(kursiLionAir[x]==p){
                            kursiLionAir[x] = -1;
                            cekKursi = true;
                            System.out.print(" | Nomor Kursi                   : "+ (x+1));
                        }
                    }
                    if(!cekKursi) {
                        System.out.println(" | Kursi telah dipesan");
                        System.out.print(" | Masukkan Nomor Kursi Kembali : ");
                    }
                    if(cekKursi==true){
                        break;    
                    }
                }
        }
    }
    static void inputB(){
           for(int z=0;z<1000;z++){
            int p = sc3.nextInt();
                if(p<1 || p>kursiBatikAir.length){
                    System.out.println(" | Kursi Tidak Tersedia");
                    System.out.print(" | Masukkan Nomor Kursi Kembali  : ");
                }else if(p>=1 || p<=kursiBatikAir.length){
                    boolean cekKursi = false;
                    for(int x=0;x<kursiBatikAir.length;x++){
                        if(kursiBatikAir[x]==p){
                            kursiBatikAir[x] = -1;
                            cekKursi = true;
                            System.out.print(" | Nomor Kursi                   : "+ (x+1));
                        }
                    }
                    if(!cekKursi) {
                        System.out.println(" | Kursi telah dipesan");
                        System.out.print(" | Masukkan Nomor Kursi Kembali : ");
                    }
                    if(cekKursi==true){
                        break;    
                    }
                }
        }
    }
    static void inputC(){
           for(int z=0;z<1000;z++){
            int p = sc3.nextInt();
                if(p<1 || p>kursiCitilink.length){
                    System.out.println(" | Kursi Tidak Tersedia");
                    System.out.print(" | Masukkan Nomor Kursi Kembali  : ");
                }else if(p>=1 || p<=kursiCitilink.length){
                    boolean cekKursi = false;
                    for(int x=0;x<kursiCitilink.length;x++){
                        if(kursiCitilink[x]==p){
                            kursiCitilink[x] = -1;
                            cekKursi = true;
                            System.out.print(" | Nomor Kursi                   : "+ (x+1));
                        }
                    }
                    if(!cekKursi) {
                        System.out.println(" | Kursi telah dipesan");
                        System.out.print(" | Masukkan Nomor Kursi Kembali : ");
                    }
                    if(cekKursi==true){
                        break;    
                    }
                }
        }
    }
    static void inputS(){
           for(int z=0;z<1000;z++){
            int p = sc3.nextInt();
                if(p<1 || p>kursiSriwijaya.length){
                    System.out.println(" | Kursi Tidak Tersedia");
                    System.out.print(" | Masukkan Nomor Kursi Kembali  : ");
                }else if(p>=1 || p<=kursiSriwijaya.length){
                    boolean cekKursi = false;
                    for(int x=0;x<kursiSriwijaya.length;x++){
                        if(kursiSriwijaya[x]==p){
                            kursiSriwijaya[x] = -1;
                            cekKursi = true;
                            System.out.print(" | Nomor Kursi                   : "+ (x+1));
                        }
                    }
                    if(!cekKursi) {
                        System.out.println(" | Kursi telah dipesan");
                        System.out.print(" | Masukkan Nomor Kursi Kembali : ");
                    }
                    if(cekKursi==true){
                        break;    
                    }
                }
        }
    }
    static void inputA(){
           for(int z=0;z<1000;z++){
            int p = sc3.nextInt();
                if(p<1 || p>kursiAirAsia.length){
                    System.out.println(" | Kursi Tidak Tersedia");
                    System.out.print(" | Masukkan Nomor Kursi Kembali  : ");
                }else if(p>=1 || p<=kursiAirAsia.length){
                    boolean cekKursi = false;
                    for(int x=0;x<kursiAirAsia.length;x++){
                        if(kursiAirAsia[x]==p){
                            kursiAirAsia[x] = -1;
                            cekKursi = true;
                            System.out.print(" | Nomor Kursi                   : "+ (x+1));
                        }
                    }
                    if(!cekKursi) {
                        System.out.println(" | Kursi telah dipesan");
                        System.out.print(" | Masukkan Nomor Kursi Kembali : ");
                    }
                    if(cekKursi==true){
                        break;    
                    }
                }
        }
    }

}