public class Percobaan5
{
//For 1
    public static void main(String[] args)
    {
        for(int i = 0; i < 10; i++){ //perulangan mulai dari 0 dan kurang dari 10
            for(int j = 0; j < 5; j ++){ //kemudian nilai i di eksekusi oleh j=0, <5
                System.out.print("j["+ j + "], "); //pertama cetak nilai j[0]..j<5
            }
            System.out.println("i["+ i + "]"); //kemudian dieksekusi kembali dengan i <10
        }
        System.out.println("   ");
        System.out.println("-------------------------------------------");
        System.out.println("   ");

//For 2
        for(int i = 0; i < 10; i++){ //nilai i dimulai dari 0 dan kurang dari 10
            if( i == 5 ){ //dilakukan perulangan sampai i =5 maka cetak output
                System.out.println("Sekarang ada di posisi ke 5");
            }
        }
        System.out.println("   ");
        System.out.println("-------------------------------------------");
        System.out.println("   ");
 
 //For 3
        boolean isRepeat = true; //pernyataan benar
        if(isRepeat) {
            for(int i = 0; i < 10; i ++){ //dilakukan perulangan sebanyak <10 jika diberikan pernyataan true
                System.out.println("Sekarang ada di index ke "+ i);
            }
        }
        System.out.println("   ");
        System.out.println("-------------------------------------------");
        System.out.println("   ");

//For 4
        for(int i = 10 ; i > 0; i--){ //diberikan nilai i=10, nilai i>0
            System.out.println("Indexnya "+ i); //perulangan menurun dari 10 sampai i>0
        }
        System.out.println("   ");
        System.out.println("-------------------------------------------");
        System.out.println("   ");
    }
}