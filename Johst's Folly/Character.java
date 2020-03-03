package game;


public class Character {
	private int str = 10;
	private int intell = 10;
	private int cha = 10;
	private int dex = 10;
	private int wis = 10;
	private int con = 10;
	private int level = 1;
	private int bab = 1;
	private int dice = 0;
	private int fort = 0;
	private int will = 0;
	private int reflex = 0;
	private boolean oneHand = false;
	private int armor = 0;
	private int naturalArmor = 0;
	private int shieldAC = 0;
	private int sizeMod = 0;
	private int dodge = 0;
	private int baseReflex = 0;
	private int baseWill = 0;
	private int baseFort = 0;
	private int sneak = 0;
	private int intimidate = 0;
	private boolean wizard;
	private boolean fighter;
	private boolean rogue;
	private int gold = 0;
	private boolean shortSword;
	private boolean dagger;
	private boolean bow;
	private boolean greatAxe;
	private boolean longsword;
	private boolean woodShield;
	private boolean steelShield;
	private double damage = 0;
	private double hp = 0;
	private int xp = 0;
	private double maxhp = 10;
	private boolean tame = false;
	private int ac = 0;
	

	public Character(){
		
	}
	public Character(int ac, double maxhp, int xp, double hp, double damage, boolean bow, boolean steelShield, boolean woodShield, boolean longsword, boolean greatAxe, 
			boolean shortSword, boolean dagger, int gold, int sneak, boolean tame, int intimidate, int baseReflex, int baseWill, int baseFort, int intell, 
			int cha, int dex, int str, int con, int wis, int fort, int will, int reflex, boolean oneHand, int bab, int level, int dice, int armor, 
			int naturalArmor, int shieldAC, int sizeMod, int dodge, boolean wizard, boolean fighter, boolean rogue) {
		this.steelShield = steelShield;
		this.woodShield = woodShield;
		this.longsword = longsword;
		this.shortSword = shortSword;
		this.dagger = dagger;
		this.bow = bow;
		this.greatAxe = greatAxe;
		this.str = str;
		this.dex = dex;
		this.wis = wis;
		this.con = con;
		this.intell = intell;
		this.cha = cha;
		this.bab = bab;
		this.level = level;
		this.dice = dice;
		this.fort = fort;
		this.will = will;
		this.reflex = reflex;
		this.oneHand = oneHand;
		this.armor = armor;
		this.naturalArmor = naturalArmor;
		this.shieldAC = shieldAC;
		this.sizeMod = sizeMod;
		this.dodge = dodge;
		this.sneak = sneak;
		this.tame = tame;
		this.intimidate = intimidate;
		this.wizard = wizard;
		this.fighter = fighter;
		this.rogue = rogue;
		this.gold = gold;
		this.damage = damage;
		this.hp = hp;
		this.xp = xp;
		this.maxhp = maxhp;
		this.ac = ac;
	}
	public int getAC() {
		return ac;
	}
	public void setAC(int ac) {
		this.ac = 10 + getArmor() + ((getDex() - 10) / 2) + getNaturalArmor();
	}
	public double getMaxHP() {
		return maxhp;
	}
	public void setMaxHP(int maxhp) {
		this.maxhp = maxhp;
	}
	public int getXP() {
		return xp;
	}
	public void setXP(int xp) {
		this.xp = getXP() + xp;
	}
	public double getHP() {
		return hp;
	}
	public void setHP(double hp) {
		this.hp = hp; 
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		if (isOneHand() == true) {
			int hurts = getDice() + ((getStr() - 10) / 2);
			this.damage = hurts;
		}
		else if (isBow() == true) {
			int hurts = getDice();
			this.damage = hurts;
		}
		else {
			double hurts = getDice() + (((getStr() - 10) / 2) * 1.5);
			this.damage = hurts;
		}
		
	}
	public boolean isDagger() {
		return dagger;
	}
	public void setDagger(boolean dagger) {
		setOneHand(true);
		setDice(1 + (int)(Math.random() * 5));
		this.dagger = dagger;
	}
	public boolean isBow() {
		return bow;
	}
	public void setBow(boolean bow) {
		setOneHand(true);
		setDice(1 + (int)(Math.random() * 9));
		this.bow = bow;
	}
	public boolean isShortSword() {
		return shortSword;
	}
	public void setShortSword(boolean shortSword) {
		setOneHand(true);
		setDice(1 + (int)(Math.random() * 7));
		this.shortSword = shortSword;
	}
	public boolean isLongSword() {
		return longsword;
	}
	public void setLongSword(boolean longsword) {
		setOneHand(false);
		setDice(1 + (int)(Math.random() * 9));
		this.longsword = longsword;
	}
	public boolean isGreatAxe() {
		return greatAxe;
	}
	public void setGreatAxe(boolean greatAxe) {
		setOneHand(false);
		setDice(1 + (int)(Math.random() * 13));
		this.greatAxe = greatAxe;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		int more = getGold();
		this.gold = gold + more;
	}
	public boolean isWisard() {
		return wizard;
	}
	public boolean isFighter() {
		return fighter;
	}
	public boolean isRogue() {
		return rogue;
	}
	public void setWizard(boolean wizard) {
		setBaseWill(3);
		setStr(12);
		setDex(14);
		setCon(15);
		setWis(16);
		setIntell(20);
		setCha(14);
		setDice(7);
		setHP(((getCon() - 10) / 2) + 6);
		setGold(100);
		setAC(1);
		this.wizard = wizard;
		
	}
	public void setFighter(boolean fighter) {
		setBaseFort(3);
		setStr(20);
		setDex(15);
		setCon(17);
		setWis(12);
		setIntell(12);
		setCha(12);
		setDice(13);
		setHP(((getCon() - 10) / 2) + 12);
		setGreatAxe(true);
		setGold(100);
		setAC(1);
		setMaxHP(((getCon() - 10) / 2) + 12);
		this.fighter = fighter;
	}
	public void setRogue(boolean rogue) {
		setBaseReflex(3);
		setStr(14);
		setDex(20);
		setCon(15);
		setWis(12);
		setIntell(15);
		setCha(12);
		setDice(9);
		setHP(((getCon() - 10) / 2) + 8);
		setBow(true);
		setGold(100);
		setAC(1);
		setMaxHP(((getCon() - 10) / 2) + 8);
		this.rogue = rogue;
	}
	public int getSneak() {
		return sneak;
	}
	public boolean isTame() {
		return tame;
	}
	public int getIntimidate() {
		return intimidate;
	}
	public void setSneak(int sneak) {
		int roll = 1 + (int)(Math.random() + 21);
		this.sneak = sneak + roll;
	}
	public void setTame(boolean tame) {
		this.tame = tame;
	}
	public void setIntimidate(int intimidate) {
		int roll = 1 + (int)(Math.random() + 21);
		this.intimidate = intimidate + roll;
	}
	public int getStr() {
		return str;
	}
	public int getDex() {
		return dex;
		
	}
	public int getWis() {
		return wis;
	}
	public int getCon() {
		return con;
	}
	
