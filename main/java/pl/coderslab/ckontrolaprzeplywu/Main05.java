package pl.coderslab.ckontrolaprzeplywu;

public class Main05 {

	public static void main(String[] args) {

		int resultFor = 0;
		int resultWhile = 0;

		for (int i=1; i<11; i++){
			resultFor += i;
			}
		System.out.println(resultFor);

		int j = 0;
		while (j < 10) {
			j++;
			resultWhile += j;
		}
		System.out.println(resultWhile);
		}

	}
