import java.util.ArrayList;

public class Photographer {

  private ArrayList<Camera> cameras;
  private String name;

    public Photographer(String name) {
      this.cameras = new ArrayList<Camera>();
      this.name = name;
    }

    public String getName() {
      return this.name;
    }

    public int countCameras() {
      return this.cameras.size();
    }

    public void addCamera(Camera camera) {
      cameras.add(camera);
    }

    public void removeCamera(Camera camera) {
      cameras.remove(camera);
    }

}