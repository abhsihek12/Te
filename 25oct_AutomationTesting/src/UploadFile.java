import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadFile {

	public void fileUplaod(String path) throws AWTException    //it shoul be declared in the applicationUtilityInterface
	{
		
		StringSelection sel = new StringSelection(path);
		Clipboard clipboard =  Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(sel, null);
		
		Robot rob = new Robot();
		rob.delay(500);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.delay(500);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
}

