package com.example.recreationcompose.model

import com.example.recreationcompose.R

object FakeRecreationPlaceDataSource {
    private val names = arrayOf(
        "Candi Borobudur",
        "Danau Kelimutu",
        "Danau Toba",
        "Gunung Bromo",
        "Kawah Ijen",
        "Nusa Penida",
        "Pulau Komodo",
        "Raja Ampat",
        "Taman Laut Bunaken",
        "Wakatobi"
    )

    private val details = arrayOf(
        "Borobudur adalah sebuah candi Buddha yang terletak di Borobudur, Magelang, Jawa Tengah, Indonesia. Candi ini terletak kurang lebih 100 km di sebelah barat daya Semarang, 86 km di sebelah barat Surakarta, dan 40 km di sebelah barat laut Yogyakarta. Candi berbentuk stupa ini didirikan oleh para penganut agama Buddha Mahayana sekitar tahun 800-an Masehi pada masa pemerintahan wangsa Syailendra. Borobudur adalah candi atau kuil Buddha terbesar di dunia, sekaligus salah satu monumen Buddha terbesar di dunia. Borobudur kini masih digunakan sebagai tempat ziarah keagamaan; tiap tahun umat Buddha yang datang dari seluruh Indonesia dan mancanegara berkumpul di Borobudur untuk memperingati Trisuci Waisak. Dalam dunia pariwisata, Borobudur adalah objek wisata tunggal di Indonesia yang paling banyak dikunjungi wisatawan.",
        "Danau Kelimutu ini dikenal dengan nama Danau Tiga Warna karena memiliki tiga warna yang berbeda, yaitu merah, biru, dan putih. Walaupun begitu, warna-warna tersebut selalu berubah-ubah seiring dengan perjalanan waktu. Kelimutu merupakan gabungan kata dari \"keli\" yang berarti gunung dan kata \"mutu\" yang berarti mendidih. Menurut kepercayaan penduduk setempat, warna-warna pada danau Kelimutu memiliki arti masing-masing dan memiliki kekuatan alam yang sangat dahsyat. Danau atau Tiwu Kelimutu di bagi atas tiga bagian yang sesuai dengan warna - warna yang ada di dalam danau. Danau berwarna biru atau \"Tiwu Nuwa Muri Koo Fai\" merupakan tempat berkumpulnya jiwa-jiwa muda-mudi yang telah meninggal. Danau yang berwarna merah atau \"Tiwu Ata Polo\" merupakan tempat berkumpulnya jiwa-jiwa orang yang telah meninggal dan selama ia hidup selalu melakukan kejahatan/tenung. Sedangkan danau berwarna putih atau \"Tiwu Ata Mbupu\" merupakan tempat berkumpulnya jiwa-jiwa orang tua yang telah meninggal.",
        "Danau Toba adalah danau alami berukuran besar di Indonesia yang berada di kaldera Gunung Supervulkan. Danau ini memiliki panjang 100 kilometer (62 mil), lebar 30 kilometer (19 mi), dan kedalaman 505 meter (1657 ft). Danau ini terletak di tengah pulau Sumatra bagian utara dengan ketinggian permukaan sekitar 900 meter (2953 ft). Danau Toba adalah lokasi letusan gunung berapi super masif berkekuatan VEI 8 sekitar 69.000 sampai 77.000 tahun yang lalu yang memicu perubahan iklim global. Metode penanggalan terkini menetapkan bahwa 74.000 tahun yang lalu lebih akurat. Letusan ini merupakan letusan eksplosif terbesar di Bumi dalam kurun 25 juta tahun terakhir. Menurut teori bencana Toba, letusan ini berdampak besar bagi populasi manusia di seluruh dunia; dampak letusan menewaskan sebagian besar manusia yang hidup waktu itu dan diyakini menyebabkan penyusutan populasi di Afrika timur tengah dan India sehingga memengaruhi genetika populasi manusia di seluruh dunia sampai sekarang.",
        "Gunung Bromo (dari bahasa Sanskerta: Brahma, salah seorang Dewa Utama dalam agama Hindu) atau dalam bahasa Tengger dieja \"Brama\", adalah sebuah gunung berapi aktif di Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.329 meter di atas permukaan laut dan berada dalam empat wilayah kabupaten, yakni Kabupaten Probolinggo, Kabupaten Pasuruan, Kabupaten Lumajang, dan Kabupaten Malang. Gunung Bromo terkenal sebagai objek wisata utama di Jawa Timur. Sebagai sebuah objek wisata, Bromo menjadi menarik karena statusnya sebagai gunung berapi yang masih aktif. Gunung Bromo termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru. Bentuk tubuh Gunung Bromo bertautan antara lembah dan ngarai dengan kaldera atau lautan pasir seluas sekitar 10 kilometer persegi. Ia mempunyai sebuah kawah dengan garis tengah ± 800 meter (utara-selatan) dan ± 600 meter (timur-barat). Sedangkan daerah bahayanya berupa lingkaran dengan jari-jari 4 km dari pusat kawah Bromo.",
        "Kawah Ijen adalah sebuah danau kawah yang bersifat asam yang berada di puncak Gunung Ijen dengan kedalaman danau 200 meter dan luas kawah mencapai 5.466 Hektar. Danau kawah Ijen dikenal merupakan danau air asam kuat terbesar di dunia. Kawah Ijen berada dalam wilayah Cagar Alam Taman Wisata Ijen Kabupaten Bondowoso dan Kabupaten Banyuwangi, Jawa Timur. Fenomena eternal blue fire atau api biru abadi berada di dalam kawah Ijen, dan pemandangan alami ini hanya terjadi di dua tempat di dunia yaitu Etiopia (gunung Dallol) dan Ijen. Blue fire hanya dapat dilihat oleh mata manusia saat tidak ada cahaya, karenanya waktu ideal untuk melihatnya adalah jam 2 hingga jam 4 dinihari, karena pendakian Gunung Ijen baru mulai dibuka jam 2 dinihari. Dari Kawah Ijen, kita dapat melihat pemandangan gunung lain yang ada di kompleks Pegunungan Ijen, di antaranya adalah puncak Gunung Marapi yang berada di timur Kawah Ijen, Gunung Raung, Gunung Suket, dan Gunung Rante.",
        "Nusa Penida adalah sebuah pulau (=nusa) bagian dari negara Republik Indonesia yang terletak di sebelah tenggara Bali yang dipisahkan oleh Selat Badung. Di dekat pulau ini terdapat juga pulau-pulau kecil lainnya yaitu Nusa Ceningan dan Nusa Lembongan. Perairan pulau Nusa Penida terkenal dengan kawasan selamnya di antaranya terdapat di Crystal Bay, Manta Point, Batu Meling, Batu Lumbung, Batu Abah, Toyapakeh dan Malibu Point. Sekurangnya yang diketahui ada 6 dermaga/pelabuhan berbeda-beda untuk setiap perusahaan kapal cepat dari Sanur menuju Nusa Penida berlabuh. Pelabuhan di Nusa Penida tersebut di antaranya adalah: Pelabuhan Toya Pakeh, Pelabuhan Buyuk, Pelabuhan Br. Nyuh, Pelabuhan Mentigi, Pelabuhan Sampalan (Ferry), Pelabuhan Lembongan.",
        "Pulau Komodo adalah sebuah pulau yang terletak di Kepulauan Nusa Tenggara, berada di sebelah timur Pulau Sumbawa, yang dipisahkan oleh Selat Sape. Pulau Komodo dikenal sebagai habitat asli hewan komodo. Pulau ini termasuk salah satu kawasan Taman Nasional Komodo yang dikelola oleh Pemerintah Pusat. Secara administratif, pulau ini termasuk wilayah Kabupaten Manggarai Barat, Kecamatan Komodo, Provinsi Nusa Tenggara Timur, Indonesia. Pulau Komodo merupakan ujung paling barat Provinsi Nusa Tenggara Timur, berbatasan dengan Provinsi Nusa Tenggara Barat. Di Pulau Komodo, hewan komodo hidup dan berkembang biak dengan baik. Hingga Agustus 2009, di pulau ini terdapat sekitar 1300 ekor komodo. Ditambah dengan pulau lain, seperti Pulau Rinca dan dan Gili Motang, jumlah mereka keseluruhan mencapai sekitar 2500 ekor. Ada pula sekitar 100 ekor komodo di Cagar Alam Wae Wuul di daratan Pulau Flores tapi tidak termasuk wilayah Taman Nasional Komodo. Pulau Komodo juga diterima sebagai Situs Warisan Dunia UNESCO, karena dalam wilayah Taman Nasional Komodo, bersama dengan Pulau Rinca, Pulau Padar dan Gili Motang",
        "Kepulauan Raja Ampat merupakan rangkaian empat gugusan pulau yang berdekatan dan berlokasi di barat bagian Kepala Burung (Vogelkoop) Pulau Papua. Secara administrasi, gugusan ini berada di bawah Kabupaten Raja Ampat, Provinsi Papua Barat. Kepulauan ini sekarang menjadi tujuan para penyelam yang tertarik akan keindahan pemandangan bawah lautnya. Empat gugusan pulau yang menjadi anggotanya dinamakan menurut empat pulau terbesarnya, yaitu Pulau Waigeo, Pulau Misool, Pulau Salawati, dan Pulau Batanta. Asal mula nama Raja Ampat menurut mitos masyarakat setempat berasal dari seorang wanita yang menemukan tujuh telur. Empat butir di antaranya menetas menjadi empat orang pangeran yang berpisah dan masing-masing menjadi raja yang berkuasa di Waigeo, Salawati, Misool Timur dan Misool Barat. Sementara itu, tiga butir telur lainnya menjadi hantu, seorang wanita, dan sebuah batu. Dalam perjalanan sejarah, wilayah Raja Ampat telah lama dihuni oleh masyarakat bangsawan dan menerapkan sistem adat Maluku. Dalam sistem ini, masyarakat sekumpulan manusia. Tiap desa dipimpin oleh seorang raja. Semenjak berdirinya lima kesultanan muslim di Maluku, Raja Ampat menjadi bagian klaim dari Kesultanan Tidore. Setelah Kesultanan Tidore takluk dari Belanda, Kepulauan Raja Ampat menjadi bagian klaim Hindia Belanda",
        "Taman Nasional Bunaken adalah taman laut yang terletak di Sulawesi Utara, Indonesia. Taman ini terletak di Segitiga Terumbu Karang yang menjadi habitat bagi 390 spesies terumbu karang dan juga berbagai spesies ikan, moluska, reptil, dan mamalia laut. Taman Nasional Bunaken merupakan perwakilan ekosistem laut Indonesia, meliputi padang rumput laut, terumbu karang, dan ekosistem pantai. Taman nasional ini didirikan pada tahun 1991 dan meliputi wilayah seluas 890.65 km². 97% dari taman nasional ini merupakan habitat laut, sementara 3% sisanya merupakan daratan, meliputi lima pulau: Bunaken, Manado Tua, Mantehage, Naen, dan Siladen. Taman Nasional Bunaken memiliki ekosistem terumbu karang yang sangat kaya. Terdapat sekitar 390 spesies terumbu karang di wilayah ini. Spesies alga yang dapat ditemui di Taman Nasional Bunaken adalah Caulerpa, Halimeda, dan Padina, sementara spesies rumput laut yang banyak ditemui adalah Thalassia hemprichii, Enhallus acoroides, dan Thalassaodendron ciliatum. Taman Nasional Bunaken juga memiliki berbagai spesies ikan, mamalia laut, reptil, burung, moluska dan mangrove. Sekitar 90 spesies ikan tinggal di perairan wilayah ini.",
        "Wakatobi merupakan nama kawasan taman nasional yang ditetapkan pada tahun 1996, dengan luas keseluruhan 1,39 juta hektare, menyangkut keanekaragaman hayati laut, skala dan kondisi karang yang menempati salah satu posisi prioritas tertinggi dari konservasi laut di Indonesia. Taman Nasional Wakatobi merupakan salah satu dari 50 taman nasional di Indonesia, yang terletak di kabupaten Wakatobi, Sulawesi Tenggara. Taman nasional ini ditetapkan pada tahun 1996, dengan total area 1,39 juta ha, menyangkut keanekaragaman hayati laut, skala dan kondisi karang; yang menempati salah satu posisi prioritas tertinggi dari konservasi laut di Indonesia. Kedalaman air di taman nasional ini bervariasi, bagian terdalam mencapai 1.044 meter di bawah permukaan air laut. Taman Nasional Wakatobi, Menyajikan Berupa: Terumbu karang, Ikan, Satwa lain, Keistimewaan, dan Pulau Hoga."
    )

    private val images = arrayOf(
        R.drawable.candi_borobudur,
        R.drawable.danau_kelimutu,
        R.drawable.danau_toba,
        R.drawable.gunung_bromo,
        R.drawable.kawah_ijen,
        R.drawable.nusa_penida,
        R.drawable.pulau_komodo,
        R.drawable.raja_ampat,
        R.drawable.taman_laut_bunaken,
        R.drawable.wakatobi
    )

    val dummyRecreationPlaces: ArrayList<RecreationPlace>
        get(){
            val list = arrayListOf<RecreationPlace>()
            for(pos in names.indices){
                list.add(
                    RecreationPlace(
                        id = pos + 1L,
                        name = names[pos],
                        detail = details[pos],
                        image = images[pos]
                    )
                )
            }
            return list
        }
}