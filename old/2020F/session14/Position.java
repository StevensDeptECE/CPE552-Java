public Position {
	double qty;
	Stock s;

	public double getValue() {
		return s.getPrice() * qty;
	}
}
