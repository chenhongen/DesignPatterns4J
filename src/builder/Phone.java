package builder;

/**
 * ��Ʒ��
 * @author che
 *
 */
public class Phone {
	private int CAMERA;
	private int CPU;
	private int SCREEN;
	// ...
	
	public int getCAMERA() {
		return CAMERA;
	}
	public void setCAMERA(int cAMERA) {
		CAMERA = cAMERA;
	}
	public int getCPU() {
		return CPU;
	}
	public void setCPU(int cPU) {
		CPU = cPU;
	}
	public int getSCREEN() {
		return SCREEN;
	}
	public void setSCREEN(int sCREEN) {
		SCREEN = sCREEN;
	}
	
	@Override
	public String toString() {
		return this.getCAMERA() + "������ͷ + " + this.getCPU() 
			+ "��CPU + " + this.getSCREEN() + "�ֱ���";
	}
}
