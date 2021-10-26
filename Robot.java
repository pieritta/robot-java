package mes_robots;

public class Robot {
//	Les attribuet de la classe Robot
	int x, y;
	Orientation direction;
	
//	Les constructeurs
	public Robot (){
		x=y=0;
		direction=Orientation.NORD;
	}
	public Robot(int dx,int dy, Orientation or) {
		x=dx;
		y=dy;
		direction=or;
	}
	
//	Les Methodes
	
	
//	Cette methode va permettre au robot 
//	d'avancer d'un pas selon son orientation presente
	
	public void  avancer() {
		switch(direction) {
		case NORD:y++;
			break;
		case SUD: y--;
			break;
		case EST: x++;
			break;
		case OUEST: x--;
			break;
		default:
			System.out.println("Cette Orientation n'existe pas");
		break;
		}
		
		
	}
//	Comme son nom l'indique, grace a cette methode, 
//	le Robot poura avnancer de deux pas
	public void avancer_deux_pas() {
		avancer();
		avancer();
	}
	
//	Cette methode permet au robot de tour vers la gauche
	
	public void tourner_a_gauche() {
		switch(direction) {
		case NORD:
			direction=Orientation.OUEST;
			break;
		case SUD:
			direction=Orientation.EST;
			break;
		case EST:
			direction=Orientation.NORD;
			break;
		case OUEST:
			direction=Orientation.SUD;
			break;
		default:
			System.out.println("Cette Orientation n'existe pas");
		break;
		}
		
	}
	
//	Meme principe que tourner a gauche
	
	public void tourner_a_droite() {
		switch(direction) {
		case NORD:
			direction=Orientation.EST;
			break;
		case SUD:
			direction=Orientation.OUEST;
			break;
		case EST:
			direction=Orientation.SUD;
			break;
		case OUEST:
			direction=Orientation.NORD;
			break;
		default:
			System.out.println("Cette Orientation n'existe pas");
		break;
		}
	}
	
//	Calcl de la distance par rapport a l'origine
	
	public float distance() {
		return (float)Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		
	}
	
//	Calcul de la distance par rapport a un autre Robot
	
	public float distance (Robot r) {
		return (float)math.sqrt(math.pow(r.x-x,2)+math.pow(r.y-y,2))

	}

	
//	Affichage d'un Robot a l'ecran: Redefinission de l methode toString()
	public String toString() {
		return ("Robot:\n==================\n x: "+x+"\n y: "+y+"\n orientation: "+direction+"\n\n");
	}
	
//	Evaluation du Robot le plus fort
//	On renvoie true si l'object qui appelle la methode est plus fort
	public Robot plusFort(Robot r1, Robot r2) {
		if(r1.distance()<r2.distance())return r1;
		else return r2; }
		
	}
	
//	Cette methode permet de faire avancer le plus fort
	public void avancer_plus_fort(Robot r) {
		if(plusFort(r1)) avancer();
		else r2.avancer();
		return;
   }
	
	
}
`