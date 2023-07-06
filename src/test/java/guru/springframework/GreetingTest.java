package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
    private Greeting greeting;

    @BeforeEach
    void setUp(){
        System.out.println("In Before Each.....");
        greeting = new Greeting();
    }

    @Test
    void helloworld() {

        System.out.println(greeting.helloworld());
    }


    @Test
    void helloworld1() {

        System.out.println(greeting.helloworld("charlie"));
    }
}