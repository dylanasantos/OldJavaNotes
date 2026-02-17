import java.io.IOException;

public class tryClass implements AutoCloseable{

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    }
}
