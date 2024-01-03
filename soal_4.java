package latihan_array_2d;

public class soal_4 {

	public static void main(String[] args) {
		
		int [][] angka = {{7,3,8,},
				          {4,2,5,}};
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j+=2) {
				System.out.print(angka[i][j]+" ");
			}
			System.out.println();
		}

	}

}
