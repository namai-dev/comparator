public class Student {
    private String name;
    private int examAvarge;
    private int assAvarege;
    private int catAvarage;
    private int totalPercent;

    public Student(String name, int examAvarge, int assAvarege, int catAvarage) {
        this.name = name;
        this.examAvarge = examAvarge;
        this.assAvarege = assAvarege;
        this.catAvarage = catAvarage;
        this.totalPercent = (examAvarge+assAvarege+catAvarage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExamAvarge() {
        return examAvarge;
    }

    public void setExamAvarge(int examAvarge) {
        this.examAvarge = examAvarge;
    }

    public int getAssAvarege() {
        return assAvarege;
    }

    public void setAssAvarege(int assAvarege) {
        this.assAvarege = assAvarege;
    }

    public int getCatAvarage() {
        return catAvarage;
    }

    public void setCatAvarage(int catAvarage) {
        this.catAvarage = catAvarage;
    }

    public int getTotalPercent() {
        return totalPercent;
    }

    public void setTotalPercent(int totalPercent) {
        this.totalPercent = totalPercent;
    }
}
