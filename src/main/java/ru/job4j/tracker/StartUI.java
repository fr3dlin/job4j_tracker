package ru.job4j.tracker;

import java.util.List;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        out.println("Menu.");
        int index = 0;
        for (UserAction uAction : actions) {
            out.println(index + ". " + uAction.name());
            index++;
        }
    }

    public static void main(String[] args) {
        Output out = new ConsoleOutput();
        Input input = new ValidateInput(out, new ConsoleInput());
        Tracker tracker = new Tracker();
        List<UserAction> actions = List.of(
                new CreateAction(out),
                new ShowAllAction(out),
                new EditAction(out),
                new DeleteAction(out),
                new FindByIdAction(out),
                new FindByNameAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(input, tracker, actions);
    }
}
