package ep65_Lambda.cp65_noReturnLambda;

public class Button {
	
	@FunctionalInterface
	public static interface ClickListener{
		void onCLick();
	}
	
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
		
	}
	
	public void click() {
		this.clickListener.onCLick();
	}
	

}
