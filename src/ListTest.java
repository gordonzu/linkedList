import org.junit.* ;
import static org.junit.Assert.* ;
import org.xulu.List;

public class ListTest {

  @Test
  public void test_list_is_not_null() {
     List list = List.listFactory();
     assertNotNull(list);
  }

  @Test
  public void test_list_is_empty() {
      List list = List.listFactory();
      assertTrue(list.isEmpty());
  }

  @Test
  public void test_list_is_not_empty_after_add() {
      List list = List.listFactory();
      list.addElement(99);
      assertFalse(list.isEmpty());
  }

  @Test
  public void test_list_has_size_one_after_add() {
      List list = List.listFactory();
      list.addElement(99);
      assertEquals(list.getSize(), 1);
  }

  @Test
  public void test_list_returns_value_after_add() {
      List list = List.listFactory();
      list.addElement(99);
      assertEquals(list.getElementData(1), 99);
  }
  
  @Test
  public void test_list_returns_size_after_multiple_adds() {
      List list = List.listFactory();
      list.addElement(11);
      list.addElement(22);
      list.addElement(33);
      list.addElement(44);
      list.addElement(55);
      assertEquals(list.getSize(), 5);
  }
  
  @Test
  public void test_list_returns_indexed_data_after_multiple_adds() {
      List list = List.listFactory();
      list.addElement(11);
      list.addElement(22);
      list.addElement(33);
      list.addElement(44);
      list.addElement(55);
      assertEquals(list.getElementData(3), 33);
  }
  
  @Test
  public void test_list_returns_indexed_data_after_indexed_add() {
      List list = List.listFactory();
      list.addElement(11);
      list.addElement(22);
      list.addElement(33);
      list.addElement(44);
      list.addElement(55);
      list.addElementAt(999, 3);
      assertEquals(6, list.getSize());
      assertEquals(999, list.getElementData(3));
  }

  @Test
  public void test_list_returns_indexed_data_after_delete() {
      List list = List.listFactory();
      list.addElement(11);
      list.addElement(22);
      list.addElement(33);
      list.addElement(44);
      list.addElement(55);
      list.deleteElement();
      assertEquals(4, list.getSize());
      assertEquals(44, list.getElementData(list.getSize()));
  }
  
  @Test
  public void test_list_returns_data_after_indexed_delete() {
      List list = List.listFactory();
      list.addElement(11);
      list.addElement(22);
      list.addElement(33);
      list.addElement(44);
      list.addElement(55);
      list.deleteElementAt(3);
      assertEquals(4, list.getSize());
      assertEquals(44, list.getElementData(3));
  }

  @Test
  public void test_all_list_elements_are_deleted() {
      List list = List.listFactory();
      list.addElement(11);
      list.addElement(22);
      list.addElement(33);
      list.addElement(44);
      list.addElement(55);
      list.deleteAll();
      assertEquals(0, list.getSize());
  }

    @Test
    public void test_printing_a_multi_element_list() { 
        List list = List.listFactory();
        list.addElement(11);
        list.addElement(22);
        list.addElement(33);
        list.addElement(44);
        list.addElement(55);
        list.printList();
        assertEquals("(11, 22, 33, 44, 55)", list.printList());
    }
    
    @Test
    public void test_printing_an_empty_list() { 
        List list = List.listFactory();
        list.printList();
        assertEquals("empty list", list.printList());
    }

    @Test
    public void test_printing_a_one_element_list() { 
        List list = List.listFactory();
        list.addElement(999);
        list.printList();
        assertEquals("(999)", list.printList());
    }
    
    @Test
    public void test_printing_indexed_element_from_list() { 
        List list = List.listFactory();
        list.addElement(999);
        list.addElement(11);
        list.addElement(22);
        list.addElement(33);
        list.addElement(44);
        list.addElement(55);
        assertEquals("(22)", list.printList(3));
    }



} 










