package ep65_Lambda.cp65_noReturnLambda;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btnOk = new Button();
		
		btnOk.setClickListener(()-> {
			System.out.println("Ok 버튼을 클릭했습니다");
		});
		
		btnOk.click();
		
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(()-> {
			System.out.println("cancel 버튼을 클릭햇습니다");
		});
		
		btnCancel.click();

	}

}
