public class Percobaan7
{
    public static void main(String[] args)
    {
//For-IF-BREAK
        for(int i = 0; i < 100; i++){ //perulangan nilai i dari 0 dan kurang dari 100
            if(i == 5) break; //jika nilai i sama dengan 5 maka perulangan berenti dan cetak output
            System.out.println("Saya berada di index ke " + i);
        }
        System.out.println("   ");
        System.out.println("-------------------------------------------");
        System.out.println("   ");

//FOR-IF-CONTINUE
        for(int x = 0 ; x < 3 ; x++){ //perulangan nilai x=0 dan kurang dari 3
            if(x == 2) continue; //jika nilai x sama dengan 2 maka dilewati dan perulangan dilanjutkan
            System.out.println("Saya berada di index ke " + x);
        }
        System.out.println("   ");
        System.out.println("-------------------------------------------");
        System.out.println("   ");
    }
}