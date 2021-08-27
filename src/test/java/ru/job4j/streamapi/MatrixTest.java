package ru.job4j.streamapi;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void matrixToListTest() {
        Integer[][] matrix = {
                {1, 2},
                {5, 6}
        };
        List<Integer> result = Matrix.matrixToList(matrix);
        List<Integer> expected = List.of(1, 2, 5, 6);
        assertThat(result, is(expected));
    }
}