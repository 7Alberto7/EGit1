package p1;

public class C2 {
	private String atr1;
	private String atr2;

	public C2(String atr1, String atr2) {
		this.atr1 = atr1;
		this.atr2 = atr2;
	}

	public String getAtr1() {
		return atr1;
	}

	public void setAtr1(String atr1) {
		this.atr1 = atr1;
	}

	public String getAtr2() {
		return atr2;
	}

	public void setAtr2(String atr2) {
		this.atr2 = atr2;
	}

	@Override
	public String toString() {
		return "C2 [atr1=" + atr1 + ", atr2=" + atr2 + "]";
	}
}
