import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {

    // function called fizzBuzz() - YES
    // This function will take in an input (int) - YES
    // It will then return fizz if a multiple of 3 - YES
    // Or buzz if a multiple of 5 - YES
    // Or "fizz buzz" if multiple of fizz or buzz - YES
    // Or return input if not divisible by 3 or 5 - YES

    @Test
    public void game__3_returns_fizz() {
        assertThat(FizzBuzz.game(3)).isEqualTo("fizz");
    }

    @Test
    public void game__9_returns_fizz() {
        assertThat(FizzBuzz.game(9)).isEqualTo("fizz");
    }

    @Test
    public void game__5_returns_buzz() {
        assertThat(FizzBuzz.game(5)).isEqualTo("buzz");
    }

    @Test
    public void game__10_returns_buzz() {
        assertThat(FizzBuzz.game(10)).isEqualTo("buzz");
    }

    @Test
    public void game__15_return_fizzbuzz(){
        assertThat(FizzBuzz.game(15)).isEqualTo("fizz buzz");
    }

    @Test
    public void game__30_return_fizzbuzz(){
        assertThat(FizzBuzz.game(30)).isEqualTo("fizz buzz");
    }

    @Test
    public void game__7_return_7(){
        assertThat(FizzBuzz.game(7)).isEqualTo("7");
    }

    @Test
    public void game__4_return_4(){
        assertThat(FizzBuzz.game(4)).isEqualTo("4");
    }
}
