package day10_1;

public abstract class Samsung implements Phone{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Calling");
	}

	@Override
	public abstract void clickPhotos();

}
