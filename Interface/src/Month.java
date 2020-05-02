
// Month implementing interfaces year_2020 and year_2021

public class Month implements Year_2020, Year_2021 {

	@Override
	public void holiMonth() {
		System.out.println("Holi month is March.");

	}

	@Override
	public void diwaliMonth() {
		System.out.println("Diwanli month is October.");

	}

}
