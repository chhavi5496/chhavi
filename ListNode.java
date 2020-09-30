public class ListNode
 {
	 

	
	private Object myData;

	
	private ListNode myNext;

	
	public ListNode()
	{	this(null, null);
	}

	public ListNode(Object data, ListNode next)
	{	myData = data;
		myNext = next;
	}

	
	
	public Object getData()
	{	return myData;	}

	
	public ListNode getNext()
	{	return myNext;	}


	
	public void setData(Object data)
	{	myData = data;	}

	
	public void setNext(ListNode next)
	{	myNext = next;	}
 }