public class Main {
    public static void main(String[] args) {
        System.out.println(OverLoading.sayi(1, 2));             // Bu degerler icin 1.Metot calisir.
        System.out.println(OverLoading.sayi(1, 2, 9));       // Bu degerler icin 2.Metot calisir.
        System.out.println(OverLoading.sayi(1, 2, 9.0));     // Bu degerler icin 3.Metot calisir.
        System.out.println(OverLoading.sayi(1, 2.0, 9));     // Bu degerler icin 4.Metot calisir.
    }

    /*
       Bu kod satirlarinda OverLoading (asiri yukleme) gorulmektedir , main altında normal sartlarda ayni isimli metotlar kullanilamaz ama yukarida da goruldugu uzere bu
       orneklerde ayni isimde metotlar kullanilmistir. Bu kullanimin sorun olusturmama nedeni metotları dondururken kullandigimiz degerler kendi siralarindaki metodlara uygundur.
       Metotlari tek tek inceleyecek olursak :
       1.Metot : Iki tane integer deger alan baska metot yoktur bu nedenle - int a, int b - degerleri yazildiginda bu metot calısır .
       2.Metot : Uç tane integer deger alan baska metot yoktur bu nedenle - int a, int b, int c - degerleri yazildiginda bu metot calısır .
       3.Metot : Sirali olarak iki tane integer bir tane double deger alan baska metod yoktur bu nedenle - int a, int b, double c - degerleri yazildiginda bu metot calisir.
       4.Metot : Sirali olarak integer double integer deger alan baska metot yoktur bu nedenle - int a, double b, int c - degerleri yazildiginda bu metot calisir.
     */
}

