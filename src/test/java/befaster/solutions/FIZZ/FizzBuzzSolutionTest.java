package befaster.solutions.FIZZ;

import befaster.solutions.FIZ.FizzBuzzSolution;
import befaster.solutions.SUM.SumSolution;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzSolutionTest {
    private FizzBuzzSolution fizzBuzzSolution;

    @Before
    public void setUp() {

        fizzBuzzSolution = new FizzBuzzSolution();
    }

    @Test
    public void testFizzBuzz() {

        assertThat(fizzBuzzSolution.fizzBuzz(1), equalTo("1"));
        assertThat(fizzBuzzSolution.fizzBuzz(3), equalTo("fizz"));
        assertThat(fizzBuzzSolution.fizzBuzz(5), equalTo("buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(15), equalTo("fizz buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(13), equalTo("fizz"));
        assertThat(fizzBuzzSolution.fizzBuzz(53), equalTo("fizz buzz"));
        assertThat(fizzBuzzSolution.fizzBuzz(333), equalTo("fizz deluxe"));
        assertThat(fizzBuzzSolution.fizzBuzz(11), equalTo("deluxe"));
        assertThat(fizzBuzzSolution.fizzBuzz(811), equalTo(811));
    }
}
