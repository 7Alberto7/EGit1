package p1;

public class C1 {
	private int atr1;
	private int atr2;

	public C1(int atr1, int atr2) {
		this.atr1 = atr1;
		this.atr2 = atr2;
	}

	public int getAtr1() {
		return atr1;
	}

	public void setAtr1(int atr1) {
		this.atr1 = atr1;
	}

	public int getAtr2() {
		return atr2;
	}

	public void setAtr2(int atr2) {
		this.atr2 = atr2;
	}

	@Override
	public String toString() {
		return "C1 [atr1=" + atr1 + ", atr2=" + atr2 + "]";
	}
}
