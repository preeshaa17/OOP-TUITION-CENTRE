import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        TuitionCenter tc1 = new TuitionCenter("Cemerlang Tuiton Centre", new HeadMaster("Daya", "651213-07-0360", "Taman Bunga Raya", 10));

        Tutor tut1 = new Tutor("Lala", "671325-08-5643", "Taman Selamat", "Masters", 4, 5);
        Tutor tut2 = new Tutor("Rara", "750922-01-8745", "Taman Ah Seng", "Degree", 5, 2);
        
        List<Integer> scores1 = new ArrayList<>();
        scores1.add(78);
        scores1.add(78);
        scores1.add(61);
        Student s1 = new Student("Sasa", "020716-08-0987", "Taman Fan", 2022, "SMK Mahkota", scores1);
        
        List<Integer> scores2 = new ArrayList<>();
        scores2.add(45);
        scores2.add(88);
        scores2.add(78);
        Student s2 = new Student("Sala", "020416-07-0635", "Taman Delima", 2021, "SMK Mahkota", scores2);
        
        tc1.addTutor(tut1);
        tc1.addTutor(tut2);
        tc1.addStudent(s1);
        tc1.addStudent(s2);

        int numStudents = tc1.getStudents().size();
        int numTutors = tc1.getTutors().size();
        double averageMarks = tc1.getAverageMarks();
        System.out.println("Tuition Center: " + tc1.getTutors());
        System.out.println("# Students: " + numStudents);
        System.out.println("# Tutors: " + numTutors);
        System.out.println("Average Marks: " + averageMarks);
    }
}
