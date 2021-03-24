import javax.swing.JOptionPane;

public class JavaLibs5026201063 {

    public static void main(String[] args) {
        // write your code here
        String input = (String) JOptionPane.showInputDialog(null,
                "Silakan masukkan kode:",
                "Pemesanan Buku UPMB ITS 2021",
                1,
                null,
                null,
                "coba ketik apa saja :)");
        // PEMESANAN BUKU UPMB ITS 2021
        String Nama = (String) JOptionPane.showInputDialog(null, "sebutkan nama anda");

        int BUKUFISIK = 65000;
        int BUKUONLINE = 25000;
        int Total = BUKUFISIK + BUKUONLINE;

        String[] acceptableValues = {"TIDAK", "YA"};
        String input2 = (String) JOptionPane.showInputDialog(null,
                "Yth." + Nama + "Apakah anda ingin memesan BUKU?",
                "KONFIRMASI PEMESANAN",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
        String Pesanan = JOptionPane.showInputDialog(null, Nama + ", Ingin memesan bukufisik apa?");
        String Pesanan2 = JOptionPane.showInputDialog(null, Nama + ", Ingin memesan bukuonline apa?");
        JOptionPane.showMessageDialog(null, "Harga " + Pesanan + " = " + BUKUFISIK + " dan Harga " + Pesanan2 + " = " + BUKUONLINE + ".");
        JOptionPane.showMessageDialog(null, "Total harga " + " = " + Total);

        int TotalHarga = Integer.parseInt(JOptionPane.showInputDialog("Total yang harus dibayar = ", "90000"));

        // PERHITUNGAN SEDERHANA
        String Perhitungan;
        JOptionPane.showMessageDialog(null, "Sekarang kita akan lanjut ke materi selanjutnya");
        JOptionPane.showMessageDialog(null, "Anda akan melakukan perhitungan sederhana");
        JOptionPane.showMessageDialog(null, "Akan diberikan angka-angka sebagai berikut");

        double Jawaban1 = 90.75;
        double Jawaban2 = 9.25;
        double Jawaban3 = 192.25;
        double Jawaban4 = 7.75;
        double Jawaban5 = 100;
        double TotalSemua = Jawaban1 + Jawaban2 + Jawaban3 + Jawaban4;

        JOptionPane.showInputDialog(null, "Penjumlahan dari 90 dan 0.75 menghasilkan?");
        JOptionPane.showInputDialog(null, "Pengurangan dari 10 dan 0.75 menghasilkan?");
        JOptionPane.showInputDialog(null, "Pengurangan dari 200 dan 7.75 menghasilkan?");
        JOptionPane.showInputDialog(null, "Penjumlahan dari 5 dan 2.75 menghasilkan?");
        JOptionPane.showInputDialog(null, "10 kuadrat adalah?");
        JOptionPane.showMessageDialog(null, "Jumlahkan kelima hasil tersebut akan menghasilkan?");
        JOptionPane.showMessageDialog(null, "Hasil totalnya adalah " + TotalSemua + ".");
        JOptionPane.showInputDialog(null, "Mudah bukan? hehe");

        JOptionPane.showMessageDialog(null, Nama + " akan melakukan pembelian sebanyak " + Pesanan + " dan " + Pesanan2 + " dengan total harga sebesar " + Total + "\n" + "by the way, jumlah angka yang sudah kita hitung tadi adalah " + TotalSemua + ".");

        JOptionPane.showMessageDialog(null, "Ini adalah akhir dari program ini");
        JOptionPane.showMessageDialog(null, "Terima kasih sudah mengikuti");
    }
}