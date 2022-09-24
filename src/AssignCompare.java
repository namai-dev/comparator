import java.util.Comparator;

public class AssignCompare implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAssAvarege()> o2.getAssAvarege()){
            return 1;
        }
        return 0;
    }
}
