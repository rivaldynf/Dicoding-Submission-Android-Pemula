package com.example.aplikasitempatwisata;

import java.util.ArrayList;

public class WisataData {

    // array to store data that will be displayed on RecyclerView
    public static String[][] data = new String[][] {
            // copy from my gits, link in description
            // this data from wikipedia
            {"Monas",
                    "https://mmc.tirto.id/image/otf/500x0/2018/07/28/ilustrasi-monas-2_ratio-16x9.jpg",
                    "Monumen Nasional atau yang populer disingkat dengan Monas atau Tugu Monas adalah monumen peringatan setinggi 132 meter yang didirikan untuk mengenang perlawanan dan perjuangan rakyat Indonesia untuk merebut kemerdekaan dari pemerintahan kolonial Hindia Belanda."},

            {"Museum Macan",
                    "https://www.hargatiket.net/wp-content/uploads/2018/07/Harga-Tiket-Masuk-Museum-Macan.jpg",
                    "Museum MACAN adalah museum seni di Kebon Jeruk di Jakarta, Indonesia. Museum ini adalah yang pertama di Indonesia yang memiliki koleksi seni Indonesia dan internasional modern dan kontemporer."},

            {"Galeri Nasional",
                    "https://i0.wp.com/ngetripkemana.com/wp-content/uploads/2019/02/Galeri-Nasional-Official-Acount4.jpg",
                    "Galeri Nasional Indonesia adalah sebuah lembaga budaya negara atau sebagai museum seni rupa modern dan kontemporer. Di sini terdapat gedung yang berfungsi antara lain sebagai tempat pameran, dan perhelatan seni rupa Indonesia dan mancanegara"},

            {"Museum Fatahillah",
                    "https://cdn1-production-images-kly.akamaized.net/rIw38qUmmo1Fm1iPp1ZVGkOfvos=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1327135/original/060320200_1472038145-Bersih-Kota-Tua4.jpg",
                    "Museum Fatahillah memiliki nama resmi Museum Sejarah Jakarta adalah sebuah museum yang terletak di Jalan Taman Fatahillah No. 1, Jakarta Barat dengan luas lebih dari 1.300 meter persegi. Bangunan ini dahulu merupakan balai kota Batavia yang dibangun pada tahun 1707-1712 atas perintah Gubernur-Jendral Joan van Hoorn"},

            {"Museum Bank Mandiri",
                    "https://i0.wp.com/dolanyok.com/wp-content/uploads//Museum-Bank-Mandiri-Oke-dah.jpg",
                    "Museum Bank Mandiri terletak di Jl. Lapangan Stasiun No. 1, Jakarta Barat dan merupakan salah satu bagian dari cagar budaya Kota Tua di Jakarta . Berdiri tanggal 2 Oktober 1998. Museum yang menempati area seluas 10.039 m2 ini pada awalnya adalah gedung Nederlandsche Handel-Maatschappij (NHM) atau Factorji Batavia yang merupakan perusahaan dagang milik Belanda yang kemudian berkembang menjadi perusahaan di bidang perbankan."},

            {"Museum Bank Indonesia",
                    "https://allesgroen.files.wordpress.com/2017/09/wajib-dikunjungi-saat-ke-jakarta.jpg",
                    "Museum Bank Indonesia adalah sebuah museum di Jakarta, Indonesia yang terletak di Jl. Pintu Besar Utara No.3, Jakarta Barat (depan stasiun Beos Kota), dengan menempati area bekas gedung Bank Indonesia Kota yang merupakan cagar budaya peninggalan De Javasche Bank yang beraliran neo-klasikal, dipadu dengan pengaruh lokal, dan dibangun pertama kali pada tahun 1828."},

            {"Museum Seni Rupa dan Keramik",
                    "https://dickie70.files.wordpress.com/2017/09/museum-seni-rupa-dan-keramik-e1506061450649.jpg",
                    "Museum Seni Rupa dan Keramik terletak di Jalan Pos Kota No 2, Kotamadya Jakarta Barat, Provinsi DKI Jakarta, Indonesia. Museum yang tepatnya berada di seberang Museum Sejarah Jakarta itu memajang keramik lokal dari berbagai daerah di Tanah Air, dari era Kerajaan Majapahit abad ke-14, dan dari berbagai negara di dunia"},

            {"Dunia Fantasi",
                    "https://img-k.okeinfo.net/content/2019/06/02/338/2063106/mau-ke-dufan-saat-libur-lebaran-siapkan-rp325-ribu-untuk-tiket-masuk-00qyHAly4l.JPG",
                    "Dufan yang diresmikan pada 29 Agustus 1985 adalah tempat hiburan yang terletak di kompleks Taman Impian Jaya Ancol, Jakarta Utara, Indonesia. Dunia Fantasi mempunyai maskot berupa kera bekantan yang diberi nama Dufan."},

            {"Museum Moja",
                    "https://statik.tempo.co/data/2019/01/04/id_809091/809091_720.jpg",
                    "MoJa merupakan singkatan dari Museum of Jakarta, Moja Museum Jakarta atau Museum Of Jakarta menawarkan wisata selfie berbagai ruang foto tematik yang sangat indah ."},

            {"Ragunan",
                    "https://3.bp.blogspot.com/-DItD2hhYwto/WP4isbdsE6I/AAAAAAAAXx4/h6cm2Y1EMjsDvbDXmfNkSZ7W9928GIxWgCLcB/s1600/kebun1.jpg",
                    "Kebun Binatang Ragunan adalah kebun binatang pertama di Indonesia. Kebun binatang ini didirikan pada tahun 1864 dengan nama Planten En Dierentuin yang berarti Tanaman dan Kebun Binatang."}


    };

    public static ArrayList<Wisata> getListData() {
        Wisata wisata;
        ArrayList<Wisata> list = new ArrayList<>();

        for (String[] mData : data) {
            wisata = new Wisata();
            wisata.setName(mData[0]);
            wisata.setPhoto(mData[1]);
            wisata.setDescription(mData[2]);

            list.add(wisata);
        }

        return list;
    }

}

