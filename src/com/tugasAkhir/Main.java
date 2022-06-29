package com.tugasAkhir;
//import library
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        //deklarasi variabel
        int totalHarga, hargaTerakhir;
        double totalDiskon;

        //pemanggilan library kurs rupiah
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        pendaftaranPasien fungsi = new pendaftaranPasien();
        LocalDateTime waktu = LocalDateTime.now();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);


        fungsi.dataPasien();
        fungsi.PendaftaranPasien();
        fungsi.KamarPasien();
        fungsi.PilihanDokter();
        fungsi.LamaMenginap();
        fungsi.loopingPembayaran();


        //MEMBUAT INVOICE
        totalHarga = fungsi.hargaPendaftaran + fungsi.hargaKamar + fungsi.biayaDokter;
        totalDiskon = (fungsi.hargaKamar * fungsi.diskon);
        hargaTerakhir = (int) (totalHarga - totalDiskon);
        System.out.println("\n\n\n| ========================================================= |");
        System.out.println("| --------------------------INVOICE------------------------ |");
        System.out.println("| --------------------SARI ASIH HOSPITAL------------------- |");
        System.out.println("| ==================="+waktu.format(DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss"))+"================== |");
        System.out.println("| ========================================================= |");
        System.out.println("|                                                           |");
        System.out.println("| Nama\t\t\t\t: " + fungsi.nama + "\t    |");
        System.out.println("| Jenis Kelamin\t\t\t: " + fungsi.jenisKelamin + "\t\t    |");
        System.out.println("| Umur\t\t\t\t: " + fungsi.umur + " tahun" + "\t\t    |");
        System.out.println("| Alamat\t\t\t: " + fungsi.alamat + "\t\t    |");
        System.out.println("| --------------------------------------------------------- |");
        System.out.println("| Status Pasien\t\t\t: " + fungsi.statusPendaftaran + "\t\t    |");
        System.out.println("| Nama Kamar\t\t\t: " + fungsi.namaKamar + "\t\t    |");
        System.out.println("| Nama Dokter\t\t\t: " + fungsi.namaDokter + "\t\t    |");
        System.out.println("| Lama Menginap\t\t\t: " + fungsi.hari + " hari" + "\t\t    |");
        System.out.println("| Biaya Pendaftaran\t\t: " + kursIndonesia.format(fungsi.hargaPendaftaran) + "\t    |");
        System.out.println("| Biaya Kamar\t\t\t: " + kursIndonesia.format(fungsi.hargaKamar) + "\t    |");
        System.out.println("| Biaya Pemeriksaan Dokter\t: " + kursIndonesia.format(fungsi.biayaDokter) + "\t    |");
        System.out.println("| --------------------------------------------------------- |");
        System.out.println("| Total Harga (sebelum diskon)\t: " + kursIndonesia.format(totalHarga) + "\t    |");
        System.out.println("| Total Diskon\t\t\t: " + kursIndonesia.format(totalDiskon) + "\t    |");
        System.out.println("| Total Harga (setelah diskon)\t: " + kursIndonesia.format(hargaTerakhir) + "\t    |");
        System.out.println("| --------------------------------------------------------- |");
        System.out.println("| Pembayaran\t\t\t: " + kursIndonesia.format(fungsi.pembayaran) + "\t    |");
        System.out.println("| Kembalian\t\t\t: " + kursIndonesia.format(fungsi.kembalian) + "\t    |");
        System.out.println("|                                                           |");
        System.out.println("| ====================SARI ASIH HOSPITAL=================== |");
    }
}

