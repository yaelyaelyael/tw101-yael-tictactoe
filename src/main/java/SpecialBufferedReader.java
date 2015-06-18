import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by ykaufman on 6/18/15.
 */
public class SpecialBufferedReader extends BufferedReader{

        public SpecialBufferedReader(Reader in) {
            super(in);
        }

        @Override
        public String readLine() {
            try{
                return super.readLine();
            }
            catch (IOException e) {
                throw new RuntimeIOException(e);
            }
        }
    }