	public void setStr(int str) {
		this.str = str;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	public void setWis(int wis) {
		this.wis = wis;
	}
	public void setCon(int con) {
		this.con = con;
	}
	
	public int getCha() {
		return cha;
	}
	public void setCha(int cha) {
		this.cha = cha;
	}
	public int getIntell() {
		return intell;
	}
	public void setIntell(int intell) {
		this.intell = intell;
	}
	
	public int getDice() {
		return dice;
	}
	public int getBab() {
		return bab;
	}
	public int getLevel() {
		return level;
	}
	public void setDice(int dice) {
		this.dice = dice;
	}
	public void setBab(int bab) {
		this.bab = bab;
	}
	public void setLevel(int level) {
	this.level = level;
	
	}
	public int getArmor() {
		return armor;
	}
	public int getNaturalArmor() {
		return naturalArmor;
	}
	public int getShieldAC() {
		return shieldAC;
	}
	public int getSizeMod() {
		return sizeMod;
	}
	public int getDodge() {
		return dodge;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	public void setNaturalArmor(int naturalArmor) {
		this.naturalArmor = naturalArmor;
	}
	public void setShieldAC(int shieldAC) {
		this.shieldAC = shieldAC;
	}
	public void setSizeMod(int sizeMod) {
		this.sizeMod = sizeMod;
	}
	public void setDodge(int dodge) {
		this.dodge = dodge;
	}
	public boolean isOneHand() {
		return oneHand;
	}
	public int getFort() {
		return fort;
	}
	public int getWill() {
		return will;
	}
	public int getReflex() {
		return reflex;
	}
	public void setOneHand(boolean oneHand) {
		this.oneHand = oneHand;
	}
	public void setFort(int fort) {
		this.fort = baseFort + ((getCon() - 10) / 2);
	}
	public void setWill(int will) {
		this.will = baseWill + ((getWis() - 10) /2);
	}
	public void setReflex(int Reflix) {
		this.reflex = baseReflex + ((getDex() - 10) / 2);
	}
	public int getBaseReflex() {
		return baseReflex;
	}
	public void setBaseReflex(int baseReflex) {
		this.baseReflex = baseReflex;
	}
	public int getBaseFort() {
		return baseFort;
	}
	public void setBaseFort(int baseFort) {
		this.baseFort = baseFort;
	}
	public int getbaseWill() {
		return baseWill;
	}
	public void setBaseWill(int baseWill) {
		this.baseWill = baseWill;
	}
	public void levelUp(int level) {
		this.level = level + 1;
		this.baseFort = baseFort + 1;
		this.baseWill = baseWill + 1;
		this.baseReflex = baseReflex + 1;
	}

}
	
	
	
	
	
	
	
	
	

