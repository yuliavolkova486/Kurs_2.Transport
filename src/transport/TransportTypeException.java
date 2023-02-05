package transport;

import java.io.IOException;

public class TransportTypeException  extends IOException{
    public TransportTypeException(String message) {
        super(message);
    }
}
