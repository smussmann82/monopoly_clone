import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

class Controller implements MouseListener
{
	Model model;
	Controller(Model m) {
		this.model = m;
	}

	public void mousePressed(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1){
			this.model.onClick();
		}else if(e.getButton() == MouseEvent.BUTTON3){
			this.model.rightClick();
		}
	}

	public void mouseReleased(MouseEvent e) {    }
	public void mouseEntered(MouseEvent e) {    }
	public void mouseExited(MouseEvent e) {    }
	public void mouseClicked(MouseEvent e) {    }

}
