public class OverLoading {

    // Burada sayilar sirasiyla - int , int - olarak tanimlanmistir bu nedenle a=1 , b=2 olmustur.

    public static int sayi(int a, int b) {
        System.out.print("1. Metodun sonucu : ");
        return a + b;
    }

    // Burada sayilar sirasiyla - int , int , int - olarak tanimlanmistir bu nedenle a=1 , b=2 , c=5 olmustur.

    public static int sayi(int a, int b, int c) {
        System.out.print("2. Metodun sonucu : ");
        return a + b + c;
    }

    // Burada sayilar sirasiyla - int , int , double - olarak tanimlanmistir bu nedenle a=1 , b=2 , c=9.0 olmustur.

    public static double sayi(int a, int b, double c) {
        System.out.print("3. Metodun sonucu : ");
        return a + b + c;
    }

    // Burada sayilar sirasiyla - int , double , int - olarak tanimlanmistir bu nedenle a=1 , b=2.0 , c=9 olmustur.

    public static double sayi(int a, double b, int c) {
        System.out.print("4. Metodun sonucu : ");
        return a + b + c;
    }
}