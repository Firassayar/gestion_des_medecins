import java.util.*;

public class AgendaMedecin {
    private int codeAgenda;

    private String nomMedecin;

    private HashMap<Integer,Patient>lesRendezvous;


    public AgendaMedecin(int codeAgenda,String nomMedecin,HashMap<Integer,Patient>lesRendezvous){
        this.codeAgenda=codeAgenda;
        this.nomMedecin=nomMedecin;
        this.lesRendezvous=lesRendezvous;


    }

    public void prendreRendezvous(int dateEnseconde,Patient p){

                lesRendezvous.put(dateEnseconde,p);


    }

    public Patient  consulterPatient(int dateEnSeconde){

        return lesRendezvous.get(dateEnSeconde);
    }


    public TreeSet<Patient> getPatient(){

        TreeSet<Patient>avecRendezvous=new TreeSet<>();

        for (Integer i : lesRendezvous.keySet()){
            if(i>0){
                avecRendezvous.add(lesRendezvous.get(i));
            }


        }
    return avecRendezvous;

    }
    public LinkedList<Patient> getPatientChronique(){

        LinkedList<Patient>patientsChronique=new LinkedList<Patient>();


            for (Map.Entry<Integer,Patient> i: lesRendezvous.entrySet()){
                if (  i.getValue().aMaladieChronique()){
                    patientsChronique.add(i.getValue());
                }

        }

        return patientsChronique;

    }



}
