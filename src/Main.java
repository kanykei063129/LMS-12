import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Country country1 = new Country();
        country1.setName("KYRGYZSTAN");
        country1.setLocation("CENTER ASIA");

        Country country2 = new Country();
        country2.setName("KAZAKSTAN");
        country2.setLocation("CENTER ASIA");

        Country country3 = new Country();
        country3.setName("TAJIKSTAN");
        country3.setLocation("CENTER ASIA");

        Country[] countries = {country1, country2, country3};

        for (Country co : countries) {
            System.out.println(co.getName() + ":" + co.getLocation());

        }


        Address address1 = new Address();
        address1.setStreet("MYCHURINA ");
        address1.setNumber(101-1);

        Address address2 = new Address();
        address2.setStreet("CHAKIEV");
        address2.setNumber(17);

        Address address3 = new Address();
        address3.setStreet("JIBEK");
        address3.setNumber(83);

        Address[] addresses = {address1, address2, address3};

        for (Address a : addresses) {
            System.out.println(a.getStreet() + " " + a.getNumber());
        }
        City city1 = new City();
        city1.setName("NARYN");

        city1.setPopulation(190000);

        City city2 = new City();
        city2.setName("TUP");
        city2.setPopulation(500000);

        City city3 = new City();
        city3.setName("BATKEN");
        city3.setPopulation(18000);

        City[] cities = {city1, city2, city3};
        for (City c : cities) {

            System.out.println(c.getName() + "  " + " " + c.getPopulation());
        }

        Person person1 = new Person();
        person1.setName("KANYKEI");
        person1.setDateOfBirth(LocalDate.of(2006, 3, 19));
        person1.setProfession("IT");
        person1.setCountry(country1.getName());

        Person person2 = new Person();
        person2.setName("KHAFIS");
        person2.setDateOfBirth(LocalDate.of(2004, 9, 10));
        person2.setProfession("UNIVERSAL");
        person2.setCountry(country2.getName());


        Person person3 = new Person();
        person3.setName("MADINA");
        person3.setDateOfBirth(LocalDate.of(2006, 10, 31));
        person3.setProfession("PHOTO");
        person3.setCountry("OZBEKSTAN");
        Person[] people = {person1, person2, person3};
        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getDateOfBirth() + " " + person.getProfession() + " " + person.getCountry());
        }
    }
}