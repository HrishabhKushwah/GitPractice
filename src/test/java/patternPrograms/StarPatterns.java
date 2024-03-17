package patternPrograms;

//	*		1
//	**		2
//	***		3
//	****	4
//	*****	5

public class StarPatterns {
	public static void main1(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

/*********************************************/
//	*****
//	****
//	***
//	**
//	*
public static void main2(String[] args) {
	for(int i=5; i>=1; i--) {
		for(int j=1; j<=i ; j++) {
			System.out.print("*");
		}
		System.out.println();
		}
	}

/*********************************************/
public static void main(String[] args) {
	for(int i=5; i>=1; i--) {
		for(int j=5; j>=i ; j--) {
			System.out.print("*");
		}
		System.out.println();
		}
	}
}