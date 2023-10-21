package Assignments;

import java.util.ArrayList;
import java.util.List;

public class UndoableStringBuilder {

    private StringBuilder startWord;
    private List<String> undoList = new ArrayList<>();

    public UndoableStringBuilder(String newWord) {
        this.startWord = new StringBuilder(newWord);
    }

    public UndoableStringBuilder() {
        this.startWord = new StringBuilder();
    }

    public static void main(String[] args) {
        UndoableStringBuilder usb = new UndoableStringBuilder();
        usb.append("to be or not to be");
        System.out.println(usb);

        usb.replace(3, 5, "eat");
        System.out.println(usb);

        usb.replace(17, 19, "eat");
        System.out.println(usb);

        usb.reverse();
        System.out.println(usb);

        usb.undo();
        System.out.println(usb);

        usb.undo();
        System.out.println(usb);

        usb.undo();
        System.out.println(usb);
    }

    public StringBuilder undo() {
        String word = "";
        int previous = undoList.size() - 1;
        startWord = new StringBuilder(undoList.get(previous));
        undoList.remove(previous);
        return new StringBuilder(word);
    }

    public StringBuilder append(String word) {
        makeUndoable(startWord.toString());
        startWord.append(word);
        return startWord;
    }

    public StringBuilder replace(int start, int end, String word) {
        makeUndoable(startWord.toString());
        startWord.replace(start, end, word);
        return startWord;
    }

    public StringBuilder reverse() {
        makeUndoable(startWord.toString());
        startWord.reverse();
        return startWord;
    }

    public StringBuilder insert(int offset, String word) {
        makeUndoable(startWord.toString());
        startWord.insert(offset, word);
        return startWord;
    }

    private void makeUndoable(String word) {
        undoList.add(word);
    }

    @Override
    public String toString() {
        return startWord.toString();
    }
}
