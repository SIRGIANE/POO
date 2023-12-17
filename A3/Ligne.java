import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Ligne {
    private List<Point> sommets;

    public Ligne() {
        this.sommets = new ArrayList<>();
    }

    public void ajouterSommet(Point sommet) {
        sommets.add(sommet);
    }

    public void supprimerSommet(Point sommet) {
        sommets.remove(sommet);
    }
}
