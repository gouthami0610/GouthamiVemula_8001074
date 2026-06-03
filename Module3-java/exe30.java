public class exe30 {
    static void checkType(Object obj) {
        switch(obj) {
            case Integer i -> System.out.println("Integer: " + i);
            case String s -> System.out.println("String: " + s);
            case Double d -> System.out.println("Double: " + d);
            case Boolean b -> System.out.println("Boolean: " + b);
            default -> System.out.println("Unknown type");
        }
    }

    public static void main(String[] args) {
        checkType(10);
        checkType("Hello");
        checkType(25.5);
        checkType(true);
    }
}
