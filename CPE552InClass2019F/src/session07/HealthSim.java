public class HealthSim {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
    p2.setHeart(p1.getHeart());
		
	}

	class Person {
		private Heart h;
		private Kidney[] kidneys;
		public Person() {
			h = new Heart();
			kidneys = new Kidney[2];
			kidney[0] = new Kidney(100);
			kidney[1] = new Kidney(100);
		}

		void setHeart(Heart h) {
			this.h = h;
		}
		public Heart getHeart() {
			return h;
		}
}
