class Student
{
	int rollno;
	String name;
	void getdetails(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void putdetails()
	{
		System.out.println("Rollno & name is"+rollno +" "+name);
	}
}
class Test extends Student
{
	int subject1,subject2,subject3;
	void getmarks(int m1,int m2,int m3)
	{
		subject1=m1;
		subject2=m2;
		subject3=m3;
	}
	void putmarks()
	{
		System.out.println("Subject1 subject2 subject3 "+subject1 +" "+subject2 +" "+subject3);
	}
}
interface sports
{
	int sportswt=3;
	void putwt();
}
class result extends Test implements sports
{
	int total;
	public void putwt()
	{
		System.out.println("sports weight marks"+sportswt);
	}
	void display()
	{
		putdetails();
		putmarks();
		putwt();
		total=subject1+subject2+subject3;
		System.out.println("Total score is"+total);
	}
}
class intr
{
	public static void main(String args[])
	{
		result r1=new result();
		r1.getdetails(1,"xyz");
		r1.getmarks(35,50,60);
		r1.display();
	}
}
