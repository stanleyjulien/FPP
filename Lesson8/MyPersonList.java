package lesson8;



public class MyPersonList 
{
	private final int INITIAL_LENGTH = 4;
	//private String[] strArray; 
	private Person[] personArray;
	private int size;
	
	public MyPersonList() 
	{
		//strArray = new String[INITIAL_LENGTH];
		personArray = new Person[INITIAL_LENGTH]; // Initialize the array dimension
		size = 0;
	}
	
	//public void add(String s)
	public void add(Person p)
	{
		// Before you add you must check if you got room to put the value. If not we must add more room by resizing the array
		//if(size == strArray.length) resize();
		if(size == personArray.length) resize();
		personArray[size++] = p;
		//strArray[size++] = s;
	}
	
	public Person get(int i)
	{
		if(i < 0 || i >= size)
		{
			return null;
		}
		return personArray[i];//strArray[i];
	}
	
	public boolean find(String lastName)
	{
		for(Person p : personArray)
		{
			if(p.getLast().equals(lastName)) return true;
		}
		return false;
	}
	
	public void insert(Person p, int pos)
	{
		if(pos > size) return;
		if(pos >= personArray.length||size+1 > personArray.length) 
		{
			resize();
		}
		Person[] temp = new Person[personArray.length+1];
		System.arraycopy(personArray,0,temp,0,pos);
		temp[pos] = p;
		
		System.arraycopy(personArray,pos,temp,pos+1, personArray.length - pos);
		personArray = temp;
		++size;
		
	}
	
	public boolean remove(String lastName)
	{
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i )
		{
			if(personArray[i].getLast().equals(lastName))
			{
				index = i;
				break;
			}
		}
		
		if(index==-1) return false;
		Person[] temp = new Person[personArray.length];
		System.arraycopy(personArray,0,temp,0,index);
		System.arraycopy(personArray,index+1,temp,index,personArray.length-(index+1));
		personArray = temp;
		--size;
		return true;
	}
	
	
	private void resize()
	{
		System.out.println("resizing");
		int len = personArray.length;
		int newlen = 2*len;
		Person[] temp = new Person[newlen];
		System.arraycopy(personArray,0,temp,0,len);
		personArray = temp;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(personArray[i]+", ");
		}
		sb.append(personArray[size-1]+"]");
		
		return sb.toString();
	}
	
	
	public int size() {
		return size;
	}
	
		
	

	public static void main(String[] args) 
	{
		//MyStringList l = new MyStringList();
		MyPersonList l = new MyPersonList();
		l.add(new Person("Jack","Robert",30));
		l.add(new Person("Bob","Vaughn",50));
		l.add(new Person("Steve","Kent",45));
		l.add(new Person("Susan","Kate",21));
		l.add(new Person("Mark","Antony",55));
		l.add(new Person("Dave","Peter", 25));
		System.out.println("The list of size "+l.size()+" is "+l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.insert(new Person("Richard","Pau",15),3);
		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		l.insert(new Person("Tonya","Anny",16),0);
		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);
		System.out.println("Sorted set : ");
		
			
	}
}
