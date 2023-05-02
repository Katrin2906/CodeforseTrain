package Course;

public class SegregateEvenAndOdds {
    public Node divide(int N, Node head) {
        Node fNodeOdd = new Node(0);//головы листов
        Node fNodeEven = new Node(0);
        Node odd = fNodeOdd;//указатели
        Node even = fNodeEven;
        while (head != null) {
            if (head.data % 2 != 0) {//бежим по основному
                odd.next = head;//подцепляем узел к нечетным
                odd = odd.next;//переносим указатель на этот узел
            } else {
                even.next = head;
                even = even.next;
            }
            head = head.next;//сдвигаем на следующий узел
        }
        odd.next = null;//заканчиваем нечетный список
        even.next = fNodeOdd.next;//и подцепляем к нему четный
        return fNodeEven.next;//возвращаем первый узел четного листа

    }

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }
}
