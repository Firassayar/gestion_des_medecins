import java.util.Iterator;
import java.util.LinkedList;

public class Patient implements Comparable<Patient> {

    private int codePatient;
    private String nomPrenom;
    private String numTel;

    private LinkedList<Maladie> lesmaladies;


    public Patient(int codePatient, String nomPrenom, String numTel) {
        this.codePatient = codePatient;
        this.nomPrenom = nomPrenom;
        this.numTel = numTel;
       lesmaladies= new LinkedList<Maladie>();
    }


    public void ajouterMaladie(Maladie p){

            if(!lesmaladies.contains(p)){
                lesmaladies.add(p);
            }


    }



    public int compareTo(Patient p) {

            return this.nomPrenom.compareTo(p.nomPrenom);

    }


    public boolean aMaladieChronique(){
        Iterator<Maladie> iterator=lesmaladies.iterator();
        boolean mld=false;
        while (iterator.hasNext()&&  !mld){
            Maladie m=iterator.next();
            if (m.getTypemaladie()==Type.chronique)
                mld=true;


        }
        return mld;

    }

    @Override
    public String toString() {
        return "Patient{" +
                "codePatient=" + codePatient +
                ", nomPrenom='" + nomPrenom + '\'' +
                ", numTel='" + numTel + '\'' +
                ", lesmaladies=" + lesmaladies +
                '}';
    }
}
