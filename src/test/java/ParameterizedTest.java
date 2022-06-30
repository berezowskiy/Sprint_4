import com.example.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

public class ParameterizedTest {

    @RunWith(Parameterized.class)
    public static class AccountNameTest {

        private final String name;
        private final boolean expected;

        public AccountNameTest(String name, boolean expected) {
            this.name = name;
            this.expected = expected;
        }

        @Parameterized.Parameters
        public static Object[][] getTestData() {
            return new Object[][] {
                    {"Макс +100500", true},
                    {"Евгений Гришковец", true},
                    {" Павел Воля ", false},
                    {"GuyFox", false},
                    {"Александр  Невский", false},
                    {"Александр Сергеевич Пушкин", false},
                    {"1", false},
            };
        }

        @Test
        public void shouldReturnNamePrintPossibility() {
            Account account = new Account(name);
            boolean actual = account.checkNameToEmboss();
            assertEquals(expected, actual);
        }
    }
}
