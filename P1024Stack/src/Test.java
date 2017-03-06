import java.util.Scanner;

//스택 짜보기

class Stack {
	
	int[] stArray;
	int top;
	
	public Stack(int size)
	{
		stArray = new int[size];
		this.top=-1;	

	}
	
	public void push()
	{
		IsFull();
		if(IsFull()==true)
		{
			top++;
			stArray[top]=(int)(Math.random()*100)+1;		
			System.out.println("stArray["+top+"] = "+stArray[top]);
			
		}else
			
		{
			System.out.println("스택이 꽉 차있습니다.");
			
		}
	}
	
	public boolean IsFull()
	{
		
		if(this.top==stArray.length-1)
		{
			return false;
			
		}else
			
			return true;	
		
	}
	
	public void pop()
	{
		isEmpty();
		
		if(isEmpty()==true){
			
			stArray[top]=0;
			System.out.println("stArray["+top+"] = "+stArray[top]);
			top--;	
			
		}else
		{
			System.out.println("스택이 비어있습니다.");		
		}
		
	}
	
	public boolean isEmpty()
	{
		if(this.top<0)
		{
			return false;
			
		}else
		{
			
			return true;
		}
		
	}
	
	public void dump()
	{
		for(int i = this.top; i>-1; i--)
		{
			System.out.println(stArray[i]);
			
		}
	}
	
	
	public void play()
	{
		int choose;
		String result;
		Scanner chooseScan = new Scanner(System.in);
		Scanner resultScan = new Scanner(System.in);
		while(true){
	
			System.out.print("[1]push  [2]pop  [3]dump  [4]exit  :   ");
			choose = chooseScan.nextInt();
			
			if(choose==1)
			{
				push();
				
			}else if(choose ==2)
			{
				pop();
				
			}else if(choose==3)
			{
				dump();
				
			}else if(choose==4)
			{
				System.out.print("정말 종료하시겠습니까 ? Y/N   ");
			
				result = resultScan.next();
				if(result.equals("Y") || result.equals("y"))
				{
					break;
				}else
				{
					System.out.println("다시 번호를 입력하세요");
				//	System.out.print("[1]push  [2]pop  [3]dump  [4]exit  :   ");				

				}
				
			}
		}
		
	}
	
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size; 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("스택의 사이즈를 입력하세요 : ");
		size = scan.nextInt();
		
		Stack st = new Stack(size);
		st.play();

	}

}
















