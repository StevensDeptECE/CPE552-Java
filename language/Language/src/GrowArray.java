public class GrowArray<T> {
	private T[] p;
	private int used;
	public GrowArray(int initialSize) {
		p = (T[])new Object[initialSize];
		used = 0;
	}
	public void addEnd(T v) {
		p[used++] = v;
	}

	public static void main(String[] args) {
		GrowArray<Integer> a = new GrowArray<>(10);
		a.addEnd(5);
		a.addEnd(4);
		a.addEnd(3);
	}
}
