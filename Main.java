package csp20170302;

import java.util.LinkedList;
import java.util.Scanner;


/**
 * 
* @Description
* @author TimTim Email:754595995@qq.com
* @version
* @date 2022年10月19日下午1:59:16
*
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer>list = new LinkedList<>();
		int n = scanner .nextInt();
		int m = scanner .nextInt();
		for (int i = 1; i <=n; i++) {
			list.addLast(i);			
		}
		for (int i = 0; i < m; i++) {
			int p = scanner.nextInt();
			int q = scanner . nextInt();
			int temp = list.indexOf(p);
			if (q > 0) {
				if (temp + q + 1 > list.size() - 1) {
					list.addLast(p);
				}
				else{
					list.add(temp + q + 1, p);
				}
				list.remove(temp);
			}else if(q < 0){
				if (temp + q < 0) {
					list.addFirst(p);
				}else{
					list.add(temp + q, p);
				}				
				list.remove(temp + 1);
			}		
		}	
		for (int i = 0; i < n; i++) {
			System.out.print(list.get(i) + " ");
		}
		scanner.close();
	}
}
