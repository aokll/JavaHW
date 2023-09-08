package MVP.View.Command;

import MVP.View.Console.Console;

public class AddHuman extends CommandClass{
    public AddHuman(Console console) {
        super("Создать и добавить человека в файл, если файл с таким именем уже существует, данные запишутся в одноименный файл", console);
    }

    @Override
    public void execute() throws Exception {
        super.getConsole().addHuman();
    }
}
