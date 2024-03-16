
package ProjetPoint;
import java.util.Scanner ;
public class TestPoint {
	public static void main (String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir la valeur de x :");
		int x = sc.nextInt();
		System.out.println("Veuillez saisir la valeur de y :");
		int y = sc.nextInt();
		Point p = new Point(x,y);
		p.afficher();
		}
}
