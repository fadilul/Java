package latihan_array_2d;

public class soal_2 {

	public static void main(String[] args) {
		String[][]nama = {{"Budi","Tika"},
				          {"Dini","Siska"},
				          {"Dian","Joko"}};

		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j+=2) {
				System.out.print(nama[i][j]+" ");
			}
			System.out.println();
		}
	}	
}
