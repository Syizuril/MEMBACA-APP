package id.syizuril.app.mengenalburungnusantara;

import java.util.ArrayList;

public class BurungData {
    public static String[][] data = new String [][]{
            {"Murai Batu", "https://cdn0-a.production.liputan6.static6.com/medias/833080/big/061738400_1426856331-murai_batu.jpg","Copsychus Malabaricus","Animalia","Aves","Passerine","Muscicapidae","Copsyschus","C.Malabaricus","Murai batu (Copsychus malabaricus), juga dikenal sebagai Kucica hutan. Termasuk ke dalam famili Muscicapidae atau burung cacing. Tersebar di seluruh pulau Sumatra, Semenanjung Malaysia, dan sebagian pulau Jawa. Beberapa pakar menganggap ras dari Kalimantan Utara Murai alis putih (Copsychus malabaricus stricklandii) sebagai spesies tersendiri.\n Di habitat aslinya murai batu cenderung memilih hutan alam yang rapat atau hutan sekunder. Murai batu merupakan kelompok burung yang dikenal sebagai teritorial dan sangat kuat dalam mempertahankan wilayahnya (Thruses). Burung murai batu memiliki suara kicauan yang bagus sehingga mendapat penghargaan terbaik atas nyanyian nya yang sangat indah pada tahun 1947 (The Best Song Birds – Delacour, 1947). Burung murai batu merupakan kelompok burung yang di gemari di kalangan para pecinta kicauan karena memiliki suara atau spesifikasi kicauan yang sangat baik."},
            {"Kacer", "https://cdn1-a.production.liputan6.static6.com/medias/833081/big/061859100_1426856331-hasil-kacer.jpg","Copsychus Saularis","Animalia","Aves","Passerine","Muscicapidae","Copsyschus","C.Saularis","Kucica kampung (bahasa Latin: Copsychus saularis) adalah burung pengicau kecil yang sebelumnya dikelompokkan sebagai anggota keluarga Turdidae (murai), tetapi kini dianggap sebaagi anggota Muscicapidae. Burung ini berwarna hitam dan putih dengan ekor yang panjang. Ekornya terangkat ke atas jika mereka sedang mencari makanan di tanah atau kadang ketika sedang bertengger. Burung ini banyak ditemukan di daerah Asia Selatan dan Asia tenggara. Di Indonesia burung ini mulai langka karena penangkapan yang berlebihan untuk dipelihara.\nNama Lain dari Kucica Kampung adalah kacer, Burung ini suka menjelajah di berbagai lingkungan yang kecepatan terbangnya bisa mengungguli kerabatnya murai batu. bahkan dari burung berbulu hitam,berekor panjang seperti lidi. Burung kacer banyak mendiami dataran rendah sampai ketinggian 1000 meter di atas permukaan laut. Bahkan tidak jarang ada yang terlihat di perumahan penduduk."},
            {"Kenari", "https://cdn1-a.production.liputan6.static6.com/medias/833082/big/061939000_1426856331-burung_kenari.jpg","Serinus Canaria","Animalia","Aves","Passerine","Fringillidae","Serinus","S.Canaria","Burung kenari (Serinus Canaria) pertama ditemukan Oleh Pelaut Prancis Jean de Berthan Cout di Kepulauan Canary pada abad ke-15.\nNegara Belanda yang kini lebih dikenal sebagai negara pengekspor kenari Indonesia, semula mendatangkan kenari dari Inggris, Jerman dan Belgia kemudian kenari tersebut dikawinkan dengan kenari liar dan menghasilkan beberapa jenis lainnya."},
            {"Brinji Emas", "https://1.bp.blogspot.com/-ERaEHDRDy2k/WJAK-Ur-B5I/AAAAAAAASP4/dLCHGMPVGXQYzNrhmwrN1HBVSA4I59fMACLcB/s1600/Burung%2BBrinji%2BEmas%2BSeram.bmp","Alophoixus Affinis","Animalia","Aves","Passerine","Pycnonotidae","Alophoixus","A. Affinis","Brinji emas (Alophoixus affinis) adalah spesies burung kicau dari keluarga Pycnonotidae . Burung jenis ini menyebar terbatas (endemik) di pulau-pulau sekitar Sulawesi dan Maluku. Burung Brinji emas (Alophoixus (Hypsipetes) affinis) endemik karena hidup di wilayah kepulauan yang terisolir satu sama lain.\nBrinji emas memiliki tubuh yang agak besar dengan ukuran 21 – 26 cm. Tubuh bagian atas diselimuti bulu zaitun-kekuningan dan tubuh bagian bawah seluruhnya atau sebagian kuning. Iris mempunyai warna coklat-tua hingga kemerahan atau jingga.\nMudah ditemui disemua tipe habitat yang memiliki pohon rapat, termasuk hutan, semak, dan lahan budidaya (kecuali di areal perkebunan di pesisir pulau Seram) sampai ketinggian 1800 mdpl."},
            {"Cica-Daun Besar", "https://cdn0-a.production.liputan6.static6.com/medias/833084/big/062159500_1426856331-Burung-Cucak-Hijau-Cucak-Ijo.jpg","Chloropsis Sonnerati","Animalia","Aves","Passerine","Chloropseidae","Chloropsis","C. Sonnerati","Cica-daun besar adalah jenis burung pengicau dengan seluruh badan dominan dengan warna hijau. Burung ini memiliki nama ilmiah Chloropsis sonnerati dan termasuk ke dalam suku Chloropseidae; berkerabat dekat dengan burung cipoh (Aegithina spp.). Dalam bahasa Inggris burung ini dikenal sebagai Greater Green Leafbird.\nJenis-jenis cica-daun juga dikenal dengan sebutan umum Burung daun, dan diperdagangkan dengan nama Murai daun.Bertubuh sedang, dengan panjang tubuh total (diukur dari ujung paruh hingga ujung ekor) sekitar 22 cm.\nSeperti umumnya cica-daun, seluruh tubuhnya didominasi warna hijau terang (hijau daun), termasuk sayap dan ekor; sementara pipi dan tenggorokan burung jantan berwarna hitam berkilau. Perbedaan dengan cica-daun yang lain adalah adanya warna (noktah) biru pada bahu burung jantan. Burung betina dengan tenggorokan kuning dan lingkaran mata kuning. Kedua jenis kelamin memiliki sepasang setrip malar biru berkilau di sisi dagunya."}
    };

        public static ArrayList<Burung> getListData(){
            Burung burung = null;
            ArrayList<Burung> list = new ArrayList<>();
            for (String[] aData:data){
                burung = new Burung();
                burung.setName(aData[0]);
                burung.setPhoto(aData[1]);
                burung.setRemarks(aData[2]);
                burung.setKerajaan(aData[3]);
                burung.setKelas(aData[4]);
                burung.setOrdo(aData[5]);
                burung.setFamilia(aData[6]);
                burung.setGenus(aData[7]);
                burung.setSpesies(aData[8]);
                burung.setDeskripsi(aData[9]);

                list.add(burung);
            }

            return list;
    }
}
