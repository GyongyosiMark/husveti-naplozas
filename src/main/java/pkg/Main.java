package pkg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.ThreadContext;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    private static final Marker QUESTION_MARKER = MarkerManager.getMarker("question");
    private static final Marker STATEMENT_MARKER = MarkerManager.getMarker("statement");

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
            ThreadContext.push(String.valueOf(i));
            logger.fatal(STATEMENT_MARKER, "Korán reggel útra keltem,");
            logger.error(STATEMENT_MARKER, "Se nem ittam, se nem ettem.");
            logger.warn(STATEMENT_MARKER, "Tarisznya húzza a vállam,");
            logger.info(STATEMENT_MARKER, "Térdig kopott már a lábam.");
            logger.debug(STATEMENT_MARKER, "Bejártam a fél világot,");
            logger.trace(STATEMENT_MARKER, "Láttam sok-sok szép virágot.");
            logger.fatal(STATEMENT_MARKER, "A legszebbre most találtam,");
            logger.error("Hogy öntözzem, alig vártam.");
            logger.info(QUESTION_MARKER, "Szabad-e locsolni?");
            Thread.sleep(3000);
            ThreadContext.pop();
        }
    }
}


