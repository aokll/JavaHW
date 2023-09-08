package MVP.View;

import MVP.View.Command.AddHuman;
import MVP.View.Command.Close;
import MVP.View.Command.CommandClass;
import MVP.View.Console.Console;

import java.util.ArrayList;
import java.util.List;

public class MenuClass {
    private final List<CommandClass> listOfCommands;

    public MenuClass(Console console) {
        listOfCommands = new ArrayList<>();
        listOfCommands.add(new AddHuman(console));
        listOfCommands.add(new Close(console));
    }
    public String menu(){
        StringBuilder commandStatusBar = new StringBuilder();
        for (int i = 0; i < listOfCommands.size(); i++) {
            commandStatusBar.append(i+1).append(". ").append(listOfCommands.get(i).getDiscript()).append("\n");
        }
        return commandStatusBar.toString();
    }
    public void execute(int numberOfTheCommand) throws Exception {
        CommandClass commandClass = listOfCommands.get(numberOfTheCommand-1);
        commandClass.execute();
    }

    public List<CommandClass> getListOfCommands() {
        return listOfCommands;
    }
}
