public class GenDemo {
    public static void main(String args[]) {
        Generics<Integer> iOb;
        iOb = new Generics<Integer>(88);
        iOb.showType();
        int v = iOb.getob();
        System.out.println("value: " + v);
        System.out.println();
        Generics<String> strOb = new Generics<String> ("Generics");
        strOb.showType();
        String str = strOb.getob();
        System.out.println("value: " + str);
    }
}