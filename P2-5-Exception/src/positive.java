public class positive {
    private int Valeur;
    public positive(int n) throws Err {
        if(n<0 | n>20) throw new Err();
        this.Valeur = n;
    }
    public int getValeur() {
        return (Valeur);
    }
}
