import java.lang.annotation.*;
import java.lang.reflect.Method;

import annotations.*;

public class Main{
	
	public String execute() throws Throwable 
	{
		Class<CustomController> controller = CustomController.class;

		SortController sortcontroller = controller.getAnnotation(SortController.class);
		if(sortcontroller != null)
		{
			Method[] methods = controller.getMethods();
			for(Method method : methods)
			{
				Sort sort = method.getAnnotation(Sort.class);
				if(sort.invoke())
				{
					if(sort != null)
					{
						method.invoke(controller.newInstance());
					}
				}
			}
		}
		
		return null;
	}

	public static void main(String... args)
	{
		try
		{
		new Main().execute();
		} catch (Throwable e){}

	}
}