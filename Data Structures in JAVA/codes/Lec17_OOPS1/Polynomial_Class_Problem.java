/*
 * Implement a polynomial class, that contains following functions -
1. setCoefficient -
This function sets coefficient for a particular degree value. If term with given degree is not there in the polynomial, then corresponding term (with specified degree and value) is added. If the term is already present in the polynomial, then previous coefficient value is replaced by given coefficient value.
2. add -
Adds two polynomials and returns a new polynomial which has the result.
3. subtract -
Subtracts two polynomials and returns a new polynomial which has the result.
4. multiply -
Multiplies two polynomials and returns a new polynomial which has the result.
5. print -
Prints all the terms (only terms with non zero coefficients are to be printed) in increasing order of degree.
Print pattern for a single term : "x"
And multiple terms should be printed separated by space. For more clarity, refer sample test cases.
Note : Only keep those terms which have non - zero coefficients.
Input Format:
The first line of input contains count of the number of coefficients in polynomial 1(C1)
The next line of input has C1 degrees for polynomial 1.
The next line of input has C1 coefficients for polynomial 1.  
The next line of input contains count of the number of coefficients in polynomial 2(C2)
The next line of input has C2 degrees for polynomial 2.
The next line of input has C2 coefficients for polynomial 2.  
The next line of input has the choice for the function you want to implement.
Output Format:
The output will be printed in case of print function same as that of print function format.
 */
package Lec17_OOPS1;

import java.util.Scanner;

class Polynomial {
	int da[] = new int[10000];
	private int len =10000;
	int maxdg = 0;
	private void doubleDA(){
		int temp[] = da;
		da = new int[2*len];
		for(int i=0 ; i<len ; i++){
			da[i] = temp[i];
		}
		len = 2 * len;
	}
	public void setCoefficient(int degree, int coeff){
		if(degree >=len){
			doubleDA();
		}
		da[degree] = coeff;
		if(degree >maxdg){
			maxdg = degree;
		}
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		for(int i=0 ; i<=maxdg ; i++){
			if(da[i] !=0){
				System.out.print(da[i]+"x"+i+" ");
			}
		}
		System.out.println();
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
		Polynomial result = new Polynomial();
		int i = 0;
		while (i <= this.maxdg && i <= p.maxdg) {
			if (i >= result.len) {
				result.doubleDA();
			}
			result.da[i] = this.da[i] + p.da[i];
			i++;
		}
		while (i <= this.maxdg) {
			result.da[i] = this.da[i];
			i++;
		}
		while (i <= p.maxdg) {
			result.da[i] = p.da[i];
			i++;
		}
		result.maxdg = i - 1;
		return result;	
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
		Polynomial result = new Polynomial();
		int i = 0;
		while(i<=this.maxdg && i<=p.maxdg) {
			if(i>=result.len){
				result.doubleDA();
			}
			result.da[i] = this.da[i] - p.da[i];
			i++;
		}
		while(i<= this.maxdg){
			result.da[i] = this.da[i];
			i++;
		}
		while (i <= p.maxdg) {
			result.da[i] = -1 * p.da[i];
			i++;
		}
		result.maxdg = i-1;
		return result;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		Polynomial result = new Polynomial();
		for(int i = 0 ; i<=this.maxdg; i++){
			for(int j=0 ; j<= p.maxdg ; j++){
				if (i+j >= result.len) {
					result.doubleDA();
				}
				result.da[i+j] = result.da[i+j] + (this.da[i] * p.da[j]);
			}
		}
		result.maxdg = this.maxdg + p.maxdg;
		return result;
	}
}

public class Polynomial_Class_Problem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
}
/*
Sample Input 1 :
P1 : 1x2 2x3 4x6 
P2 : 3x4 1x2
Sample Output 1 :
P1 + P2 = 2x2 2x3 3x4 4x6
Sample Input 2 :
P1 : 1x2 2x3 4x6 
P2 : 3x4 1x2
Sample Output 2 :
P1 - P2 = 2x3 -3x4 4x6

Sample Input
3
3 1 7
1 2 3
2
2 1
7 8
2
Sample Output
-6x1 -7x2 1x3 3x7 

Sample Input
3
3 1 7
1 2 3
2
2 1
7 8
1
Sample Output
10x1 7x2 1x3 3x7 

Sample Input
3
3 1 7
1 2 3
2
2 1
7 8
3
Sample Output
16x2 14x3 8x4 7x5 24x8 21x9 

*/