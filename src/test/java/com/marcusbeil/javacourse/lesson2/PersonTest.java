package test.java.com.marcusbeil.javacourse.lesson2;

import main.java.com.marcusbeil.javacourse.lesson2.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    public void shouldReturnHelloWorld(){
        Person marcus = new Person();
        assertEquals("Hello World", marcus.helloWorld());
    }

    @Test
    public void shouldReturnMarcus(){
        Person person = new Person();
        assertEquals("Hello Marcus", person.hello("Marcus"));
    }

    @Test
    public void shouldReturnNumberOfPersons(){
        Person person1 = new Person();
        Person person2 = new Person();
        Person myPerson = new Person();

        assertEquals(3, Person.numberOfPersons());
    }

    @Test
    public void demonstrateBoolean(){
        int i = 4;
        int j = 3;

        if(i > j){
            j = 99;
        }
        else if(j > i){
            i = 8;
        }
        else if(i == j){
            j--;
        }
        else{
            i = i + j;
        }
    }
}
