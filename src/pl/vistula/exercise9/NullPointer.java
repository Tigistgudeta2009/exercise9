package pl.vistula.exercise9;



public class NullPointer {
    public static String Error() {
        String a = null;
        System.out.println("ENTER A NUMBER");

        return a;
    }
}

 class MainPointer {
    public static void main(String[] args) {


        try {
            NullPointer.Error();

        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println(e.getMessage());


        }
    }
}

