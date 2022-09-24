import java.util.Comparator;

public class ExamCompare implements Comparator<Student> {
    @Override
    public int compare(Student s1,Student s2) {
        if(s1.getExamAvarge()>s2.getExamAvarge()){
            return  1;
        }
        return -1;
    }

}
