
public class ObjRefInStaticMthd {
	static ObjRefInStaticMthd method1() {
		return new ObjRefInStaticMthd();
	}
	public static void main(String []args) {
		System.out.println(method1());
	}
	
}
