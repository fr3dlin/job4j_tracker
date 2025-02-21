package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateTestInput {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenInputMOne() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(-1));
    }

    @Test
    public void whenInputOne() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenMultiInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1", "3", "4", "5"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int rsl = input.askInt("Enter menu:");
        assertThat(rsl, is(1));
        rsl = input.askInt("Enter menu:");
        assertThat(rsl, is(3));
        rsl = input.askInt("Enter menu:");
        assertThat(rsl, is(4));
        rsl = input.askInt("Enter menu:");
        assertThat(rsl, is(5));
    }
}