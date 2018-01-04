//IF Statement
public class Percobaan1
{
    public static void main(String[] args)
    {
        Integer bil1 = 10; //diberikan nilai bil1 sebesar 10
        if(bil1 == 10) //membandingkan jika bil1 sama dengan 10
        {
            System.out.println("Bilangan Sama");
        } //jika perbandingan yang diperoleh benar maka output yang di cetak "Bilangan Sama"
    System.out.println("   ");
    System.out.println("-------------------------------------------");
    System.out.println("   ");

//SWITCH Statement
        Integer value = 20; //diberikan nilai value sebesar 20
        switch(value) //memilih nilai value yang hasilnya 20
        {
            case 10 : //pilihan 1 nilai 10
                System.out.println("Nilai sama dengan 10"); //jika nilai value=10 maka outputnya ini
                break; //jika pilihan 1 benar maka pilihan kedua tidak dieksekusi
            case 20 : //pilihan 2 nilai 20
                System.out.println("Nilai sama dengan 20"); //jika nilai value sama dengan pilihan ke 2 maka outputnya ini
                break; //karna output sudah benar maka tidak ada eksekusi lagi
            default : System.out.println("Nilai tidak ada yang sama"); //Jika pada case 1 dan 2 salah maka output yang keluar adalah ini
        }
    System.out.println("   ");
    System.out.println("-------------------------------------------");
    System.out.println("   ");

//FOR Statement
        for(int i=1; i<11; i++) //perulangan nilai i=1 dan kurang dari 11, i++ artinya nilai i akan selalu bertambah dari =1 hingga <11
        {
            System.out.println("Saya berulang sebanyak " +i); //output yang keluar dari nilai i sebanyak 10 kali
        }
    System.out.println("   ");
    System.out.println("-------------------------------------------");
    System.out.println("   ");

//WHILE Statement
        Integer i=0; //diberikan nilai i=0
        while(i<10) //perulangan dilakukan kurang dari 10 kali
        {
            System.out.println("Saya berulang sebanyak " +i); //output yang keluar dari perulangan niai i
            i++; //awalnya output keluar 1x namun setelah itu dilakukan eksekusi lagi i+1 = 2 maka kembali lagi di cek pada while
                 //karna 2 <10 maka output i tercetak kembali, kemudian dieksekusi lagi nilai i sebelumnya =2 +1=3 dan seterusnya sampai <10. 
       }
    System.out.println("   ");
    System.out.println("-------------------------------------------");
    System.out.println("   ");

//DO-WHILE Statement
        Integer s = 0; //diberikan nilai s=0
        do {
            System.out.println("Saya berulang sebanyak " +s);
            s++; //perulangan output dicetak dari s=0 dan terus mencetak
        } while(s<10); //kemudian dieksekusi hingga s<10 baru berenti
    System.out.println("   ");
    System.out.println("-------------------------------------------");
    System.out.println("   ");
    }
}