public class TestExempleExeption2 {
    public static void main(String[] args) {
        ExempleException2 A = new ExempleException2(10,0);
        A.MethodeDivision();
        int r = A.MethodeDivision();
        System.out.println("Suite instructions du programme Main:  " +r  );
    }
}
