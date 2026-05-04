import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    // Thêm dòng này để tạo Logger
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public static int max(int a, int b) {
        logger.info("Đang tìm số lớn nhất giữa {} và {}", a, b); // Thêm log
        if (a >= b) return a;
        return b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            logger.error("Lỗi: Không thể chia cho số 0"); // Thêm log lỗi
            throw new IllegalArgumentException("Divider must not be zero");
        }
        logger.info("Thực hiện phép chia {} cho {}", a, b); // Thêm log
        return a / b;
    }
}