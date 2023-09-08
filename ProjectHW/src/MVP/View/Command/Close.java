package MVP.View.Command;

import MVP.View.Console.Console;

import java.io.IOException;
import java.text.ParseException;

public class Close extends CommandClass{
    public Close(Console console) {
        super("Выйти", console);
    }

    @Override
    public void execute() throws ParseException, IOException {
        super.getConsole().finish();
    }
}
