import java.util.Objects;

public class Maladie {
    private String nomMaladie;
    private Type typemaladie;

    public Maladie(String nomMaladie, Type typemaladie) {
        this.nomMaladie = nomMaladie;
        this.typemaladie = typemaladie;
    }

    public Type getTypemaladie() {
        return typemaladie;
    }

    @Override
    public String toString() {
        return "Maladie{" +
                "nomMaladie='" + nomMaladie + '\'' +
                ", typemaladie=" + typemaladie +
                '}';
    }

    @Override
    public boolean equals (Object o) {
           if(o==null){return false;}
          if(this==o){return false;};
        if (o instanceof Maladie) {

            Maladie m = (Maladie) o;
            return this.nomMaladie.equals(m.nomMaladie) && this.typemaladie == (m.typemaladie);
        }
        return false;
    }
}
