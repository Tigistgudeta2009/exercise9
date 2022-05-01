package pl.vistula.exercise9;

public class ThrowError {
    public static void generateException(int why)
    {
        int a;
        int numbers[] =new int[2];
        System.out.println(" INPUT VALUE"+ why);
        try{
            switch (why){
                case 0:
                    a=10/why;
                    break;
                case 1:
                  numbers[4] = 4;
                  break;
                case 2:
                return;
            }
        }
        catch (ArithmeticException e){
            System.out.println("ERROR");
            return;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Doesn't exist");
        }
        finally {
            System.out.println("important code");
        }

    }
}


class Throw {
    public static void main(String[] args) {
        for (int i=0; i<4; i++){
            ThrowError.generateException(i);
            System.out.println();
        }
    }
}



