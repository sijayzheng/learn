import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author 郑世杰
 */
public class LogTest {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger("LogTest");
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.fatal("fatal");
        // OFF > FATAL > ERROR > WARN > INFO > DEBUG > TRACE > ALL
    }
}