import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestInstructor {
    @Test
    public void testImplementation() {
        //when
        Instructor instructor = new Instructor(0L, null);
        //then
        Assertions.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        //when
        Instructor instructor = new Instructor(0L, null);
        //then
        Assertions.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testLearn(){
        //given
        Instructor instructor = new Instructor(0,null);
        Student student = new Student(0,null, 3.0);
        //when
        instructor.teach(student, 3.0);
        double actualTimeLearned = student.getTotalStudyTime();
        double expected = 6.0;

        //then
        Assertions.assertEquals(expected, actualTimeLearned);
    }
    @Test
    public void testLecture(){
        //given
        Instructor instructor = new Instructor(12345, "Mikaela");
        Student student1 = new Student(123, "Karem", 20.0);
        Student student2 = new Student(456, "Aqil", 10.0);
        Student student3 = new Student(789, "Omar", 5.0);
        Learner[] students = {student1, student2, student3};
        //when
        instructor.lecture(students,21.0);
        double hoursPerStudent = 21.0/students.length;
        double[] expected = {(20.0 + hoursPerStudent), (10.0 + hoursPerStudent), (5.0 + hoursPerStudent)};
        //then
        for (int i = 0; i < students.length; i++){
            Assertions.assertEquals(expected[i], students[i].getTotalStudyTime());

        }
    }

}
