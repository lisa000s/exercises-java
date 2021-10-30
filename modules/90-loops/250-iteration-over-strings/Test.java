import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        final var expected = "t\ne\nl\nx\ne\nH";

        App.printReversedNameBySymbol(3);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.printReversedNameBySymbol(3);

        final var actual = out.toString().trim();

        assertThat(actual).isEqualTo(expected);
    }
}
