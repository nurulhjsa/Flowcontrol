public class Percobaan6
{
    public static void main(String[] args)
    {
//DO WHILE
        Integer i = 0; 
        do { //dicetak dulu outputnya dari mulai i=0
            System.out.println("Sekarang ada di index ke " + i++);
        } while (i < 10); //setelah i<10 maka output stop
        System.out.println("   ");
        System.out.println("-------------------------------------------");
        System.out.println("   ");

//WHILE
        Integer p = 0;
        while (p < 10){ //dieksekusi dulu p dimulai dari 0 sampai p<10, baru cetak output
            System.out.println("Sekarang ada di index ke " + (p++));
        }     
        System.out.println("   ");
        System.out.println("-------------------------------------------");
        System.out.println("   ");   
    }
}