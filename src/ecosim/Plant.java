package ecosim;

public class Plant extends Organism {
	public Plant(float x, float y, float size) {
		super(x, y, size);

		this.colorR = 50;
		this.colorG = 127;
		this.colorB = 50;
	}

	@Override
	public void update(Ecosystem ecosystem) {
//		this.size += 0.01;
	}
}
