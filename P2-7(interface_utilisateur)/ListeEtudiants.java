import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ListeEtudiants {
    private static ArrayList<String> etudiants = new ArrayList<>(); // Liste des étudiants
    private static ArrayList<Double> moyennes = new ArrayList<>(); // Liste des moyennes

    private static JTextField TNom; // Champ de texte pour le nom de l'étudiant
    private static JTextField TMoyenne; // Champ de texte pour la moyenne de l'étudiant
    private static int position = -1; // Position courante dans la liste des étudiants
    public static void main(String[] args) {
        etudiants.add("OUICAL");
        moyennes.add(15.5);
        etudiants.add("SALMA");
        moyennes.add(17.8);
        etudiants.add("ALI");
        moyennes.add(13.2);
        etudiants.add("ILYASSE");
        moyennes.add(13.2);
        // panneau affichage
        JPanel Affichage = new JPanel();
        JLabel LNom = new JLabel("Nom:");
        TNom = new JTextField(15);
        JLabel LMoyenne = new JLabel("Moyenne");
        TMoyenne = new JTextField(15);
        Affichage.add(LNom); Affichage.add(TNom); Affichage.add(LMoyenne); Affichage.add(TMoyenne);
        // Panneau Parcourir
        JPanel Parcourir =new JPanel();
        JButton Premier=new JButton( " Premier ");JButton Dernier=new JButton(" Dernier  ");
        JButton Suivant=new JButton( " Suivant   ");JButton Precedent=new JButton("precedent");
        Parcourir.add(Premier);Parcourir.add(Dernier);Parcourir.add(Suivant);Parcourir.add(Precedent);
        // Panneau Gestion
        JPanel Gestion = new JPanel();
        JButton Nouveau=new JButton( " Nouveau ");JButton Modifier=new JButton(" Modifier");
        JButton Supprimer=new JButton(" Supprimer");JButton Quitter=new JButton(" Quitter   ");
        Gestion.add(Nouveau);Gestion.add(Modifier);Gestion.add(Supprimer);Gestion.add(Quitter);
        // Placement des panneaux dans la fenetre
        JFrame Fenetre = new JFrame("Gestion des notes des etudiants");
        GridLayout Disposition= new GridLayout(3,1);  Fenetre.setLayout(Disposition);
        Fenetre.getContentPane().add(Affichage);// Fenetre.getContentPage().add(Affichage, BorderLayout.NORTH);
        Fenetre.getContentPane().add(Parcourir);// Fenetre.getContentPage().add(Parcourir, BorderLayout.CENTER);
        Fenetre.getContentPane().add(Gestion);  // Fenetre.getContentPage().add(Gestion , BorderLayout.SOUTH);
        Fenetre.setUndecorated(true);
        Fenetre.pack();
        // Taille souhaitée de la fenêtre
        int width = 800;
        int height = 600;
        Fenetre.setSize(width, height);

        // Centrer la fenêtre sur l'écran
        Fenetre.setLocationRelativeTo(null);
        Fenetre.setVisible(true);
        Fenetre.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Suivant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!etudiants.isEmpty()) {
                    position = (position + 1) % etudiants.size();
                    afficherEtudiantCourant();
                }
            }
        });
        Dernier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!etudiants.isEmpty()) {
                    position= etudiants.size() - 1; // Passer à la dernière position
                    afficherEtudiantCourant();
                }
            }
        });
        // Traitement du bouton "Nouveau"
        Nouveau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nouveauNom = TNom.getText();
                String nouvelleMoyenneStr = TMoyenne.getText();

                // Vérification que les champs ne sont pas vides
                if (!nouveauNom.isEmpty() && !nouvelleMoyenneStr.isEmpty()) {
                    double nouvelleMoyenne = Double.parseDouble(nouvelleMoyenneStr);
                    etudiants.add(nouveauNom);
                    moyennes.add(nouvelleMoyenne);

                    // Mise à jour de l'affichage si le nouveau étudiant est ajouté
                    position= etudiants.size() - 1;
                    afficherEtudiantCourant();
                }
            }
        });

        // Traitement du bouton "Modifier"
        Modifier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (position != -1) {
                    String nouveauNom = TNom.getText();
                    String nouvelleMoyenneStr = TMoyenne.getText();

                    // Vérification que les champs ne sont pas vides
                    if (!nouveauNom.isEmpty() && !nouvelleMoyenneStr.isEmpty()) {
                        double nouvelleMoyenne = Double.parseDouble(nouvelleMoyenneStr);
                        etudiants.set(position, nouveauNom);
                        moyennes.set(position, nouvelleMoyenne);

                        // Mise à jour de l'affichage si les données sont modifiées
                        afficherEtudiantCourant();
                    }
                }
            }
        });
        Precedent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!etudiants.isEmpty()) {
                    position = (position - 1 + etudiants.size()) % etudiants.size();
                    afficherEtudiantCourant();
                }
            }
        });
        Supprimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (position != -1) {
                    etudiants.remove(position);
                    moyennes.remove(position);

                    // Si la liste n'est pas vide après la suppression, afficher l'étudiant suivant
                    if (!etudiants.isEmpty()) {
                        position = position % etudiants.size();
                    } else {
                        position = -1;
                    }
                    afficherEtudiantCourant();
                }
            }
        });
        // Traitement du bouton "Premier"
        Premier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!etudiants.isEmpty()) {
                    position = 0; // Passer à l'indice 0 (premier étudiant)
                    afficherEtudiantCourant();
                }
            }
        });
        // Traitement du bouton "Quitter"
        Quitter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Fenetre.dispose();
            }
        });



    }
    private static void afficherEtudiantCourant() {
        if (position != -1) {
            TNom.setText(etudiants.get(position));
            TMoyenne.setText(String.valueOf(moyennes.get(position)));
        }
    }

}