import java.io.IOException;

/**
 * Created by ykaufman on 6/18/15.
 */
public class RuntimeIOException extends RuntimeException {
    public RuntimeIOException(Exception e) {
        super(e);
    }
}
