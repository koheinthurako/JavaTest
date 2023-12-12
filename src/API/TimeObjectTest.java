package API;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TimeObjectTest {

	public static void main(String[] args) {

//		Java.util.Time အကြောင်းစမယ်
		
//		LocalDate ကိုသတ်မှတ်ခြင်းသုံးမျိုး of, now, parse
		
//		LocalDate.of() သည် ကိုယ်ကြိုက်တဲ့ ရက်စွဲကိုပေးလို့ရတယ်
		LocalDate date = LocalDate.of(2023, 10, 15);
		System.out.println("LocalDate.of() : " + date);
		
//		LocalDate.now() ကတော့ လက်ရှိ date ကိုထုတ်ပေးတယ်
		LocalDate date2 = LocalDate.now();
		System.out.println("LocalDate.now() : " + date2);
		
//		LocalDate.parse() method ထဲတွင် character sequence ကိုထည့်ပေးရတယ် ထည့်တဲ့အခါလည်း
//		LocalDate ရဲ့ syntax (0000-00-00) အတိုင်းပဲလက်ခံတယ် ကြားမှာ "-" မှရမယ်
//		အပေါ်က of မှာတော့ integer တွေထည့်ပေးရတာမို့ syntax ကို localDate က သူ့ဘာသာပြင်ပေးသွားတယ်
		LocalDate date3 = LocalDate.parse("2021-03-12");
		System.out.println("LocalDate.parse() : " + date3);
//		သို့သော် ကိုယ်လိုချင်တဲ့ format အတိုင်းပြောင်းချင်ရင် DateTimeFormatter ကိုသုံးလို့ရတယ် နောက်မှအဲ့တာကိုထပ်ရှင်းမယ်
		
//		getDayOfMonth() သည် integer ကို return ပြန်တယ်
		System.out.println("getDayOfMonth() : " + date2.getDayOfMonth());
		
//		DayOfWeek()
//		ဒီမှာ DayOfWeek သည် java မှရေးထားပြီးသော enum class ဖြစ်တယ် အဲ့တာကြောင့် ထည့်လိုက်တဲ့ တန်ဖိုးတစ်ခုကို သူ့ထဲမှာရေးထားပြီးသား
//		MONDAY, TUEDAY... စတဲ့ constant တွေနဲ့တိုက်စစ်ပြီး မှန်တဲ့ constant ကို return ပြန်ပေးတယ်
		DayOfWeek day = date.getDayOfWeek();
		System.out.println("getDayOfWeek() : " + day);
		
//		getDayOfYear() က တစ်နှစ် 365 ရက်ပြည့်ဖို့ လက်ရှိရောက်နေတဲ့ ရက်အရေအတွက်ကို integer return ပြန်ပေးတယ်
		System.out.println("getDayOfYear() : " + date.getDayOfYear());
		
//		getMonth()
//		ဒီနေရာမှာလည်း getMonth() method သည် month ဆိုတဲ့ constant object ကို return ပြန်ပေးတယ်
//		တကယ်တော့ getMonth() method က LocalDate class ထဲမှာ Month ဆိုတဲ့ ENUM Class ထဲက
//		constant တွေကို return ပြန်ပေးတဲ့ method ဖြစ်တယ် Month class ထဲမှာတော့ janToDec constant လတွေ ပါတယ်
		System.out.println("getMonth() : " + date.getMonth());
		
//		getMonthValue() ကတော့ လတစ်လရဲ့ integer တန်ဖိုး(1-12) ကို return ပြန်ပေးတယ်
		System.out.println("getMonthValue() : " + date.getMonthValue());
		
//		getYear() ကတော့ year ကို integer တန်ဖိုး return ပြန်ပေးတယ်
		System.out.println("getYear() : " + date.getYear());
		
//		isLeapYear() ကတော့ leapYear ဟုတ်မဟုတ်ကို boolean return ပြန်ပေးတယ်
		System.out.println("isLeapYear() : " + date.isLeapYear());
		
//		lengthOfMonth() ကတော့ လတစ်လရဲ့ ရက်အရေအတွက်ကို integer return ပြန်ပေးတယ်
		System.out.println("lengthOfMonth() : " + date.lengthOfMonth());
		
//		lengthOfYear() ကတော့ နှစ်တစ်နှစ်ရဲ့ 365 ရက်ကို return ပြန်ပေးတယ် leapYear ဆိုရင်တော့ 366 ပြန်ပေးမယ်
		System.out.println("lengthOfYear() : " + date.lengthOfYear());
		
		
		
	}

}
