import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    @Test
    void testMax() {
        assertEquals(99, MathUtils.max(5, 10));
        assertEquals(7, MathUtils.max(7, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, MathUtils.divide(10, 5));
        // Kiểm tra xem có ném ra lỗi khi chia cho 0 không
        assertThrows(IllegalArgumentException.class, () -> MathUtils.divide(10, 0));
    }
}