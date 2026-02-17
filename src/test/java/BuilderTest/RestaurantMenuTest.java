package BuilderTest;

import org.example.RestaurantMenu.MenuBuilder;
import org.example.RestaurantMenu.domain.Menu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RestaurantMenuTest {

        private MenuBuilder builder;

        @BeforeEach
        void setUp() {
            builder = new MenuBuilder();
        }

        @Test
        void testBuildFullMenu() {
            Menu menu = builder
                    .withEntrant("Ensalada César")
                    .isVegan()
                    .withMainCourse("Pasta Carbonara")
                    .isGlutenFree()
                    .withSupplements("Parmesano extra")
                    .withDessert("Tiramisú")
                    .withDrink("Vino Tinto")
                    .build();

            assertNotNull(menu, "El menú no debería ser nulo");
            String menuString = menu.toString();
            assertTrue(menuString.contains("Ensalada César"));
            assertTrue(menuString.contains("Pasta Carbonara"));
            assertTrue(menuString.contains("Tiramisú"));
            assertTrue(menuString.contains("Vino Tinto"));
        }

        @Test
        void testBuildMenuWithoutEntrant() {
            Menu menu = builder
                    .withMainCourse("Hamburguesa")
                    .withCoffe("Espresso")
                    .withDrink("Agua")
                    .build();

            String menuString = menu.toString();
            assertTrue(menuString.contains("entrant=null"), "El entrante debería ser nulo");
            assertTrue(menuString.contains("Hamburguesa"));
            assertTrue(menuString.contains("Espresso"));
        }

        @Test
        void testDishProperties() {
            Menu menu = builder
                    .withEntrant("Sopa")
                    .isVegan()
                    .isGlutenFree()
                    .withMainCourse("Filete")
                    .build();

            String menuString = menu.toString();


            assertTrue(menuString.contains("entrant=Dish{name='Sopa', isVegan=true, glutenFree=true}"));
            assertTrue(menuString.contains("mainCourse=MainCourse{supplements=[]}"));
        }

        @Test
        void testMainCourseSupplements() {
            Menu menu = builder
                    .withMainCourse("Pizza")
                    .withSupplements("Aceitunas")
                    .withSupplements("Champiñones")
                    .build();

            String menuString = menu.toString();
            assertTrue(menuString.contains("supplements=[Aceitunas, Champiñones]"));
        }

}

