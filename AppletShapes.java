import java.applet.*;
import java.awt.Graphics;

/*<applet code= "draw" height=500 width=500
*/

 class draw extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(30,40,100,100);
		g.drawOval(40,200,50,50);
		g.drawOval(40,300,100,50);
	}
}