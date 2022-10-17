import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        //given
        Long idExpected = 0L;
        String nameExpected = null;

        //when
        Person person = new Person(idExpected, nameExpected);
        Long actualID = person.getID();
        String actualName = person.getName();
        //then
        Assert.assertEquals(idExpected, actualID);
        Assert.assertEquals(nameExpected, actualName);
    }
    @Test
    public void testGetName(){
        //given
        Long id = 123L;
        String name = "Karem";
        Person person = new Person(id, name);
        String nameExpected = "Charles";
        //when
        person.setName(nameExpected);
        String actualName = person.getName();
        //then
        Assert.assertEquals(nameExpected, actualName);
    }



}