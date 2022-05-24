package behavioral;

import behavioral.momento.Notepad;
import behavioral.momento.TextWindow;

public class MomentoRunner {

    public void run() {
        Notepad notepad = new Notepad(new TextWindow());

        notepad.writeText("Pierwszy wiersz tekstu \n");
        notepad.writeText("Drugi wiersz tekstu \n");

        notepad.save();

        notepad.writeText("Trzeci wiersz tekstu \n");

        notepad.displayText();
        notepad.undo();
        notepad.displayText();

    }
}
