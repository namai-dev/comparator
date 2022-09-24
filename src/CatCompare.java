import java.util.Comparator;

public class CatCompare implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getCatAvarage()>o2.getCatAvarage()){
            return 1;
        }
        return 0;
    }
}
