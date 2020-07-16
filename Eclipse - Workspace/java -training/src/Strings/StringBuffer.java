package Strings;

public class StringBuffer {
	
	public static void main(String[] args) {
	} {
		
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb + " and the hashcode " +)sb.hashCode());
		
		sb.append("pqr");
		System.out.println(sb + " and the hashcode" + sb.hashCode());
		
	//	sb.charAt(index)
	//	sb.indexOf(str)
	//	sb.lastIndexOf(str);
		sb.insert(0, "USN");
		System.out.println(sb + " and the hashcode " + sb.hashCode());
		sb.replace(0, 4, "REG_NUM : ");
		System.out.println(sb + " and the hashcode " + sb.hashCode());
		
		sb.delete(0, 4);
		System.out.println(sb + " and the hahcode" + sb.hashCode());
		
		sb.reverse();
		System.out.println(sb);
		
		
	}

	private void append(String string) {
		// TODO Auto-generated method stub
		
	}
	

}
