import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotSame;
import org.junit.jupiter.api.Test;
public class Junit1 {
  @Test
  public void SetUp(){
  String str = "klh";
  String str1 = "klh";
  String str2 = "edu";
  String str3 = "null";
  String str4 = "edu";
  String str5 = "";
  int val = 5;
  int val1 = 7;	
  String[] expectedArray = {"one","two","three"};
  String[] resultArray = {"one","two","three"};
  assertEquals(str,str1);
  assertTrue(val == val1);
  assertFalse(val == val1);
  assertSame(str,str1);
  assertNotSame(str,str4);
  assertArrayEquals(expectedArray,resultArray);
  assertNull(str1);
  assertNotNull(str5);
  
  }
}