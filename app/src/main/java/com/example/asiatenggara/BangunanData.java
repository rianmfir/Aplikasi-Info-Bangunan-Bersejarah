package com.example.asiatenggara;

import com.example.asiatenggara.Model.Bangunan;

import java.util.ArrayList;


public class BangunanData {
    public static String[][] data = new String[][]{
            {"Gedung Sate", "Dibangun 27 Juli 1920 – September 1924", String.valueOf(R.drawable.gs), "Gedung Sate memiliki ciri khas berupa ornamen tusuk sate pada menara sentralnya. Sejarah berdirinya Gedung Sate atau sejarah Gedung Sate menunjukkan bahwa gedung ini mulai dibangun tahun 1920 dan hingga saat ini masih berdiri kokoh. Gedung Sate berfungsi sebagai gedung pusat Pemerintahan Jawa Barat. Gedung Sate pada masa Pemerintahan Hindia Belanda disebut sebagai Gouvernements Bedrijven (GB). Peletakkan batu pertama dilakukan oleh Johanna Catherina Cops yang merupakan putri sulung Walikota Bandung. Gedung Sate awalnya diperuntukkan bagi Departemen Lalu Lintas dan Pekerjaan Umum. Bahkan sempat menjadi pusat Pemerintahan Hindia Belanda setelah Batavia dianggap sudah tidak memenuhi syarat sebagai pusat pemerintahan karena perkembangannya, sehingga digunakan oleh Jawatan Pekerjaan Umum."},
            {"Monumen Bandung Lautan Api", "Dibangun 1981", String.valueOf(R.drawable.mbla), "Monumen Bandung Lautan Api dibangun untuk mengenang Peristiwa Bandung Lautan Api yang terjadi pada tanggal 23 Maret 1946. Peristiwa ini berawal dari ultimatum tentara sekutu agar Tentara Republik Indonesia (TRI sekarang TNI) meninggalkan kota Bandung. Selain itu, mereka juga menginginkan agar semua warga Bandung di luar TNI dan BKR menyerahkan senjata. Warga Bandung menganggap hal ini sebagai tindakan menyerah tanpa syarat.\n" + "A.H. Nasution, Komandan Divisi III Siliwangi, mengobarkan semangat perjuangan dengan membumihanguskan Bandung Selatan. Seluruh warga Bandung Selatan pun ikut membakar wilayah mereka dan berbondong-bondong meninggalkan Bandung. Proses pembakaran ini disertai dengan pertempuran yang cukup dahsyat, terutama di daerah Dayeuhkolot. Pada peristiwa ini, dua pejuang tewas saat meledakkan gudang amunisi, yaitu Moh. Toha dan Moh. Ramdan. Nama keduanya diabadikan sebagai nama jalan disekitaran Tegal Lega, Bandung."},
            {"Gedung Merdeka", "Dibangun 1985", String.valueOf(R.drawable.gm),"Gedung Merdeka berada di Jalan Asia Afrika No. 65, Kota Bandung. Gedung ini dulunya adalah sebuah toko yang dimiliki warga keturunan Tionghoa. Toko tersebut dijadikan tempat berkumpul orang-orang Belanda di Bandung yang menjadi anggota Societeit Concordia pada tahun 1879. Toko ini pun dibeli dan diperluas bangunannya pada tahun 1895. Bangunan ini direnovasi secara besar-besaran pada tahun 1921 oleh arsitek Van Gallen Las dan C.P. Wolff Schoemaker dengan menggunakan gaya art deco."},
            {"Masjid Raya Bandung", "Dibangun 1810 ", String.valueOf(R.drawable.mrb),"Masjid Raya Bandung berstatus sebagai masjid Provinsi bagi Jawa Barat. Masjid Raya Bandung dibangun pada tahun 1810 dan telah mengalami 8 kali perombakan pada abad ke-19, 5 kali pada abad ke-20, hingga akhirnya direnovasi pada tahun 2001. Masjid ini diresmikan pada 4 Juni 2003 oleh Gubernur Jawa Barat, yaitu H.R. Nuriana. Proses pembangunan dan penataan ulang kawasan alun-alun dan Masjid Raya Bandung dinyatakan selesai pada tanggal 13 Januari 2004. Hal ini bersamaan dengan pergantian nama dari Masjid Agung Bandung menjadi Masjid Raya Bandung Provinsi Jawa Barat."},
            {"Gedung Pakuan", "Dibangun 1864-1867", String.valueOf(R.drawable.gp),"Gedung Pakuan dibangun berdasarkan perintah Gubernur Jenderal Ch.F. Pahud. Hal ini disebabkan karena pemindahan ibukota Karesidenan Priangan dari Cianjur ke Bandung. Pemindahan tersebut baru dapat terlaksana oleh Residen Van der Moore pada tahun 1864.  Gedung Pakuan dirancang oleh Insinyur Kepala dari Departement van Burgerlijke Openbare Werken (B.O.W) yang menjadi staf dari Residen Van der Moore. Gedung ini sejak zaman Hindia Belanda telah menjadi tempat persinggahan orang penting, tamu resmi, dan tokoh dunia. Pada masa Pemerintahan Hindia Belanda, gedung ini adalah rumah kediaman resmi Residen Priangan. Saat ini, Gedung Pakuan dijadikan rumah dinas sebagai tempat kediaman resmi Gubernur Kepala Daerah Provinsi Jawa Barat."}
    };


    public static ArrayList<Bangunan> getListData() {
        Bangunan bangunan = null;
        ArrayList<Bangunan> list = new ArrayList<>();
        for (String[] aData : data) {
            bangunan = new Bangunan();
            bangunan.setName(aData[0]);
            bangunan.setRemarks(aData[1]);
            bangunan.setPhoto(Integer.parseInt(aData[2]));
            bangunan.setKet(aData[3]);

            list.add(bangunan);
        }

        return list;
    }
}
