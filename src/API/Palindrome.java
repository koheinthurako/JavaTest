package API;

import java.util.Scanner;

//	PalindromeTest(စာလုံးတစ်ခုကို ရှေ့ကောနောက်ကောဖတ်တာအတူတူထွက်) program တစ်ခုရေးမယ် 

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		
//		ရိုးရိုး string သည် immutable ဖြစ်တယ်
		String st = sc.nextLine();
//		StringBuildeသည် mutable ဖြစ်တယ်
		StringBuilder sb = new StringBuilder(st);
//		mutable ဖြစ်လို့ အောက်မှာ reverse ပြန်လိုက်တော့ sb ထဲကို reverse ပြန်ထားတဲ့တန်ဖိုးကဝင်သွားတယ်
		sb.reverse();

//		အဲ့လို ဝင်လာတာကို အောက်ကလို direct စစ်ရင် error အစိမ်းရောင်လေးတက်မယ် error က
//		StringBuilder က String နဲ့ DataTypes မတူပဲ နှိုင်းယှဉ်ထားလို့ဖြစ်တယ် StringBuilder က String ကနေပဲဆင်းသက်လာလို့
//		compile time error မတက်ပေမယ့် အမှန်အတိုင်းမလုပ်နိုင်တဲ့ error တက်တယ် အဲ့လိုမဖြစ်အောင် DataTypes တူအောင်ချိန်းရမယ် 
//		System.out.println(st.equals(sb) ? "Palindrome" : "Not Palindrome");
		
//		DataTypes တူအောင်ချိန်းမယ်ဆို StringBuilder ကို String အနေနဲ့ပြောင်းပြီးနှိုင်းယှဉ်ရင် toString() ကိုသုံး ဒီလိုရေးမယ်
		System.out.println(st.equals(sb.toString()) ? "Palindrome" : "Not Palindrome");
		
//		String တစ်ခုကိုကြောညာလိုက်ပြီဆိုရင် memory ပေါ်မှာ 16 bit နေရာသွားယူထားတယ် အဲ့တာကို StringBuilder() ထဲမှာကိုယ်လိုချင်သလောက်ပြင်ရေးနိုင်တယ်
		StringBuilder sb2 = new StringBuilder(20);
//		insert သည် sb2 ထဲကို st input ကိုလာထည့်လိုက်ခြင်းဖြစ်သည်
		sb2.insert(0, st);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		sc.close();
		
	}

}
