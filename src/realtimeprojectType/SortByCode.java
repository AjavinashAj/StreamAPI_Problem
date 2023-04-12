package realtimeprojectType;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class SortByCode implements Comparator{
	public int compare(Object ob1,Object ob2)
	{
		Products p1=(Products)ob1;
		Products p2=(Products)ob2;
		int z=p2.getPId().compareTo(p1.getPId());
		if(z==0)return 0;
		else if(z>0)return 1;
		else return -1;
		
	}

}
