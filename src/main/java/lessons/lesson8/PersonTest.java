package lessons.lesson8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * Created by yinhao on 17/7/22.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("zhangsan",20,"beijing");
        Person person2 = new Person("lisi",30,"shanghai");
        Person person3 = new Person("wangwu",40,"guangzhou");
        Person person4 = new Person("zhaoliu",50,"shenzhen");
        List<Person> list = Arrays.asList(person,person2,person3,person4);

        PersonTest personTest = new PersonTest();
        personTest.getPersonsByUsername("zhangsan", list).forEach(person1 -> System.out.println(person1.getName()));
        System.out.println("========");
        personTest.getPersonsByAge(20,list).forEach(person1 -> System.out.println(person1.getName()));
        System.out.println("========");
        personTest.getPersonsByCity("shanghai",list,(city,persons) -> persons.stream()
                .filter(p -> p.getCity().equals(city)).collect(Collectors.toList()))
                .forEach(person1 -> System.out.println(person1.getName()));
        System.out.println("========");
    }

    public List<Person> getPersonsByUsername(String username,List<Person> persons){
        List<Person> result = persons.stream().filter
                (person -> person.getName().equals(username)).collect(Collectors.toList());
        return result;
    }

    public List<Person> getPersonsByAge(int age,List<Person> persons){
        BiFunction<Integer,List<Person>,List<Person>> biFunction =
                (ageOfPerson,personList) -> personList.stream()
                        .filter(person -> person.getAge() > ageOfPerson).collect(Collectors.toList());
        return biFunction.apply(age,persons);
    }

    public List<Person> getPersonsByCity(String city,List<Person> persons,
                                         BiFunction<String,List<Person>,List<Person>> biFunction){
        return biFunction.apply(city,persons);
    }

}
