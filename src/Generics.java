public class Generics<T> {
    T ob;
    Generics(T o){
        ob = o;
    }
    T getob(){
        return ob;
    }
    void showType() {
        System.out.println("Type of T is "+ ob.getClass().getName());
    }


}




