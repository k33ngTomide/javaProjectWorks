package DiaryAppTest;

import DiaryApp.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    private Diary diary;

    @BeforeEach
    public void setUp(){
        diary = new Diary("Username", "password");
    }

    @Test
    public void testThatDiaryExits(){
        assertNotNull(diary);
    }

    @Test
    public void testThatNewDiaryNotLocked(){
        assertFalse(diary.isLocked());
    }

    @Test
    public void testThatDiaryCanBeLocked(){
        assertFalse(diary.isLocked());

        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void testThatDiaryCanBeUnlocked(){
        assertFalse(diary.isLocked());

        diary.lockDiary();
        assertTrue(diary.isLocked());

        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

    }

    @Test
    public void testThatDiaryCreateEntry(){
        assertFalse(diary.isLocked());

        diary.createEntry("My Story Today", "I slept and coded all day");
        assertEquals(new Entry(1, "My Story Today", "I slept and coded all day"),
                diary.findEntryById(1));

    }

    @Test
    public void testThatDiaryCanCreateMoreEntries(){
        assertFalse(diary.isLocked());

        diary.createEntry("My Story Today", "I slept and coded all day");
        diary.createEntry("My Story LastWeek", "I burnt Egg while Boiling it");
        diary.createEntry("Another One", "We the Best Music");

        assertEquals(new Entry(1, "My Story Today", "I slept and coded all day"),
                diary.findEntryById(1));

        assertEquals(new Entry(2, "My Story LastWeek", "I burnt Egg while Boiling it"),
                diary.findEntryById(2));

        assertEquals(new Entry(3, "Another One", "We the Best Music"),
                diary.findEntryById(3));

    }

    @Test
    public void testThatExceptionIsThrownIfEntryIsNotFound(){
        assertFalse(diary.isLocked());

        assertThrows(IllegalArgumentException.class, ()-> diary.findEntryById(1));
    }

    @Test
    public void testThatEntryCanBeDeleted_AndTryingToQueryADeletedEntryThrowsAnException(){
        assertFalse(diary.isLocked());

        diary.createEntry("My Story Today", "I slept and coded all day");
        diary.createEntry("My Story LastWeek", "I burnt Egg while Boiling it");
        diary.createEntry("Another One", "We the Best Music");

        assertEquals(new Entry(1, "My Story Today", "I slept and coded all day"),
                diary.findEntryById(1));

        assertEquals(new Entry(2, "My Story LastWeek", "I burnt Egg while Boiling it"),
                diary.findEntryById(2));

        assertEquals(new Entry(3, "Another One", "We the Best Music"),
                diary.findEntryById(3));

        diary.delete(2);
        assertThrows(IllegalArgumentException.class, ()->diary.findEntryById(2));

    }

    @Test
    public void testThatEntryCanBeUpdated(){
        assertFalse(diary.isLocked());

        diary.createEntry("My Story Today", "I slept and coded all day");
        diary.createEntry("My Story LastWeek", "I burnt Egg while Boiling it");
        diary.createEntry("Another One", "We the Best Music");

        assertEquals(new Entry(1, "My Story Today", "I slept and coded all day"),
                diary.findEntryById(1));

        assertEquals(new Entry(2, "My Story LastWeek", "I burnt Egg while Boiling it"),
                diary.findEntryById(2));

        assertEquals(new Entry(3, "Another One", "We the Best Music"),
                diary.findEntryById(3));

        diary.update(1, "My Story for yesterday", "I slept and coded all day, it was a great day");
        assertEquals(new Entry(1, "My Story for yesterday", "I slept and coded all day, it was a great day"),
                diary.findEntryById(1));

    }



}
