public class Percobaan3 
{
    public static void main(String[] args)
    {
//Switch 1
        Integer ip = 4; //diberikan nilai ip 4
        switch(ip){ //mencari hasil dari nilai ip
            case 4: System.out.println("A"); break; //pilihan pertama adalah 4 maka output yang keluar adalah A. tidak dieksekusi lagi
            case 3: System.out.println("B"); break;
            case 2: System.out.println("C"); break;
            case 1: System.out.println("D"); break;
            default: System.out.println("E");
        }
    System.out.println("   ");
    System.out.println("-------------------------------------------");
    System.out.println("   ");

//Switch 2
        Integer up = 2; //diberikan nilai up 2
        switch(up){ //mencari hasil dari nilai up
            case 4: System.out.println("A"); //pilihan 4 tidak sama dengan variabel yang diinput, maka lanjut eksekusi
            case 3: System.out.println("B"); break; //pilihan 3 tidak sama dengan variabel yang diinputkan, lanjut eksekusi
            case 2: System.out.println("C"); //pilihan 2 sama dengan variabel ip=2 maka cetak "C", karna tidak ada break lanjut eksekusi
            case 1: System.out.println("D"); break; //pilihan 1 ikut dicetak karna ada tanda break maka berenti eksekusi
            default: System.out.println("E");
        }
    System.out.println("   ");
    System.out.println("-------------------------------------------");
    System.out.println("   ");
    }
}
