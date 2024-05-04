import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Maladie m1=new Maladie("diabitique",Type.chronique);
        Maladie m2=new Maladie("grippe",Type.nonchronique);

        Patient p1=new Patient(1254,"alitrabelsi","254865415");
        Patient p2=new Patient(1546,"cistophe colomb","215452");

        p1.ajouterMaladie(m2);
        p2.ajouterMaladie(m1);
        p1.ajouterMaladie(m1);
        System.out.println(p1.aMaladieChronique());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        HashMap<Integer,Patient> hash=new HashMap<>();
        AgendaMedecin docteur1=new AgendaMedecin(2514879,"zkolli",hash);
        docteur1.prendreRendezvous(12545,p2);
        System.out.println("lepatient a consulter  "+docteur1.consulterPatient(12545));
        System.out.println("les patient avec rebdez vous "+docteur1.getPatient());
        System.out.println("les patient chronisue sont "+docteur1.getPatientChronique());

    }
}