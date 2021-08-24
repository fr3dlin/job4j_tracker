import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FuncDiapason {

    private List<Double> diapason(double a, double b, Function<Double, Double> func) {
        List<Double> doubles = new ArrayList<>();
        for (double i = a; i < b; i++) {
            doubles.add(func.apply(i));
        }
        return doubles;
    }

    @Test
    public void whenLinearFunctionThenLinearResults() {
        FuncDiapason function = new FuncDiapason();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadFunctionThenQuadResults() {
        FuncDiapason function = new FuncDiapason();
        List<Double> result = function.diapason(5, 8, x -> x * x);
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExpFunctionThenExpResults() {
        FuncDiapason function = new FuncDiapason();
        List<Double> result = function.diapason(5, 8, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(32D, 64D, 128D);
        assertThat(result, is(expected));
    }
}
