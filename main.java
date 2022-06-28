import java.util.Scanner;
public class DiziOrt {
    public static void main(String[] args) {
        
        //Harmonik Ortalama formülü : n / (1/a + 1/b + 1/c + ...)
        double seri = 0, avarage;
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısını giriniz :");
        int step = input.nextInt();
        int[] dizi = new int[step];

        for(int i=0; i<dizi.length; i++){
            System.out.print("Dizinin " + (i+1) + ". elemanı :");
            dizi[i] = input.nextInt();
            seri += (double)1/dizi[i];
        }

        avarage = step/seri;
        System.out.println("Dizinin Harmonik Ortalaması : " + avarage);
        

    }    
}
