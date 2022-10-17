import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestPeople {
    @Test
    public void testAdd() {
        //given
        People people = new People();
        people.setPersonList(new ArrayList<>());
        //when
        people.add(new Person(123, "Karem"));
        people.add((new Person(456, "Aqil")));
        people.add(new Person(789, "Omar"));
        //then
        assertFalse(people.getPersonList().isEmpty());
    }
    @Test
    public void testRemove() {
        //given
        People people = new People();
        people.setPersonList(new ArrayList<>());
        Person person1 = new Person(123, "Karem");
        Person person2 = new Person(456, "Aqil");
        Person person3 = new Person(789, "Omar");
        people.add(person1);
        people.add(person2);
        people.add(person3);

        //when
        people.remove(person1);
        people.remove(person2);
        people.remove(person3);
        //then
        assertTrue(people.getPersonList().isEmpty());
    }
    @Test
    public void testFindById(){
        //given
        People people = new People();
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(123, "Karem"));
        personList.add(new Person(456, "Aqil"));
        personList.add(new Person(789, "Omar"));
        people.setPersonList(personList);
        //when
        Person expected1 = personList.get(0);
        Person actual1 = people.findById(123);
        Person expected2 = personList.get(1);
        Person actual2 = people.findById(456);
        Person expected3 = personList.get(2);
        Person actual3 = people.findById(789);
        //then
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);

    }
}
