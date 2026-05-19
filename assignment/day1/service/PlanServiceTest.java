package week3.project.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week3.project.model.InternetPlan;

class PlanServiceTest {

    private PlanService service;

    @BeforeEach
    void setup() 
    {
        service = new PlanService();
        service.addPlan(new InternetPlan(
                1,
                "Basic Plan",
                299,
                20,
                28,
                "4G"
        		));

        service.addPlan(new InternetPlan(
                2,
                "Premium Plan",
                599,
                100,
                56,
                "5G"));
    }

    @Test
    void testAddPlan() 
    {
        InternetPlan plan = new InternetPlan(
                3,
                "Starter Plan",
                199,
                10,
                14,
                "2G");

        service.addPlan(plan);

        assertNotNull(plan);
    }

    @Test
    void testDisplayPlan() 
    {
        service.displayPlan();

        assertEquals(2, service.getPlans().size());
    }

    @Test
    void testSearchByPrice() 
    {
        service.searchByPrice(500);

        assertEquals(2, service.getPlans().size());
    }

    @Test
    void testSearchBySpeed() 
    {
        service.searchBySpeed(50);

        assertEquals(2, service.getPlans().size());
    }

    @Test
    void testSearchByValidity() 
    {
        service.searchByValidity(30);

        assertEquals(2, service.getPlans().size());
    }

    @Test
    void testSortByPrice() 
    {
        service.sortByPrice();

        assertEquals(299, service.getPlans().get(0).getPrice());
    }

    @Test
    void testSortBySpeed() 
    {
        service.sortBySpeed();

        assertEquals(20, service.getPlans().get(0).getSpeed());
    }

    @Test
    void testSortByNetworkType() 
    {
        service.sortByNetworkType();

        assertEquals("4G", service.getPlans().get(0).getNetworkType());
    }
}