package lessons.lesson14;

/**
 * Created by yinhao on 17/7/26.
 */
public class Student {
    private String name;
    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int compareByScore(Student student){
        return this.getScore() - student.getScore();
    }

    public int compareByName(Student student){
        return this.getName().compareToIgnoreCase(student.getName());
    }
}
