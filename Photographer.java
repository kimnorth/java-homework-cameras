import java.util.ArrayList;

public class Photographer {

  private ArrayList<CameraDetails> cameras;
  private String name;

    public Photographer(String name) {
      this.cameras = new ArrayList<CameraDetails>();
      this.name = name;
    }

    public String getName() {
      return this.name;
    }

    public int countCameras() {
      return this.cameras.size();
    }

    public void addCamera(CameraDetails camera) {
      cameras.add(camera);
    }

    public void removeCamera(Camera camera) {
      cameras.remove(camera);
    }

    public String printCameras() {

      for (CameraDetails camera : cameras) {
        camera.printDetails();
      }

      return "Hello!";
      
      // NOT WORKING!!!
    }

}