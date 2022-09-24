import java.util.Comparator;

public class OvaralCompare implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getTotalPercent()> o2.getTotalPercent()){
            return 1;
        }
        return 0;
    }
}
