
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
			System.out.println("������ ������ ���� �ʽ��ϴ�.");return ;
		}
		for(int i=0;i<5;i++){
			double sum=0.0;
			for(int j=0;j<10;j++){
				if(Student[i][j]==Integer.parseInt(args[j])){
					sum+=score[j];
					answer[j]='O';
				}else answer[j]='X';
			}
			System.out.println("�л�"+(i+1)+"�� ���� : "+sum+"��");
			for(int k=0;k<10;k++)
				System.out.print(answer[k]);
			System.out.println();
		}

	}
	
}
