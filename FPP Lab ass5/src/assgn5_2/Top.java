package assgn5_2;

import assgn5_2.Top.Middle.half;

public class Top {
	
	public Top t;
	public Middle M;
	public Middle.Bottom B;
	
	public int z;
	Top(){
		z=5;
		this.M =  new Middle();
		this.B = M.new Bottom();
	}
	
	class Middle{
		 int y;
		public Middle() {
			y=3;
		}
		
		int addTopAndBottom() {
			return z + B.x;
		}
		
		
		class Bottom{
			int x;
			public Bottom() {
				x=5;
			}
			
			int multiplyAllThree() {
				return z * this.x * M.y;
			}
			
		}
		
		static class half{
			static int h;
			half(){
				h=12;
			}
		}
	}
	
	public int readBottom() {
		return B.x;
	}
	
	public static void main(String[] args) {
			
		Top top = new Top();
		half h = new half();
		System.out.println(h.h);
		System.out.println(top.readBottom());
		System.out.println(top.M.addTopAndBottom());
		System.out.println(top.B.multiplyAllThree());
		
	}


}
