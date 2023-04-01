import annotations.*;

@SortController(strategy = TYPE.MERGE)
public class CustomController
{
	@Sort(invoke=true)
	public String method() 
	{
		List<Integer> list = Arrays.asList(1,5,2,3,9,0);
		return list;
	}
}
