
public class Champ {
	int AP; //AbilityPower
	int AD; //AttackDamage
	int HP; //HealthPoint
	

	package frametest;

	public class ChampPool {
		private String Name;
		private int AD;
		private int AP;
		private int MP;
		private int HP;

		public int getAD() {
			return AD;
		}

		public int getAP() {
			return AP;
		}

		public int getMP() {
			return MP;
		}

		public int getHP() {
			return HP;
		}

		public String getName() {
			return Name;
		}

		public void setAD(int ad) {
			this.AD = ad;
		}

		public void setap(int ap) {
			this.AP = ap;
		}

		public void setMP(int mp) {
			this.MP = mp;
		}

		public void setHP(int hp) {
			this.HP = hp;
		}

		public void setName(String name) {
			this.Name = name;
		}
		
		public void print() {
			System.out.println("è�Ǿ� �̸� : " + this.Name);
			System.out.println("AD : " + this.AD);
			System.out.println("AP : " + this.AP);
			System.out.println("HP : " + this.HP);
			System.out.println("MP : " + this.MP);
		}

		public ChampPool(String name, int ad, int ap, int mp, int hp) {
			this.Name = name;
			this.AD = ad;
			this.AP = ap;
			this.MP = mp;
			this.HP = hp;
		}



		public static void main(String arg[]) {
			ChampPool[] Ch_Pool = new ChampPool[10];
			int[] MP_POOL = new int[] {400, 0, 300, 400, 450, 500, 480, 440, 510, 420};
			int[] HP_POOL = new int[] {560, 600, 650, 530, 570, 520, 610, 660, 700, 510};
			int[] AD_POOL = new int[] {70, 75, 81, 55, 50, 70, 55, 55, 50, 55};
			int[] AP_POOL = new int[] {0, 0, 0, 0, 40, 0, 30, 40, 50, 45};
			String[] NAME_POOL = new String[] {"����", "�߽���", "Ʈ����Ÿ��", "�˸���Ÿ", "�ִ�", "����", "����", "�ʰ���", "����", "�Ƹ�"};
			
			
			
			
			for(int i = 0;i<10;i++)
			{
				Ch_Pool[i].AD = AD_POOL[i];
				Ch_Pool[i].AP = AP_POOL[i];
				Ch_Pool[i].HP = HP_POOL[i];
				Ch_Pool[i].MP = MP_POOL[i];
				Ch_Pool[i].Name = NAME_POOL[i];
				Ch_Pool[i].print();
			}
		}
	}
}