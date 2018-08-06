/**
 * 
 */
package com.demo.misc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author srout
 *
 */
public class BuildFlatMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A[] arr1 = new A[3];
		arr1[0] = new A();
		arr1[0].f1 = "A";
		arr1[0].f2 = "B";
		arr1[0].f3 = "C";
		B[] arr2 = new B[4];
		arr2[0] = new B();
		arr2[0].f1 = "x";
		arr2[0].f2 = arr1;
		arr2[0].f3 = "y";
		arr2[0].f4 = "z";
		C[] arr3 = new C[3];
		arr3[0] = new C();
		arr3[0].f1 = arr1;
		arr3[0].f2 = arr2;
		arr3[0].f3 ="z";
		List<String> result = BuildFlatMap.buildFlatMap(arr3);
		for(String s: result) {
			System.out.println(s);
		}
	}
	
	private static List<String> buildFlatMap(C[] arr) {
		List<String> list = new ArrayList<String>();
		
		for(C c:arr) {
			list.add(c.f3);
			for(A a:c.f1) {
				list.add(a.f1);
				list.add(a.f2);
				list.add(a.f3);
//				for(B b: c.f2) {
//					list.add(b.f1);
////					list.add(a.f1);
////					list.add(a.f2);
////					list.add(a.f3);
//					list.add(b.f3);
//					list.add(b.f4);
//				}
			}
			
			
		}
		return list;
	}
	
	static class A {
		String f1;
		String f2;
		String f3;
		public String getF1() {
			return f1;
		}
		public void setF1(String f1) {
			this.f1 = f1;
		}
		public String getF2() {
			return f2;
		}
		public void setF2(String f2) {
			this.f2 = f2;
		}
		public String getF3() {
			return f3;
		}
		public void setF3(String f3) {
			this.f3 = f3;
		}
		
	}
	
	static class B {
		String f1;
		A[] f2;
		String f3;
		String f4;
	}
	
	static class C {
		A[] f1;
		B[] f2;
		String f3;
	}

}
