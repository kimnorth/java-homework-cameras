import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {



  // Test that arrayList exists

  Photographer photographer;

  @Before
  public void before(){
    photographer = new Photographer("Steve");
  }

  @Test
  public void getBackName(){
    assertEquals( "Steve", photographer.getName() );
  }

  // Test adding a camera to ArrayList


  // Test removing a camera from ArrayList


  // Test printCamera against expected string


  //



}