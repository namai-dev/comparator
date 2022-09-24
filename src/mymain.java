import java.util.*;

public class mymain {


    public static void main(String[]args){
        ArrayList<Student> st2 = new ArrayList<>();
        Student st[] = new Student[6];
        st[0] = new Student("Jimmy",45,5,28);


        st[1]=new Student("Jimmy",65,10,25);
        st[2]=new Student("Jimmy",70,10,28);
        st[3]=new Student("Jimmy",56,8,20);
        st[4]=new Student("Jimmy",64,2,23);
        st[5]=new Student("Jimmy",67,7,29);


        st2.add(new Student("Jimmy",65,10,25));
        st2.add(new Student("Jimmy",70,10,28));
        st2.add(new Student("Jimmy",56,8,20));
        st2.add(new Student("Jimmy",64,2,23));


//        Arrays.sort(st,new AssignCompare());
//        for(int i = 0; i < st.length-1;i++){
//            System.out.println(st[i].getName()+" "+st[i].getExamAvarge()+" "+st[i].getCatAvarage()+" "+st[i].getTotalPercent());
//        }


        Collections.sort(st2,new ExamCompare());

        st2.forEach((e)->{
            System.out.println(e.getExamAvarge());
        });



    }
}
