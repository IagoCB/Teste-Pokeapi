package teste_api.pokemon;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PokemonTestRunner {

    @Test
    void testParallel() {
        Results results = Runner.path("classpath:teste_api")
                .tags("@pokeapi")
                //.outputCucumberJson(true)
                .parallel(5);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

}
