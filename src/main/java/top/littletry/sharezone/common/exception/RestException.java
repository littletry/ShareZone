package top.littletry.sharezone.common.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by LittleTry
 * Date: 2017-12-18
 * Time: 14:26
 *
 * @author LittleTry
 */
public class RestException extends Exception {
    private static final Logger log = LoggerFactory.getLogger(RestException.class);

    public RestException(String message, Exception cause) {
        super(message, cause);
        log.debug(message+":"+cause);
    }

    public RestException(String message) {
        this(message, null);
    }

    public RestException(Exception cause) {
        this(cause.getMessage(), cause);
    }
}
