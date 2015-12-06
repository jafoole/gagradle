package org.gradle;

/**
 * Created by kgalligan on 12/2/15.
 */
public class App
{


	public static void main(String[] args) throws InterruptedException
	{
		for(int i=-20; i<35; i++)
		{
			StringBuilder stringBuilder = new StringBuilder();
			if(i<0)
			{
				stringBuilder.append("<}");
				for (int j = 0; j < 31; j++)
				{
					stringBuilder.append(' ');
				}
				stringBuilder.append("#");
			}
			else if(i<29)
			{
				stringBuilder.append(" }");
				for (int j = 0; j < i; j++)
				{
					stringBuilder.append(' ');
				}
				stringBuilder.append("->");
				for (int j = i; j < 29; j++)
				{
					stringBuilder.append(' ');
				}
				stringBuilder.append('#');
			}
			else
			{
				stringBuilder.append(" }");
				for (int j = 0; j < 31; j++)
				{
					stringBuilder.append(' ');
				}
				stringBuilder.append("*");
			}

			System.out.println(stringBuilder.toString());
			Thread.sleep(50);

		}
	}
}



