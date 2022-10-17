import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People {
    private List<Person> personList;

    public List<Person> getPersonList() {
        return personList;
    }
    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
    public void add(Person person){
        personList.add(person);
    }
    public Person findById(long id){
        Person person = null;
        for (Person x : personList){
            if (x.getID() == id){
                person = x;
            }
        }
        return person;
    }
    public boolean contains(Person person){
        if(personList.contains(person)){
            return true;
        }
        return false;
    }
    public void remove(Person person){
        personList.remove(person);
    }
    public void removeById(long id){
        for(Person x: personList){
            if(x.getID() == id){
                personList.remove(x);
            }
        }
    }
    public void removeAll(){
        personList.clear();
    }

    public Integer count(){
        return personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[personList.size()]);
    }

    public Iterator<Person> iterator() {
        Iterable<Person> personIterator = personList;
        Iterator<Person> iterator = personIterator.iterator();
        return iterator;
    }
}
