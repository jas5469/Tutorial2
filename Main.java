package cs3219;


public class Main {

    public static void main(String[] args) {
	// write your code here

        (new Pipeline(
                new Input(),
                new CircularShifter(),
                new Alphabetizer(),
                new Output()
        )).run();
    }

}
