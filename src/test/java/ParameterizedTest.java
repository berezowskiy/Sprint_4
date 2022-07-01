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
                    {"ИМЯ СПРОБЕЛОМ", true},
                    {"123 567890", true},
                    {"<>><>><> ***?***", true},

                    {"Т РИ", true},
                    {"Девятнадцать буквVv", true},

                    {"ИМЯБЕЗПРОБЕЛА", false},
                    {"ИМЯ ТРИ ПРОБЕЛА", false},

                    {"Александр Пушкин ", false},
                    {" Александр  Пушкин", false},
                    {" Александр Пушкин ", false},
                    {" Пушкин", false},
                    {"Пушкин ", false},
                    {"", false},
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
