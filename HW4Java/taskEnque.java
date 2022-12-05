package HW4Java;

import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами
// :enqueue() - помещает элемент в конец очереди, dequeue() - 
// возвращает первый элемент из очереди и удаляет его, first() - 
// возвращает первый элемент из очереди, не удаляя.
public class taskEnque<E> {
    private LinkedList<Integer> linked_list;

    public taskEnque() {
        linked_list = new LinkedList<>();
    }

    public void size() {
        System.out.println(linked_list.size());
    }

    public void enqueue(int i) {
        linked_list.add(i);
    }

    public void dequeue() {
        System.out.println(linked_list.getFirst());
        linked_list.removeFirst();
    }

    public void first() {
        System.out.println(linked_list.getFirst());
    }
}
