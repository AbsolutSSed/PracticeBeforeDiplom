import org.example.Account;
import org.junit.Test;
import static org.junit.Assert.*;

    public class AccountTest {

        @Test
        public void testValidName() {
            Account account = new Account("Тимоти Шаламе");
            assertTrue(account.checkNameToEmboss());
        }

        @Test
        public void testNameTooShort() {
            Account account = new Account("B");
            assertFalse(account.checkNameToEmboss());
        }

        @Test
        public void testNameTooLong() {
            Account account = new Account("Александра Вишневская-ПетроваFFFFFFFF");
            assertFalse(account.checkNameToEmboss());
        }

        @Test
        public void testNoSpaceInName() {
            Account account = new Account("ТимотиШаламе");
            assertFalse(account.checkNameToEmboss());
        }

        @Test
        public void testSpaceAtStart() {
            Account account = new Account(" ТимотиШаламе");
            assertFalse(account.checkNameToEmboss());
        }

        @Test
        public void testSpaceAtEnd() {
            Account account = new Account("ТимотиШаламе ");
            assertFalse(account.checkNameToEmboss());
        }

        @Test
        public void testMultipleSpaces() {
            Account account = new Account("Тимоти  Шаламе");
            assertFalse(account.checkNameToEmboss());
        }

        @Test
        public void testSpaceOnly() {
            Account account = new Account(" ");
            assertFalse(account.checkNameToEmboss());
        }

        @Test
        public void testEmptyName() {
            Account account = new Account("");
            assertFalse(account.checkNameToEmboss());
        }

        @Test
        public void testValidNameWithMinLength() {
            Account account = new Account("Иван А");
            assertTrue(account.checkNameToEmboss());
        }

        @Test
        public void testValidNameWithMaxLength() {
            Account account = new Account("Андрей Игорев");
            assertTrue(account.checkNameToEmboss());
        }
    }

