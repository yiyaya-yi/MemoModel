package Mem;

/** 负责人类   负责保存备忘录 **/
public class Caretaker {
    private Memento memento;
    public Memento getMemento(){
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
