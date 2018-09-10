package myPack;

public class Camera extends Electronics{

	private int megaPixel;
	private String apperture;
	public Camera() {
		super();
	}
	public Camera(int id,int current,int megaPixel, String apperture) {
		super(id,current);
		this.megaPixel = megaPixel;
		this.apperture = apperture;
	}
	public int getMegaPixel() {
		return megaPixel;
	}
	public void setMegaPixel(int megaPixel) {
		this.megaPixel = megaPixel;
	}
	public String getApperture() {
		return apperture;
	}
	public void setApperture(String apperture) {
		this.apperture = apperture;
	}
	@Override
	public String toString() {
		return "Camera [megaPixel=" + megaPixel + ", apperture=" + apperture + "]";
	}
	
}
