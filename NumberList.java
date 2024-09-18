public class NumberList 
{
	private Integer[] list;
	private int size;
	
	public NumberList()
	{
	  list = new Integer[2];
	  size=0;
	}

	public int size() 
	{
		return size;
	}

	public boolean isEmpty() 
	{
		if(size==0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public String toString()
	{
		 String temp= "[";
         for (int i = 0; i < size; i++)
         {
         temp += list[i];
          if (i < size - 1)
          {
        	  temp += ", ";
          }
         }
         temp += "]";
         return temp;
    }
    private void doubleCapacity()
	{
		Integer[] backlist= new Integer[size*2];
		for(int i=0;i<size;i++)
		{
			backlist[i]=list[i];
		}
		list=backlist;
		
	}
	public void add(int index, Integer val)
	{
		if (index> size || index<0)
		{
			throw new IndexOutOfBoundsException();
		}
		if (size==list.length) 
		{
			doubleCapacity();
		}
		for (int i= size; i>index;i--)
		{
			list[i]=list[i-1];
		}
		list[index]=val;
		size++;
	 }
	public boolean add (Integer element)
	{
		add(size, element);
		return true;	
	}
	Integer get (int index)
	{
		if (index> size || index<0)
		{
			throw new IndexOutOfBoundsException();
		}
		return list[index];
	}
	Integer set (int index, Integer val)
	{
		if (index> size || index<0)
		{
			throw new IndexOutOfBoundsException();
		}
		list[index]=val;
		return list[index];
	}
	Integer remove (int index)
	{
		 if (index < 0 || index >size) 
		 {
	         throw new IndexOutOfBoundsException();
	     }
	        Integer remove = list[index];
	        for (int i = index; i < size - 1; i++)
	        {
	            list[i] = list[i + 1];
	        }
	        list[--size] = null;
	        return remove;
	     }
	 }
	


