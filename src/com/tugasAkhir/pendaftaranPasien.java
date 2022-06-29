package com.tugasAkhir;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class pendaftaranPasien extends Main{

    Scanner bayar = new Scanner(System.in);
    int totalHarga, hargaTerakhir, pembayaran;
    double totalDiskon, kurang, kembalian;
    boolean ket;

    //deklarasi data pasien
    Scanner data = new Scanner(System.in);
    String nama, alamat, jenisKelamin;
    int umur;

    //deklarasi jenis pasien
    Scanner daftar = new Scanner(System.in);
    String kodePasien;
    String statusPendaftaran;
    int hargaPendaftaran;

    //deklarasi kamar pasien
    Scanner kamar = new Scanner(System.in);
    int hargaKamar;
    String namaKamar, kodeKamar;

    //deklarasi pilihan dokter
    Scanner dokter = new Scanner(System.in);
    int biayaDokter;
    String namaDokter, kodeDokter;

    //deklarasi lama menginap
    Scanner menginap = new Scanner(System.in);
    String lamaMenginap;
    double diskon;
    String hari;

    void dataPasien(){

        System.out.println("\t\t Program Sari Asih Hospital ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\n-------------------------DATA PASIEN---------------------------");
        System.out.print("Nama\t\t\t: ");
        nama = data.nextLine();
        System.out.print("Jenis Kelamin\t\t: ");
        jenisKelamin = data.nextLine();
        System.out.print("Umur\t\t\t: ");
        umur = data.nextInt();
        System.out.print("Alamat\t\t\t: ");
        alamat = data.next();
    }

    void PendaftaranPasien() {
        do {
            System.out.println("\n--------------------------JENIS PASIEN---------------------------");
            System.out.println("    |  Kode Pasien  |   Status Pasien   |  Biaya Daftar Pasien  |");
            System.out.println("1.  |     PS001     |    Pasien Baru    |     Rp. 500.000,-     |");
            System.out.println("2.  |     PS002     |    Pasien Lama    |     Rp. 400.000,-     |");
            System.out.println("3.  |     PS003     |    Pasien BPJS    |     Rp. 300.000,-     |");
            System.out.println("4.  |     PS004     |    Pasien Akses   |     Rp. 200.000,-     |");

            System.out.print("Masukkan Angka Yang Diinginkan: ");
            kodePasien = daftar.nextLine();

            switch (kodePasien) {
                case "1":
                    ket = false;
                    statusPendaftaran = "Pasien Baru";
                    hargaPendaftaran = 500000;
                    break;
                case "2":
                    ket = false;
                    statusPendaftaran = "Pasien Lama";
                    hargaPendaftaran = 400000;
                    break;
                case "3":
                    ket = false;
                    statusPendaftaran = "Pasien BPJS";
                    hargaPendaftaran = 300000;
                    break;
                case "4":
                    ket = false;
                    statusPendaftaran = "Pasien Akses";
                    hargaPendaftaran = 200000;
                    break;
                default:
                    ket = true;
                    System.err.println("Pilihan anda tidak terdapat dalam tabel!\n");
            }
        }while (ket);
    }

    void KamarPasien() {
        do {
            System.out.println("\n--------------------------PILIH KAMAR----------------------------");
            System.out.println("    |  Kode Kamar  |     Nama Kamar     |  Biaya Daftar Pasien  |");
            System.out.println("1.  |     1111     |    Kamar Melati    |     Rp. 1.000.000,    |");
            System.out.println("2.  |     2222     |    Kamar Mawar     |     Rp. 2.000.000,-   |");
            System.out.println("3.  |     3333     |    Kamar Dahlia    |     Rp. 3.000.000,-   |");
            System.out.println("4.  |     4444     |    Kamar Anggrek   |     Rp. 4.000.000,-   |");
            System.out.println("5.  |     5555     |    Kamar Tulip     |     Rp. 5.000.000,-   |");

            System.out.print("Masukkan Angka Yang Diinginkan: ");
            kodeKamar = kamar.nextLine();

            switch (kodeKamar) {
                case "1":
                    ket = false;
                    namaKamar = "Kamar Melati";
                    hargaKamar = 1000000;
                    break;
                case "2":
                    ket = false;
                    namaKamar = "Kamar Mawar";
                    hargaKamar = 2000000;
                    break;
                case "3":
                    ket = false;
                    namaKamar = "Kamar Dahlia";
                    hargaKamar = 3000000;
                    break;
                case "4":
                    ket = false;
                    namaKamar = "Kamar Anggrek";
                    hargaKamar = 4000000;
                    break;
                case "5":
                    ket = false;
                    namaKamar = "Kamar Tulip";
                    hargaKamar = 5000000;
                    break;
                default:
                    ket = true;
                    System.err.println("Pilihan anda tidak terdapat dalam tabel!\n");
            }
        } while (ket);
    }

    void PilihanDokter() {
        do {
            System.out.println("\n---------------------------PILIH DOKTER----------------------------");
            System.out.println("    |  Kode Dokter  |     Nama Dokter     |  Biaya Daftar Pasien  |");
            System.out.println("1.  |     DK001     |      DR. Andi       |     Rp. 500.000,      |");
            System.out.println("2.  |     DK002     |      DR. Joko       |     Rp. 400.000,-     |");
            System.out.println("3.  |     DK003     |      DR. Karni      |     Rp. 300.000,-     |");
            System.out.println("4.  |     DK004     |      DR. Amin       |     Rp. 200.000,-     |");
            System.out.println("5.  |     DK005     |      DR. Udin       |     Rp. 100.000,-     |");

            System.out.print("Masukkan Angka Yang Diinginkan: ");
            kodeDokter = dokter.nextLine();

            switch (kodeDokter) {
                case "1":
                    ket = false;
                    namaDokter = "DR. Andi";
                    biayaDokter = 500000;
                    break;
                case "2":
                    ket = false;
                    namaDokter = "DR. Joko";
                    biayaDokter = 400000;
                    break;
                case "3":
                    ket = false;
                    namaDokter = "DR. Karni";
                    biayaDokter = 300000;
                    break;
                case "4":
                    ket = false;
                    namaDokter = "DR. Amin";
                    biayaDokter = 200000;
                    break;
                case "5":
                    ket = false;
                    namaDokter = "DR. Udin";
                    biayaDokter = 100000;
                    break;
                default:
                    ket = true;
                    System.err.println("Pilihan anda tidak terdapat dalam tabel!\n");
            }
        }while (ket);
    }

    void LamaMenginap() {
        do {
            System.out.println("\n-----------------ESTIMASI LAMA MENGINAP-----------------");
            System.out.println("    |  Lama Menginap  |             Diskon             |");
            System.out.println("1.  |     >10 Hari    |      50% Dari Biaya Kamar      |");
            System.out.println("2.  |     >8 Hari     |      40% Dari Biaya Kamar      |");
            System.out.println("3.  |     >6 Hari     |      30% Dari Biaya Kamar      |");
            System.out.println("4.  |     >4 Hari     |      20% Dari Biaya Kamar      |");
            System.out.println("5.  |     >+1 Hari    |      10% Dari Biaya Kamar      |");

            System.out.print("Masukkan Angka Yang Diinginkan: ");
            lamaMenginap = menginap.nextLine();

            switch (lamaMenginap) {
                case "1":
                    ket = false;
                    hari = ">10";
                    diskon = 0.50;
                    break;
                case "2":
                    ket = false;
                    hari = ">8";
                    diskon = 0.40;
                    break;
                case "3":
                    ket = false;
                    hari = ">6";
                    diskon = 0.30;
                    break;
                case "4":
                    ket = false;
                    hari = ">4";
                    diskon = 0.20;
                    break;
                case "5":
                    ket = false;
                    hari = ">1";
                    diskon = 0.10;
                    break;
                default:
                    ket = true;
                    System.err.println("Pilihan anda tidak terdapat dalam tabel\n");
            }
        }while (ket);
    }

    void loopingPembayaran(){
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        totalHarga = hargaPendaftaran + hargaKamar + biayaDokter;
        totalDiskon = (hargaKamar * diskon);
        hargaTerakhir = (int) (totalHarga - totalDiskon);
        do {
            System.out.println("\n--------------------------PEMBAYARAN-------------------------");
            System.out.println("| Total Harga (sebelum diskon)\t\t: " + kursIndonesia.format(totalHarga) + "\t\t|");
            System.out.println("| Harga Diskon\t\t\t\t: " + kursIndonesia.format(totalDiskon) + "\t\t|");
            System.out.println("| Total Harga (setelah diskon)\t\t: " + kursIndonesia.format(hargaTerakhir) + "\t\t|");

            System.out.println("Masukkan Pembayaran Anda: ");
            pembayaran = bayar.nextInt();

            if (pembayaran < hargaTerakhir){
                ket = true;
                kurang = hargaTerakhir - pembayaran;
                System.err.println("\n---------------------PERINGATAN!---------------------");
                System.out.println("Mohon Maaf Uang anda Kurang: " + kursIndonesia.format(kurang));
                System.out.println("-----------------------------------------------------");
            }else {
                ket = false;
                kembalian = pembayaran - hargaTerakhir;
            }
        }while (ket);
    }
}
