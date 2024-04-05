package myfirstpoject;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class LoL
{
 
	public static String[] assassinCharList = LolCharacter.AssassinLolCharacter();
	public static String[] warriorCharList = LolCharacter.WarriorLolCharacter();
	public static String[] mageCharList =LolCharacter.MageLolCharacter();
	public static String[] adCharList = LolCharacter.AdLolCharacter();
	public static String[] supporterCharList = LolCharacter.SupporterLolCharacter();
	public static String[] tankerCharList = LolCharacter.TankerLolCharacter();
	public static Scanner sc =new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, IOException 
		{
		// 하트 패턴을 출력하는 Java 프로그램
				final String message ="I will suggestion LoLChamp for you.";
				final int n = 10;
				
				for (int i = 0; i < n; i++)
				{
					for (int j = 0; j <= 4 * n; j++)
					{
						double d1 = Math.sqrt(Math.pow(i - n, 2) + Math.pow(j - n, 2));
						double d2 = Math.sqrt(Math.pow(i - n, 2) + Math.pow(j - 3 * n, 2));
						
						if (d1 < n + 0.5 || d2 < n + 0.5) {
							System.out.print('*');
						}
						else {
							System.out.print(' ');
						}
					}
					System.out.print(System.lineSeparator());
				}
				
				for (int i = 1; i < 2 * n; i++)
				{
					for (int j = 0; j < i; j++) {
						System.out.print(' ');
					}
					
					for (int j = 0; j < 4 * n + 1 - 2 * i; j++)
					{
						if (i >= 2 && i <= 4)
						{
							int idx = j - (4 * n - 2 * i - message.length()) / 2;
							if (idx < message.length() && idx >= 0)
							{
								if (i == 3) {
									System.out.print(message.charAt(idx));
								}
								else {
									System.out.print(' ');
								}
							}
							else {
								System.out.print('*');
							}
						}
						else {
							System.out.print('*');
						}
					}
					System.out.print(System.lineSeparator());
				}
				//하트 끝 
			
			
				boolean flag=false;
				while(!flag) 
				{
					System.out.println("1.Assassin/암살자 캐릭터 추천  2.Warrior/전사 캐릭터 추천  3.Mage/마법사 캐릭터 추천"+"\n");
					System.out.println("4.Ad/원거리딜러 추천   5.Supporter/서포터 추천     6.Tanker/탱커 추천      7.종료 " );	

					int menu = sc.nextInt();
					switch(menu) 
					{
					//파일 만들어서 할 수있지만 파일 저장해서 파일불러오기로 하기로함
					case 1:
					saveList(assassinCharList, "assassinCharList.txt");//파일로 저장
					String[] list2 = loading("assassinCharList.txt"); // 저장된 파일을 list로 받아옴
					showAssassinChamp(list2);
					break;
					
					case 2:
					saveList(assassinCharList, "WarriorLolChamp.txt");
					String[] list3 = loading("WarriorLolChamp.txt");
					showWarriorChamp(list3);
					break;
					
					case 3:
					saveList(mageCharList, "MageLolCharacter.txt");
					String[] list =loading("MageLolCharacter.txt");
					showMageChamp(list);
					break;
					
					case 4:
					saveList(adCharList, "AdLolChamp.txt");
					String[] list1 =loading("AdLolChamp.txt");
					showAdChamp(list1);
					break;
					
					case 5:
					saveList(supporterCharList, "SupporterLolChamp.txt");
					String[] list4 =loading("SupporterLolChamp.txt");
					showSupporterChamp(list4);
					break;
					
					
					case 6:
					saveList(tankerCharList, "TankerLolChamp.txt");
					String[] list5 = loading("TankerLolChamp.txt");
					showTankerChamp(list5);
					break;
										
					case 7:flag=true;
					break;
					
					default:
					break;
					}
			}	
				
		}
	private static void PutNewAssassinChamp() 
	{
		LolCharacter.setLolcharname(adCharList);
	}
	
	public static void Log(Object[] obj) 
	{
		int index = (int)(Math.random()*((obj.length-1)-0+1)+0);
		for(Object data : obj) 
		{
			if(obj[index].equals(data)) 
			{
				System.out.println(data+"\n");
				break;
			} 
		}
	}
	private static void showAssassinChamp(String[] list2) 
	{
		Log(list2);
	}
	private static void showWarriorChamp(String[] list3) 
	{
		Log(list3);
	}

	private static void showMageChamp(String[] list) 
	{
		Log(list);
	}
	private static void showAdChamp(String[] list1) 
	{
		Log(list1);
	}
	private static void showSupporterChamp(String[] list4) 
	{
		Log(list4);
	}
	private static void showTankerChamp(String[] list5) 
	{
		Log(list5);
	}
		
	private static void saveList(String[] List , String filename) 
	{
		ObjectOutputStream oos =null;
		try 
		{
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(filename))));
			oos.writeObject(List);
		} 
		catch(IOException e) 
		{
			System.out.println("오류가 발생"+ e.toString());
		}
		finally 
		{
			try 
			{
				oos.close();
			}
			catch (IOException e) 
			{
				System.out.println("오류가 발생"+ e.toString());
			}
			
		}
	}
	private static String[] loading(String filename) throws IOException, ClassNotFoundException 
    {
        String[] list = null;
        File file = new File(filename);
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        list =(String[])ois.readObject();
        return list;
    }		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

