package tests;

import movie.*;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

class OrderLineTest {

    @Test
    void calculatorPrice() {

        List<String> matrixCast = new ArrayList<>();
        List<String> Castublanao = new ArrayList<>();
        matrixCast.add("Keanu Reeves");
        Castublanao.add("Adam Sandler");
        Movie sfmovie = new SciFiMovie("The Matrix", 1998, 8.9, matrixCast, 20);
        HorrorMovie hormovie = new HorrorMovie("The nun", 2020, 6.0, matrixCast, 5);
        assert(sfmovie.getBasePrice() == 20);
        //System.out.println("da frate e bn pana aici");
        assert(hormovie.calculatePrice() == 5);
        //System.out.println("da frate e bn pana aici");
        ComedyMovie cmmovie = new ComedyMovie("Mr. Deeds", 2002, 5.0, Castublanao, 10);
        assert(cmmovie.getBasePrice() == 5);

        User user1 = new User("Ioan", "Doe", null);
        OrderLine orderLine1 = new OrderLine(sfmovie, 3);
        OrderLine orderLine2 = new OrderLine(hormovie, 5);
        List<OrderLine> orderLines = new ArrayList<>(Arrays.asList(orderLine1, orderLine2));

        assertEquals(12.0,orderLine1.calculatePrice());
        assertEquals(28*0.9, orderLine2.calculatePrice());

    }
    @Test
    void testCast() {
        List<String> avatarCast = new ArrayList<>();
        avatarCast.add("Actor 1");
        avatarCast.add("Actor 2");

        assertTrue(avatarCast.contains("Avatar 1"));
    }
}