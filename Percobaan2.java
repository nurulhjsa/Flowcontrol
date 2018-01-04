public class Percobaan2
{
    public static void main(String [] args)
    {
//IF 1 Kondisi
        String word = "Halo"; //variabel word yang dimasukkan adalah "Halo"
        if(word.equals("halo")){ //jika Halo ="halo" maka outpuny "data sama"
            System.out.println("data sama"); 
        } else { //karna data yang diinput Halo tidak ="halo" maka data berbeda,
            System.out.println("data beda!");
        }
    System.out.println("   ");
    System.out.println("-------------------------------------------");
    System.out.println("   ");

//IF 2 Kondisi1
        int bil1 = 10; //diberikan nilai 10 pada bil1
        int bil2 = -10; //diberikan nilai -10 pada bil2
        if(bil1 == bil2){ //jika nilai bil1 = bil2, apakah 10=-10
            System.out.println("10 == -10"); //jika benar outputnya ini, karna 10 tidak sama dengan -10 maka di cek pada pernyataan selanjutnya
        } else if(bil1 < bil2){ //jika nilai bil1 < bil2, apakah 10<-10
            System.out.println("10 < -10"); //jika benar cetak output, karna 10 tidak <-10 maka cek lagi pada pernyataan selanjutnya
        } else { //jika kedua variabel tidak memenuhi pernyataan di atas maka outputnya "lain-lain"
            System.out.println("lain-lain");
        }
    System.out.println("   ");
    System.out.println("-------------------------------------------");
    System.out.println("   ");

//IF 2 Kondisi2
        int bil = 10; //diberikan nilai pada bil sebesar 10
        if(bil == 10){ //jika nilai variabel yang diberikan = 10
            System.out.println("yang ini dieksekusi (==)"); //jika benar cetak output, namun kita eksekusi lagi pada pernyataan kedua
        } else if (bil % 2 == 0){ //jika nilai variabel yang diberikan habis dibagi 2 =0
            System.out.println("yang ini dieksekusi (%)"); //cetak output ini
        } else { //jika kedua pernyataan tidak ada yang sama maka langsung cetak output
            System.out.println("lain-lain");
        }
    System.out.println("   ");
    System.out.println("-------------------------------------------");
    System.out.println("   ");
    }
}