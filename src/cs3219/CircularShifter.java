package cs3219;

import java.io.EOFException;


public class CircularShifter extends Filter {

    @Override
    public void run() {
        while (true) {
            try {
                String stringFromPipe = read();
                String tokens[] = stringFromPipe.split("\\s");

                for(int i = 0; i < tokens.length; i++) {
                    StringBuilder sb = new StringBuilder();
                    for(int j = 0; j < tokens.length; j++) {
                        sb.append(tokens[j]);
                        sb.append(" ");
                    }
                    sb.append("\n");
                    shiftLeft(tokens);
                    write(sb.toString());
                }

            } catch (EOFException e) {
                outPipe.close();
                break;
            }
        }
    }

    private void shiftLeft(String[] array) {
        String temp = array[0];
        int i;
        for (i = 0; i < array.length - 1; i++)
            array[i] = array[i + 1];
        array[i] = temp;
    }

}