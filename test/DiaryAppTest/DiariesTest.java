package DiaryAppTest;

import DiaryApp.Diaries;
import DiaryApp.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DiariesTest {

    Diaries diaries;

    @BeforeEach
    public void setup(){
        diaries = new Diaries();
    }

    @Test
    public void testThatDiaryCanBeAddedToListOfDiaries(){
        diaries.add("Username", "password");

        assertEquals(new Diary("Username", "password").getUsername(),
                diaries.findByUsername("Username").getUsername());
    }

    @Test
    public void testThatDiaryCanBeDeleted(){
        diaries.add("Username", "password");
        diaries.add("Muiliyu", "password");
        diaries.add("Tomide", "password");


        assertEquals(new Diary("Username", "password").getUsername(),
                diaries.findByUsername("Username").getUsername());
        assertEquals(new Diary("Muiliyu", "password").getUsername(),
                diaries.findByUsername("Muiliyu").getUsername());
        assertEquals(new Diary("Tomide", "password").getUsername(),
                diaries.findByUsername("Tomide").getUsername());

        diaries.delete("Muiliyu", "password");
        assertThrows(IllegalArgumentException.class, () -> {diaries.findByUsername("Muiliyu").getUsername();});

    }

}
