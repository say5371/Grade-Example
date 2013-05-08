
public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int Student[][]={
				{1,3,2,4,3,1,4,2,2,1},{3,2,4,2,2,1,1,3,4,1},{2,4,3,2,1,2,1,3,3,4},
				{2,3,3,1,1,3,2,2,4,4},{3,1,1,2,4,1,2,3,1,3}
				};
		double score[]={5.5, 9.5, 10.0, 4.5, 5.5, 6.0, 4.0, 20, 15, 10};
		char answer[]=new char[10];
		if(args.length!=10){
			System.out.println("정답의 개수가 맞지 않습니다.");return ;
		}
		for(int i=0;i<5;i++){
			double sum=0.0;
			for(int j=0;j<10;j++){
				if(Student[i][j]==Integer.parseInt(args[j])){
					sum+=score[j];
					answer[j]='O';
				}else answer[j]='X';
			}
			System.out.println("학생"+(i+1)+"의 점수 : "+sum+"점");
			for(int k=0;k<10;k++)
				System.out.print(answer[k]);
			System.out.println();
		}

	}
	
}
