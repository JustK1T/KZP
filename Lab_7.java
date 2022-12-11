public interface Numbers
{
    int getDecValue();
    void PrintInfo();
}
public class BinaryNumbers implements Numbers
{
    private String number;
    private int value;


    public BinaryNumbers(String number, int value) {
        this.number = number;
        this.value = value;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int getDecValue() {
        return value;
    }

    @Override
    public void PrintInfo() {
        System.out.println("Number in binary: " + number + ",\tvalue in dec: " + value);
    }
}



public class HexNumbers implements Numbers
{
    private String number;
    private int value;


    public HexNumbers(String number, int value) {
        this.number = number;
        this.value = value;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int getDecValue() {
        return value;
    }

    @Override
    public void PrintInfo() {
        System.out.println("Number in hex: " + number + ",\tvalue in dec: " + value);
    }
}

public class LinkedList<T extends Numbers> {
    Node<T> head;

    static class Node<T extends Numbers> {
        T data;
        Node<T> next;
        Node(T d)
        {
            data = d;
            next = null;
        }
    }

    public void insert(T data)
    {
        Node<T> new_node = new Node<T>(data);
        new_node.next = null;

        if (this.head == null) {
            this.head = new_node;
        }
        else {
            Node<T> last = this.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }
    }

    public void printList()
    {
        Node<T> currNode = this.head;

        System.out.print("LinkedList: \n");

        while (currNode != null) {
            System.out.print(" ");
            currNode.data.PrintInfo();
            currNode = currNode.next;
        }
    }

    public T FindMax() //метод для пошуку максимального об'єкта
    {
        Node<T> maxNode = this.head;
        T data = null;
        while (maxNode.next != null) {
           if(maxNode.data.getDecValue() < maxNode.next.data.getDecValue())
               data = maxNode.data;

           maxNode = maxNode.next;
        }
        return data;
    }
}
public class Main {
    public static void main(String[] args) {
        LinkedList<? super Numbers> list = new LinkedList<>();

        list.insert(new HexNumbers("14D", 333));
        list.insert(new BinaryNumbers("1 0110 0100 0011", 5699));
        list.insert(new HexNumbers("593A", 22842));
        list.insert(new HexNumbers("19BD", 6589));
        list.insert(new BinaryNumbers("11 1101 1000", 984));
        list.insert(new HexNumbers("E2F4", 58100));
        list.insert(new BinaryNumbers("11 0101 1000", 856));
        list.insert(new BinaryNumbers("10 0101 0111", 599));
        list.insert(new HexNumbers("15C1", 5569));
        list.insert(new BinaryNumbers("10 1001 1101", 669));

        list.printList();
    }
}
