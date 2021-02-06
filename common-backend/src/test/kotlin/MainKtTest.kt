import org.junit.Assert.*
import kotlin.test.Test

class MainKtTest {
    @Test
    fun customSummTest() {
        assertNotEquals(customSumm(3,2), 6)
        assertEquals(customSumm(3,2), 5)
    }
}