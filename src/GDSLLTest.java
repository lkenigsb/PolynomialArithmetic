/*
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class GDSLLTest
{
    @org.junit.jupiter.api.Test
    void remove()
    {
        System.out.printf("remove");
        GDSLL<Integer> list = new GDSLL<>();
        boolean actual = list.remove(10);
        assertEquals(false, actual);
        list.insert(1);
        actual = list.remove(0);
        assertEquals(false, actual);
        assertEquals("->1<->", list.toString());
        actual = list.remove(2);
        assertEquals(false, actual);
        actual = list.remove(1);
        assertEquals(true, actual);
        assertEquals("->", list.toString());
        list.insert(2);
        list.insert(4);
        actual = list.remove(0);
        assertEquals(false, actual);
        assertEquals(list.toString(), "->2<->4<->");
        actual = list.remove(3);
        assertEquals(false, actual);
        assertEquals(list.toString(), "->2<->4<->");
        actual = list.remove(5);
        assertEquals(false, actual);
        assertEquals(list.toString(), "->2<->4<->");
        actual = list.remove(2);
        assertEquals(true, actual);
        assertEquals(list.toString(), "->4<->");
        list.insert(2);
        actual = list.remove(4);
        assertEquals(true, actual);
        assertEquals(list.toString(), "->2<->");
        list.insert(4);
        list.insert(6);
        actual = list.remove(1);
        assertEquals(false, actual);
        assertEquals(list.toString(), "->2<->4<->6<->");
        actual = list.remove(3);
        assertEquals(false, actual);
        assertEquals(list.toString(), "->2<->4<->6<->");
        actual = list.remove(5);
        assertEquals(false, actual);
        assertEquals(list.toString(), "->2<->4<->6<->");
        actual = list.remove(7);
        assertEquals(false, actual);
        assertEquals(list.toString(), "->2<->4<->6<->");
        actual = list.remove(2);
        assertEquals(true, actual);
        assertEquals(list.toString(), "->4<->6<->");
        list.insert(2);
        actual = list.remove(4);
        assertEquals(true, actual);
        assertEquals(list.toString(), "->2<->6<->");
        list.insert(8);
        assertEquals("->2<->6<->8<->", list.toString());
        actual = list.remove(8);
        assertEquals(true, actual);
        assertEquals(list.toString(), "->2<->6<->");
    }

    void insert()
    {
        System.out.printf("insert");
        GDSLL<Integer> list = new GDSLL<>();
        assertEquals(list.toString(), "->");
        list.insert(2);
        assertEquals(list.toString(), "->2<->");
        list.insert(1);
        assertEquals(list.toString(), "->1<->2<->");
        list = new GDSLL<>();
        list.insert(2);
        list.insert(2);
        assertEquals(list.toString(), "->2<->2<->");
        list = new GDSLL<>();
        list.insert(2);
        list.insert(3);
        assertEquals(list.toString(), "->2<->3<->");
        list = makeList24();
        assertEquals(list.toString(), "->2<->4<->");
        list.insert(1);
        assertEquals(list.toString(), "->1<->2<->4<->");
        list = makeList24();
        list.insert(2);
        assertEquals(list.toString(), "->2<->2<->4<->");
        list = makeList24();
        list.insert(3);
        assertEquals(list.toString(), "->2<->3<->4<->");
        list = makeList24();
        list.insert(4);
        assertEquals(list.toString(), "->2<->4<->4<->");
        list = makeList24();
        list.insert(5);
        assertEquals(list.toString(), "->2<->4<->5<->");
        list = makeList246();
        assertEquals("->2<->4<->6<->", list.toString());
        list.insert(1);
        assertEquals("->1<->2<->4<->6<->", list.toString());
        list.insert(1);
        assertEquals("->1<->1<->2<->4<->6<->", list.toString());
        list.insert(2);
        assertEquals("->1<->1<->2<->2<->4<->6<->", list.toString());
        list = makeList246();
        list.insert(3);
        assertEquals("->2<->3<->4<->6<->", list.toString());
        list.insert(4);
        assertEquals("->2<->3<->4<->4<->6<->", list.toString());
        list.insert(5);
        assertEquals("->2<->3<->4<->4<->5<->6<->", list.toString());
        list = makeList246();
        list.insert(6);
        assertEquals("->2<->4<->6<->6<->", list.toString());
        list.insert(7);
        assertEquals("->2<->4<->6<->6<->7<->", list.toString());
    }

    private GDSLL<Integer> makeList24()
    {
        GDSLL<Integer> list = new GDSLL<>();
        list.insert(2);
        list.insert(4);
        return list;
    }

    private GDSLL<Integer> makeList246()
    {
        GDSLL<Integer> list = makeList24();
        list.insert(6);
        return list;
    }
}
*/