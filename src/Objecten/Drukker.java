package Objecten;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Drukker {
	Queue<Bestelling> bestellingen = new LinkedList<Bestelling>();
	Bestelling bestellingInVerwerking = null;

	public void nieuweBestelling(Bestelling bestelling) {
		bestelling.setDuur(new Random().nextInt(20000));
		bestellingen.add(bestelling);

	}

	private void verwijderBestelling() {
		bestellingInVerwerking = null;
		System.out.println("Bestelling is verwijderd..");
	}

	public void updateBestelling() {
		if (bestellingInVerwerking == null) {
			bestellingInVerwerking = bestellingen.poll();
			if(bestellingInVerwerking != null){
				bestellingInVerwerking.setInVerwerking(true);
			}
			if (bestellingen.peek() != null) {
				bestellingen.element().setDadelijk(true);
			}
		}

		if (bestellingInVerwerking != null) {

			try {
				long timeout = (bestellingInVerwerking.getDuur() + bestellingInVerwerking
						.getStartTijd().getTime()) - new Date().getTime();
				if (timeout > 0) {
					Thread.sleep((bestellingInVerwerking.getDuur() + bestellingInVerwerking
							.getStartTijd().getTime()) - new Date().getTime());
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			bestellingInVerwerking
					.setCompleet((new Date().getTime() > (bestellingInVerwerking
							.getStartTijd().getTime() + bestellingInVerwerking
							.getDuur())));

			if (bestellingInVerwerking.isCompleet()) {
				verwerkBestelling();
			} else {
				updateBestelling();
			}

		}

	}

	public void verwerkBestelling() {
		System.out.println("Bestelling wordt verwerkt");
		verwijderBestelling();

		updateBestelling();

	}

}
