
abstract class MediaItem extends Item{
	private int runTime;
	public MediaItem(int id, int copy, String name, int runTime) {
		super(id, copy, name);
		this.runTime=runTime;
	}
	public void getRunTime() {
		System.out.println("Running Time : "+runTime);
	}
}
