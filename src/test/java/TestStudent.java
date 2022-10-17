import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class TestStudent {
//    Student student;
//
//    @BeforeEach
//    public void setUpBeforeEach(){ student = new Student(0L,null, 0.0); }

    @Test
    public void implementationTest(){
        //when
        Student student = new Student(0L,null, 0.0);
        //then
        Assertions.assertTrue(student instanceof Learner);
    }
    @Test
    public void testInheritance(){
        //when
        Student student = new Student(0L,null, 0.0);
        //then
        Assertions.assertTrue(student instanceof Person);
    }
    @Test
    public void testLearn(){
        //given
        Student student = new Student(0,null, 0.0);
        //when
        student.learn(3.0);
        double actualTimeLearned = student.getTotalStudyTime();
        double expected = 3.0;

        //then
        Assertions.assertEquals(expected, actualTimeLearned);
    }


}
