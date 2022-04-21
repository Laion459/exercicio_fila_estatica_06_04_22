package orientada.a.objetos;

import java.util.Arrays;
import java.util.Objects;

public class Row {
    private int count;
    private Object[] elements;
    private int head;
    private int end;

    private  int max;

    public Row (){}

    public Row(int max) {
        count = 0;
        elements = new Object[max];
        head = 0;
        end = 0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(String[] elements) {
        this.elements = elements;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Row)) return false;
        Row row = (Row) o;
        return getCount() == row.getCount() && getHead() == row.getHead() && getEnd() == row.getEnd() && Arrays.equals(getElements(), row.getElements());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getCount(), getHead(), getEnd());
        result = 31 * result + Arrays.hashCode(getElements());
        return result;
    }

    @Override
    public String toString() {
        return "Row{" +
                "count=" + count +
                ", elements=" + Arrays.toString(elements) +
                ", head=" + head +
                ", end=" + end +
                '}';
    }

    // verificar se uma fila está vazia
    public boolean isEmpity(){
        return count == 0;
    }

    // verificar se há espaço na fila
    public boolean checkSpace(){
        return count != elements.length;
    }

    // Recuperar o número de elementos da fila
    public int numbersOfElements(){
        return count;
    }

    //  Verificar se um determinado elemento está na fila
    public boolean checksElement(Object element){
        for (int i = 0; i < getCount(); i++){
            if (elements[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    // Verificar se uma posição qualquer é válida
    public boolean checkPosition(int position){
        if (position >= 0 && position <= count){
            return true;
        }
        return false;
    }

    // Recuperar um elemento da fila pelo elemento
    public Object retrieveAnElement(Object element){
        if (checksElement(element)){
            for (int i = 0; i < getCount(); i++){
                if (elements[i].equals(element)){
                    return element;
                }
            }
        }
        return false;
    }

    // Recuperar um elemento da fila pelo index
    public Object retrieveAnElement(int index){
        if (checkPosition(index)){
            return elements[index];
        }
        return false;
    }


    //  Recuperar a posição de um elemento da fila
    public int regainAPosition(Object element){
        if (checksElement(element)){
            for (int i = 0; i < getCount(); i++){
                if (elements[i].equals(element)){
                    return i;
                }
            }
        }
        return -1;
    }


    // Recuperar o primeiro elemento da fila
    public Object retrieveTheFristElement(){
        return elements[head];
    }

    // Recuperar o último elemento da fila
    public Object retrieveTheLastElement(){
        return elements[end];
    }

    // Insere elementos
    public void insert(Object element){

        if (count == elements.length){
            System.out.println("OVERFLOW");
        }else {
            elements[count] = element;
            count++;
        }
    }

    public void add(Objects element){
        elements[end] = element;
        end = (end + 1) % elements.length;
        count++;
    }

    // Remove elementos pelo elemento
    public Object remove(Object element){
        if (count != 0 ){
            if (head == elements.length){
                head = 1;
            }else {
                head = head + 1;
            }
            element = elements[head];
            count--;
        }else {
            System.out.println("UNDERFLOW");
        }
        return element;
    }

    // Mostra os elementos da lista
    public void showList(){
        for (int i = 0; i < elements.length; i++ ){
            System.out.println("[" + ( i + 1 ) + "] Elemento: " + elements[i]);
        }
    }
}
