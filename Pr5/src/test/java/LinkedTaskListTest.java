
import org.junit.Before;
import ua.edu.sumdu.ta.Medvedkov.pr5.*;

public class LinkedTaskListTest extends TaskListTest {
    @Before 
    public void createTaskList() {
        tasks = new LinkedTaskList();
    }
}

