import java.util.ArrayList;

class DigitalCamera implements CameraDetails {

  private String details;

  public DigitalCamera() {
    this.details = new String("Hello!");  
  }

  public String printDetails() {
    // return details.get("format");
    return this.details;
      
  }

}