
class ExempleException2 {
    private int v1;
    private int v2;
    public ExempleException2(int a, int b) { v1=a;  v2=b; }

    public int MethodeDivision() {
        int num=0;
        try {
            System.out.println("Début Try");
            num = v1 / v2;
            System.out.println(num);
            System.out.println("Fin Try");
            return 2;
        }
        catch (ArithmeticException e) {
            System.out.println("Début Catch");
            System.out.println("Exception division par zéro");
            return -2;
        }
        finally {
            System.out.println("Exécution instructions de finally");
            System.out.println("Suite de la méthode après finally .....");
            //return 3;
        }

    }

}