import java.io.Serializable;

public class Camera implements Serializable{

	private int megaPixel;

	public Camera() {
		super();
	}

	public Camera(int megaPixel) {
		super();
		this.megaPixel = megaPixel;
	}

	public int getMegaPixel() {
		return megaPixel;
	}

	public void setMegaPixel(int megaPixel) {
		this.megaPixel = megaPixel;
	}

	@Override
	public String toString() {
		return "Camera [megaPixel=" + megaPixel + "]";
	}
}
