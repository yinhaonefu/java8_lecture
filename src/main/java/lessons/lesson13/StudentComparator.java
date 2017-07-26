package lessons.lesson13;

/**
 * Created by yinhao on 17/7/26.
 * 倒序
 */
public class StudentComparator {

    public int compareStudentByScore(Student student1,Student student2){
        return student2.getScore() - student1.getScore();
    }

    public int compareStudentByName(Student student1,Student student2){
        return student2.getName().compareToIgnoreCase(student1.getName());
    }

}
