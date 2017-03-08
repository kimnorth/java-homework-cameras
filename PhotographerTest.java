import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {



  // Test that arrayList exists

  Photographer photographer;
  Camera holga;
  DigitalCamera canonT4i;

  @Before
  public void before(){
    photographer = new Photographer("Steve");
    holga = new Camera();
  }

  @Test
  public void getBackName(){
    assertEquals( "Steve", photographer.getName() );
  }

  @Test
  public void countArrayLength(){
    assertEquals( 0, photographer.countCameras() );
  }

  // Test adding a camera to ArrayList

  @Test
  public void hasCameraBeenAdded() {
    photographer.addCamera(holga);
    assertEquals( 1, photographer.countCameras() );
  }

  // Test removing a camera from ArrayList

  @Test
  public void hadCameraBeenRemoved() {
    photographer.addCamera(holga);
    photographer.removeCamera(holga);
    assertEquals(0, photographer.countCameras() );
  }

  // Test printCamera against expected string

  @Test
  public void printingCameraDetails() {
    photographer.addCamera(canonT4i);
    // System.out.println(canonT4i.details);
    assertEquals( "Hello!", photographer.printCameras() );
  }

  //



}