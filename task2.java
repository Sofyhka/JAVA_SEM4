import java.util.LinkedList;
import java.util.Queue;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class task2{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        task2 t = new task2();
        t.enqueue(1, queue);
        t.enqueue(2, queue);
        t.enqueue(3, queue);
        System.out.println(queue);
        int firstRemuve = t.dequeue(queue);
        System.out.println(firstRemuve);
        System.out.println(queue); 
    }
    public void enqueue(Integer element, Queue<Integer> queue) {     
        queue.add(element);
    }
    
    public int dequeue(Queue<Integer> queue) {
        return queue.poll();
    }
    public int first(Queue<Integer> queue){
        return queue.peek();
    }
}

