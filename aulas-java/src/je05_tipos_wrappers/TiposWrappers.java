package je05_tipos_wrappers;

public class TiposWrappers {
    public static void main(String[] args) {
//        double d = 100.0;
//        int i = (int) d;
        Double d = 100.0;
        Integer i = d.intValue();
        System.out.println(i); // 100
    }
}
