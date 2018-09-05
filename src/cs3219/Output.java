package cs3219;

import java.io.EOFException;


public class Output extends Filter {

    @Override
    public void run() {
        while(true) {
            try {
                String s = read();

                System.out.println(s);
            } catch(EOFException e) {
                break;
            }
        }
    }

}
