/* test */

package org.xulu;

public class List {
    private int size;
    private Element head;
    private Element tail;

    private List() {
        size = 0;
    }

    public static List listFactory() {
        return new List();
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    public int getSize() {
        return size;
    }

    public void addElement(int val) {
        Element newElement = new Element(val);
        if (this.getSize() == 0) {
            this.head = this.tail = newElement;
            this.head.setNext(this.tail);
            this.tail.setNext(null);
        } else {
            this.tail.setNext(newElement);
            this.tail = newElement;
        }
        size++;  
    }

    public void addElementAt(int val, int index) {
        Element newElement = new Element(val);
        Element tmp = this.head;
        for (int i = 2; i < index; i++)
            tmp = tmp.getNext();
        newElement.setNext(tmp.getNext());
        tmp.setNext(newElement);
        size++;
    }

    public void deleteElement() {
        Element tmp = this.head;
        for (int i = 2; i < this.getSize(); i++) 
            tmp = tmp.getNext();
        this.tail = tmp;
        Element old = tmp.getNext();
        old = null;
        this.tail.setNext(null);
        size--;
    }

    public void deleteElementAt(int index) {
        Element tmp = this.head;
        for (int i = 2; i < index; i++)
            tmp = tmp.getNext();
        Element old = tmp.getNext();
        tmp.setNext(old.getNext());
        old = null;
        size--;
    }

    public void deleteAll() {
        Element old = this.head;
        int x = this.getSize();
        for (int i = 1; i <= x; i++) {
            Element tmp = old.getNext();
            old = null;
            old = tmp;
            size--;
        }
    }

    public int getElementData(int index) {
        Element tmp = this.head;
        for (int i = 1; i < index; i++) 
            tmp = tmp.getNext();
        return tmp.getData();
    }

    public String printList() {
        if (this.isEmpty()) return "empty list";
        StringBuilder out = new StringBuilder();
        out.append("(");
        Element tmp = this.head;
        for (int i = 1; i <= this.getSize(); i++) {
            out.append(this.getElementData(i));
            if (i == this.getSize())
                break;
            out.append(", ");
        }
        out.append(")");
        return out.toString();
    }

    public String printList(int index) {
        StringBuilder out = new StringBuilder();
        out.append("(");
        out.append(this.getElementData(index));
        out.append(")");
        return out.toString();
    }
}

class Element {
      private int data;
      private Element next;

      public Element(int data) {
          this.data = data;
          this.next = null;
      }

      public int getData() {
          return this.data;
      }

      public void setNext(Element element) {
          this.next = element;
      }

      public Element getNext() {
          return this.next;
      }
}
