package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
    private Greeting greeting;

    @BeforeAll
    static void beforeClass() {
        System.out.println("Before - I am only called Once!!!");

    }

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

    @AfterEach
    void tearDown() {
        System.out.println("In After Each...... ");
    }

    @AfterAll
    static void afterClass() {
        System.out.println("Ater - I am only called Once!!!");

    }
}