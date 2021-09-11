package novi.basics.nl;

import java.util.*;

public class AppartmentExample {
    public static void main(String[] args) {
        Person beatrix = new Person("Beatrix", "van Nassau");
        Person willie = new Person("Willie", "van Nassau");
        Person max = new Person("Maxima", "van Nassau");
        Person amalia = new Person("Amalia", "van Nassau");

        // We maken hier een appartment-object aan zonder een gevulde lijst mee te geven.
        Appartment soestdijk = new Appartment("Amsterdamsestraatweg", "1");

        //Vervolgens voegen we personen toe via het Appartment-object.
        soestdijk.addPerson(beatrix);
        soestdijk.addPerson(willie);
        soestdijk.addPerson(max);
        soestdijk.addPerson(amalia);

        System.out.println(soestdijk.toString());

        //We maken eerst een list met Random personen.
        Person studentOne = new Person("Sjaak", "Patat");
        Person studentTwo = new Person("Fred", "Frikandel");
        Person studentThree = new Person("Co", "Kroket");
        Person studentFour = new Person("Piet", "Friet");
        List<Person> personList = new ArrayList<>();
        personList.add(studentOne);
        personList.add(studentTwo);
        personList.add(studentThree);
        personList.add(studentFour);

        Appartment krot = new Appartment("Groot Hertoginnelaan", "30", personList);

        System.out.println(krot.toString());
//        System.out.println(personList.get(1));


        int numberOfPersonsInKrot = krot.getPersons().size();
        for (int i = 0; i < numberOfPersonsInKrot; i++) {
            System.out.println(krot.getPersons().get(i));
        }


        List<Person> myPersons = new List<Person>();
        Person personA = Person("Freek","Frans");
        Person personB = Person("Grijze","Graaf");
        myPersons.add(personA);
        myPersons.add(personB);





            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Person> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Person person) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Person> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Person> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Person get(int index) {
                return null;
            }

            @Override
            public Person set(int index, Person element) {
                return null;
            }

            @Override
            public void add(int index, Person element) {

            }

            @Override
            public Person remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Person> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Person> listIterator(int index) {
                return null;
            }

            @Override
            public List<Person> subList(int fromIndex, int toIndex) {
                return null;
            }
        }

    }
}
