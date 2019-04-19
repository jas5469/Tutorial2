package cs3219;

import java.io.EOFException;

public abstract class Filter implements Runnable {

    protected Pipe in, out;

    public void setInPipe(Pipe p) {
        in = p;
    }

    public void setOutPipe(Pipe p) {
        out = p;
    }

    public void write(String s) {
        if (s == null) {
            out.close();
            return;
        }
        out.write(s);
    }

    public String read() throws EOFException {
        return in.read();
    }
}
