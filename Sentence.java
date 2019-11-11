import java.util.ArrayList;

public class Sentence {
	
	public static int ACKEY=0;
	public static int AUDITKEY=1;
	public static int AVAILKEY=2;
	public static int LEGALKEY=3;
	public static int LAFKEY=4;
	public static int OPERKEY=5;
	public static int PRIVKEY=6;
	public static int RECOVERKEY=7;
	public static int RELIABILITYKEY=8;
	public static int SECURITYKEY=9;
	public static int USABILITYKEY=10;
	public static int NUMBEROFKEYS=11;
	private ArrayList<Word> words;   
	private String initClass;
	private String finClass;
	private double percAC;
	private double percAudit;
	private double percAvail;
	private double percLegal;
	private double percLAF;
	private double percOper;
	private double percPriv;
	private double percRecover;
	private double percReliability;
	private double percSecurity;
	private double percUsability;
	private double highest;
	private int numOfTied;
	
	public Sentence() {
		words=null;
		initClass=null;
		finClass=null;
		percAC=0;
		percAudit=0;
		percAvail=0;
		percLegal=0;
		percLAF=0;
		percOper=0;
		percPriv=0;
		percRecover=0;
		percReliability=0;
		percSecurity=0;
		percUsability=0;
		highest=0;
		numOfTied=0;
	}
	public Sentence(String starting) {
		words=null;
		initClass=starting;
		finClass=null;
		percAC=0;
		percAudit=0;
		percAvail=0;
		percLegal=0;
		percLAF=0;
		percOper=0;
		percPriv=0;
		percRecover=0;
		percReliability=0;
		percSecurity=0;
		percUsability=0;
		highest=0;
		numOfTied=0;
	}
	public void setInitClass(String init) {
		initClass=init;
	}
	public void readSentence() {
		//parser stuff here turns what it reads into words and adds it to the word array or arraylist however we want to do it
		//also when finished reading in sentance run all calcs
	}
	public void detFinClass() {
		//do work to determine what class it is based on a percentage i guess
	} 
	//still need stuff to work with initial class and finish class but dont know what we want to do for that stuff
	public double[][] highestPerc(){
		double[][] array= new double[numOfTied][2];
		int current=0;
		if(current==numOfTied)
			return null;
		if(percAC==highest) {
			array[current][0]=(double)ACKEY;
			array[current][1]=percAC;
			current++;
			if(current==numOfTied)
				return array;
		}
		if(percAudit==highest) {
			array[current][0]=(double)AUDITKEY;
			array[current][1]=percAudit;
			current++;
			if(current==numOfTied)
				return array;
		}
		if(percAvail==highest) {
			array[current][0]=(double)AVAILKEY;
			array[current][1]=percAvail;
			current++;
			if(current==numOfTied)
				return array;
		}
		if(percLegal==highest) {
			array[current][0]=(double)LEGALKEY;
			array[current][1]=percLegal;
			current++;
			if(current==numOfTied)
				return array;
		}
		if(percLAF==highest) {
			array[current][0]=(double)LAFKEY;
			array[current][1]=percLAF;
			current++;
			if(current==numOfTied)
				return array;
		}
		if(percOper==highest) {
			array[current][0]=(double)OPERKEY;
			array[current][1]=percOper;
			current++;
			if(current==numOfTied)
				return array;
		}
		if(percPriv==highest) {
			array[current][0]=(double)PRIVKEY;
			array[current][1]=percPriv;
			current++;
			if(current==numOfTied)
				return array;
		}
		if(percRecover==highest) {
			array[current][0]=(double)RECOVERKEY;
			array[current][1]=percRecover;
			current++;
			if(current==numOfTied)
				return array;
		}
		if(percReliability==highest) {
			array[current][0]=(double)RELIABILITYKEY;
			array[current][1]=percReliability;
			current++;
			if(current==numOfTied)
				return array;
		}
		if(percSecurity==highest) {
			array[current][0]=(double)SECURITYKEY;
			array[current][1]=percSecurity;
			current++;
			if(current==numOfTied)
				return array;
		}
		if(percUsability==highest) {
			array[current][0]=(double)USABILITYKEY;
			array[current][1]=percUsability;
			current++;
			if(current==numOfTied)
				return array;
		}	
		return null;
		
	}
	private void calcAll() {
		calcAC();
		calcAudit();
		calcAvail();
		calcLegal();
		calcLAF();
		calcOper();
		calcPriv();
		calcRecover();
		calcReliability();
		calcSecurity();
		calcUsability();
	}
	private void calcAC() {
		int current=0;
		while(current<words.size()) {
			percAC+=words.get(current).ACPerc();
		}
		percAC=percAC/(double)words.size();
		if(percAC>highest) {
			highest=percAC;
			numOfTied=1;
		}
		else if(percAC==highest) {
			numOfTied++;
		}
	}
	private void calcAudit() {
		int current=0;
		while(current<words.size()) {
			percAudit+=words.get(current).AuditPerc();
		}
		percAudit=percAudit/(double)words.size();
		if(percAudit>highest) {
			highest=percAudit;
			numOfTied=1;
		}
		else if(percAudit==highest) {
			numOfTied++;
		}
	}
	private void calcAvail() {
		int current=0;
		while(current<words.size()) {
			percAvail+=words.get(current).AvailPerc();
		}
		percAvail=percAvail/(double)words.size();
		if(percAvail>highest) {
			highest=percAvail;
			numOfTied=1;
		}
		else if(percAvail==highest) {
			numOfTied++;
		}
	}
	private void calcLegal() {
		int current=0;
		while(current<words.size()) {
			percLegal+=words.get(current).LegalPerc();
		}
		percLegal=percLegal/(double)words.size();
		if(percLegal>highest) {
			highest=percLegal;
			numOfTied=1;
		}
		else if(percLegal==highest) {
			numOfTied++;
		}
	}
	private void calcLAF() {
		int current=0;
		while(current<words.size()) {
			percLAF+=words.get(current).LAFPerc();
		}
		percLAF=percLAF/(double)words.size();
		if(percLAF>highest) {
			highest=percLAF;
			numOfTied=1;
		}
		else if(percLAF==highest) {
			numOfTied++;
		}
	}
	private void calcOper() {
		int current=0;
		while(current<words.size()) {
			percOper+=words.get(current).OperPerc();
		}
		percOper=percOper/(double)words.size();
		if(percOper>highest) {
			highest=percOper;
			numOfTied=1;
		}
		else if(percOper==highest) {
			numOfTied++;
		}
	}
	private void calcPriv() {
		int current=0;
		while(current<words.size()) {
			percPriv+=words.get(current).PrivPerc();
		}
		percPriv=percPriv/(double)words.size();
		if(percPriv>highest) {
			highest=percPriv;
			numOfTied=1;
		}
		else if(percPriv==highest) {
			numOfTied++;
		}
	}
	private void calcRecover() {
		int current=0;
		while(current<words.size()) {
			percRecover+=words.get(current).RecoverPerc();
		}
		percRecover=percRecover/(double)words.size();
		if(percRecover>highest) {
			highest=percRecover;
			numOfTied=1;
		}
		else if(percRecover==highest) {
			numOfTied++;
		}
	}
	private void calcReliability() {
		int current=0;
		while(current<words.size()) {
			percReliability+=words.get(current).ReliabilityPerc();
		}
		percReliability=percReliability/(double)words.size();
		if(percReliability>highest) {
			highest=percReliability;
			numOfTied=1;
		}
		else if(percReliability==highest) {
			numOfTied++;
		}
	}
	private void calcSecurity() {
		int current=0;
		while(current<words.size()) {
			percSecurity+=words.get(current).SecurityPerc();
		}
		percSecurity=percSecurity/(double)words.size();
		if(percSecurity>highest) {
			highest=percSecurity;
			numOfTied=1;
		}
		else if(percSecurity==highest) {
			numOfTied++;
		}
	}
	private void calcUsability() {
		int current=0;
		while(current<words.size()) {
			percUsability+=words.get(current).UsabilityPerc();
		}
		percUsability=percUsability/(double)words.size();
		if(percUsability>highest) {
			highest=percUsability;
			numOfTied=1;
		}
		else if(percUsability==highest) {
			numOfTied++;
		}
	}
	

}
