package IfElseStatement.ifStmnt;

public class IfelseIfStmnt {
public static void main(String[] args) {
	int m =72;
	
	if (m<50) {
		System.out.println("Fail");
		
	} else if(m>=50 && m<60){
		System.out.println("D Grade");
	} else if(m>=60 && m<70){
		System.out.println("C Grade");
	} else if(m>=70 && m<80){
		System.out.println("B Grade");
	} else if(m>=80 && m<100){
		System.out.println("A Grade");
		
	}else{
		System.out.println("Invalid");
	}
}

}
