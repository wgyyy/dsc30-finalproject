import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class PostTest {

    @Test
    public void test(){
        LocalDate test = LocalDate.now();
        System.out.println(test);
    }

    @org.junit.Test
    public void testToString() {
        String PID = "A1";
        String username = "wang";
        String header = "DSC";
        String UID = "A2";
        User poster = new Student(PID,username);
        Question test = new Question(poster,header,UID);
        System.out.println(test);
    }
}