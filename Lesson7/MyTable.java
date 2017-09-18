package lesson7;

public class MyTable 
{
	private Entry[] entries = new Entry[26];
	private Entry entry ;
	
	//returns the String that is matched with char c in the table 
	public String get(char c)
	{
		//implement 
		for(Entry e : entries)
		{
			if (e.ch == c)
			{
				return e.str;
			}
		}
		return null;
	} 
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) 
	{
		 //implement
		entry = new Entry(c,s);
		if(c == 'a')
		{
			entries[0] = entry;
		}
		else if(c == 'b')
		{
			entries[1] = entry;
		}
		else if(c == 'c')
		{
			entries[2] = entry;
		}
		else if(c == 'd')
		{
			entries[3] = entry;
		}
		else if(c == 'e')
		{
			entries[4] = entry;
		}
		else if(c == 'f')
		{
			entries[5] = entry;
		}
		else if(c == 'g')
		{
			entries[6] = entry;
		}
		else if(c == 'h')
		{
			entries[7] = entry;
		}
		else if(c == 'i')
		{
			entries[8] = entry;
		}
		else if(c == 'j')
		{
			entries[9] = entry;
		}
		else if(c == 'k')
		{
			entries[10] = entry;
		}
		else if(c == 'l')
		{
			entries[11] = entry;
		}
		else if(c == 'm')
		{
			entries[12] = entry;
		}
		else if(c == 'n')
		{
			entries[13] = entry;
		}
		else if(c == 'o')
		{
			entries[14] = entry;
		}
		else if(c == 'p')
		{
			entries[15] = entry;
		}
		else if(c == 'q')
		{
			entries[16] = entry;
		}
		else if(c == 'r')
		{
			entries[17] = entry;
		}
		else if(c == 's')
		{
			entries[18] = entry;
		}
		else if(c == 't')
		{
			entries[19] = entry;
		}
		else if(c == 'u')
		{
			entries[20] = entry;
		}
		else if(c == 'v')
		{
			entries[21] = entry;
		}
		else if(c == 'w')
		{
			entries[22] = entry;
		}
		else if(c == 'x')
		{
			entries[23] = entry;
		}
		else if(c == 'y')
		{
			entries[24] = entry;
		}
		else if(c == 'z')
		{
			entries[25] = entry;
		}
		
			
	}
	//returns a String consisting of nicely formatted display //of the contents of the table
	@Override
	public String toString() 
	{
		//implement
		//return null; 
		String s = "";
		for(Entry e : entries)
		{
			if(e != null)
				s += e.toString();
		}
		return s;
	}
	
	private class Entry 
	{
		char ch ;
		String str ;
		
		Entry(char ch, String str)
		{
			//implement
			this.ch = ch;
			this.str = str;
		}
		
		//returns a String of the form "ch->str" 
		public String toString() 
		{
			//implement
			//return null; 
			
			return ch + "->"+str+" \n";
		}
	}
	
	public static void main(String[] args)
	{
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b', "Billy");
		//t.add('c', "Charlie");
		t.add('w', "Willy");
		//t.add('b', "Bob");
		String s = t.get('b');
		System.out.println(s);
		//t.toString();
		System.out.println(t);
	}
}

/* Result
 Billy
a->Andrew 
b->Billy 
w->Willy 
 */