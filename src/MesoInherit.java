public class MesoInherit extends MesoAbstract
{
	char[] st = new char[4];
	public MesoInherit(MesoStation m)
	{
		currentStation = m;
		st =m.toString().toCharArray();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] calAverage() {
		int[] values = new int[3];
		double sum = 0;
		for(char c : st) {
			sum = (int)c;
		}
		values[0] = (int) Math.round(sum/st.length);
		values[1] = (int) Math.ceil(sum/st.length);
		values[2] = (int) Math.floor(sum/st.length);
		return values;
	}

	@Override
	public char letterAverage() {
		// TODO Auto-generated method stub
		return 0;
	}
  
}
