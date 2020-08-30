package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
   // private App app;
    private Map<String, String> cache;
    

    @Before
    public void 前準備(){
      // app = new App();
        cache = new LruCashMap<>(2);

        cache.put("a", "dataA");
        cache.put("b", "dataB");    

    }


    //a,b,cを加えaを削除
    @Test
    public void _detaset1() throws Exception
    {
        cache.put("c", "dataC");
        assertEquals("dataA", cache.get("a"));
    }
    
    
    //aがあるか確認
    @Test
    public void _detaset2_1() throws Exception
    {
        assertEquals("dataA", cache.get("a"));
    }

    //aが使われて、cを加えbが削除
    @Test
    public void _detaset2_2() throws Exception
    {
        cache.get("a");
        cache.put("c", "dataC");
        assertEquals("dataB", cache.get("b")); 
    }

}


