
public class Word {
	
	
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
	private int numOfAC;
	private int numOfAudit;
	private int numOfAvail;
	private int numOfLegal;
	private int numOfLAF;
	private int numOfOper;
	private int numOfPriv;
	private int numOfRecover;
	private int numOfReliability;
	private int numOfSecurity;
	private int numOfUsability;
	private int total;
	private int highest;
	private boolean hasTie;
	private int numOfTied;
	
	public Word()
	{
		numOfAC=0;
		numOfAudit=0;
		numOfAvail=0;
		numOfLegal=0;
		numOfLAF=0;
		numOfOper=0;
		numOfPriv=0;
		numOfRecover=0;
		numOfReliability=0;
		numOfSecurity=0;
		numOfUsability=0;
		total=0;
		highest=0;
		hasTie=false;
		numOfTied=0;
		
	}
	public Word(int AC,int Audit,int Avail,int Legal,int LAF,int Oper,int Priv,int Recover,int Reliability,int Security,int Usability,int total,int highest, boolean tied,int amountTied) {
		numOfAC=AC;
		numOfAudit=Audit;
		numOfAvail=Avail;
		numOfLegal=Legal;
		numOfLAF=LAF;
		numOfOper=Oper;
		numOfPriv=Priv;
		numOfRecover=Recover;
		numOfReliability=Reliability;
		numOfSecurity=Security;
		numOfUsability=Usability;
		this.total=total;
		this.highest=highest;
		hasTie=tied;
		numOfTied=amountTied;
		
		
	}
	public void incAC() {
		numOfAC++;
		total++;
		if(numOfAC==highest) {
			hasTie=true;
			numOfTied++;
		}
		else if(numOfAC>highest) {
			hasTie=false;
			highest=numOfAC;
			numOfTied=1;
		}
	}
	public void incAudit() {
		numOfAudit++;
		total++;
		if(numOfAC==highest){
			hasTie=true;
			numOfTied++;
		}
		else if(numOfAudit>highest) {
			hasTie=false;
			highest=numOfAudit;
			numOfTied=1;
		}
	}
	public void incAvail() {
		numOfAvail++;
		total++;
		if(numOfAC==highest){
			hasTie=true;
			numOfTied++;
		}
		else if(numOfAvail>highest) {
			hasTie=false;
			highest=numOfAvail;
			numOfTied=1;
		}
	}
	public void incLegal() {
		numOfLegal++;
		total++;
		if(numOfAC==highest){
			hasTie=true;
			numOfTied++;
		}
		else if(numOfLegal>highest) {
			hasTie=false;
			highest=numOfLegal;
			numOfTied=1;
		}
	}
	public void incLAF() {
		numOfLAF++;
		total++;
		if(numOfAC==highest){
			hasTie=true;
			numOfTied++;
		}
		else if(numOfLAF>highest) {
			hasTie=false;
			highest=numOfLAF;
			numOfTied=1;
		}
	}
	public void incOper() {
		numOfOper++;
		total++;
		if(numOfAC==highest)
			hasTie=true;
		else if(numOfOper>highest) {
			hasTie=false;
			highest=numOfOper;
			numOfTied=1;
		}
	}
	public void incPriv() {
		numOfPriv++;
		total++;
		if(numOfAC==highest){
			hasTie=true;
			numOfTied++;
		}
		else if(numOfPriv>highest) {
			hasTie=false;
			highest=numOfPriv;
			numOfTied=1;
		}
	}
	public void incRecover() {
		numOfRecover++;
		total++;
		if(numOfAC==highest){
			hasTie=true;
			numOfTied++;
		}
		else if(numOfRecover>highest) {
			hasTie=false;
			highest=numOfRecover;
			numOfTied=1;
		}
	}
	public void incReliability() {
		numOfReliability++;
		total++;
		if(numOfAC==highest){
			hasTie=true;
			numOfTied++;
		}
		else if(numOfReliability>highest) {
			hasTie=false;
			highest=numOfReliability;
			numOfTied=1;
		}
	}
	public void incSecurity() {
		numOfSecurity++;
		total++;
		if(numOfAC==highest){
			hasTie=true;
			numOfTied++;
		}
		else if(numOfSecurity>highest) {
			hasTie=false;
			highest=numOfSecurity;
			numOfTied=1;
		}
	}
	public void incUsability() {
		numOfUsability++;
		total++;
		if(numOfAC==highest){
			hasTie=true;
			numOfTied++;
		}
		else if(numOfUsability>highest) {
			hasTie=false;
			highest=numOfUsability;
			numOfTied=1;
		}
	}
	public double ACPerc() {
		return ((double)numOfAC/(double)total);
	}
	public double AuditPerc() {
		return ((double)numOfAudit/(double)total);
	}
	public double AvailPerc() {
		return ((double)numOfAvail/(double)total);
	}
	public double LegalPerc() {
		return ((double)numOfLegal/(double)total);
	}
	public double LAFPerc() {
		return ((double)numOfLAF/(double)total);
	}
	public double OperPerc() {
		return ((double)numOfOper/(double)total);
	}
	public double PrivPerc() {
		return ((double)numOfPriv/(double)total);
	}
	public double RecoverPerc() {
		return ((double)numOfRecover/(double)total);
	}
	public double ReliabilityPerc() {
		return ((double)numOfReliability/(double)total);
	}
	public double SecurityPerc() {
		return ((double)numOfSecurity/(double)total);
	}
	public double UsabilityPerc() {
		return ((double)numOfUsability/(double)total);
	}
	public double[][] highestPerc(){
		double[][] array= new double[numOfTied][2];
		int current=0;
		if(current==numOfTied)
			return null;
		if(numOfAC==highest) {
			array[current][0]=(double)ACKEY;
			array[current][1]=ACPerc();
			current++;
			if(current==numOfTied)
				return array;
		}
		if(numOfAudit==highest) {
			array[current][0]=(double)AUDITKEY;
			array[current][1]=AuditPerc();
			current++;
			if(current==numOfTied)
				return array;
		}
		if(numOfAvail==highest) {
			array[current][0]=(double)AVAILKEY;
			array[current][1]=AvailPerc();
			current++;
			if(current==numOfTied)
				return array;
		}
		if(numOfLegal==highest) {
			array[current][0]=(double)LEGALKEY;
			array[current][1]=LegalPerc();
			current++;
			if(current==numOfTied)
				return array;
		}
		if(numOfLAF==highest) {
			array[current][0]=(double)LAFKEY;
			array[current][1]=LAFPerc();
			current++;
			if(current==numOfTied)
				return array;
		}
		if(numOfOper==highest) {
			array[current][0]=(double)OPERKEY;
			array[current][1]=OperPerc();
			current++;
			if(current==numOfTied)
				return array;
		}
		if(numOfPriv==highest) {
			array[current][0]=(double)PRIVKEY;
			array[current][1]=PrivPerc();
			current++;
			if(current==numOfTied)
				return array;
		}
		if(numOfRecover==highest) {
			array[current][0]=(double)RECOVERKEY;
			array[current][1]=RecoverPerc();
			current++;
			if(current==numOfTied)
				return array;
		}
		if(numOfReliability==highest) {
			array[current][0]=(double)RELIABILITYKEY;
			array[current][1]=ReliabilityPerc();
			current++;
			if(current==numOfTied)
				return array;
		}
		if(numOfSecurity==highest) {
			array[current][0]=(double)SECURITYKEY;
			array[current][1]=SecurityPerc();
			current++;
			if(current==numOfTied)
				return array;
		}
		if(numOfUsability==highest) {
			array[current][0]=(double)USABILITYKEY;
			array[current][1]=UsabilityPerc();
			current++;
			if(current==numOfTied)
				return array;
		}	
		return null;
		
	}
	public int totalOccurs() {
		return total;
	}
	public boolean hasATie() {
		return hasTie;
	}
	public int[][] KeysAndValues(){
		int[][] array= new int [2][NUMBEROFKEYS];
		array[ACKEY][0]=ACKEY;
		array[ACKEY][1]=numOfAC;
		array[AUDITKEY][0]=AUDITKEY;
		array[AUDITKEY][1]=numOfAudit;
		array[AVAILKEY][0]=AVAILKEY;
		array[AVAILKEY][1]=numOfAvail;
		array[LEGALKEY][0]=LEGALKEY;
		array[LEGALKEY][1]=numOfLegal;
		array[LAFKEY][0]=LAFKEY;
		array[LAFKEY][1]=numOfLAF;
		array[OPERKEY][0]=OPERKEY;
		array[OPERKEY][1]=numOfOper;
		array[PRIVKEY][0]=PRIVKEY;
		array[PRIVKEY][1]=numOfPriv;
		array[RECOVERKEY][0]=RECOVERKEY;
		array[RECOVERKEY][1]=numOfRecover;
		array[RELIABILITYKEY][0]=RELIABILITYKEY;
		array[RELIABILITYKEY][1]=numOfReliability;
		array[SECURITYKEY][0]=SECURITYKEY;
		array[SECURITYKEY][1]=numOfSecurity;
		array[USABILITYKEY][0]=USABILITYKEY;
		array[USABILITYKEY][1]=numOfUsability;
		return array;
	}
	
	public void Reset() {
		numOfAC=0;
		numOfAudit=0;
		numOfAvail=0;
		numOfLegal=0;
		numOfLAF=0;
		numOfOper=0;
		numOfPriv=0;
		numOfRecover=0;
		numOfReliability=0;
		numOfSecurity=0;
		numOfUsability=0;
		total=0;
		highest=0;
		hasTie=false;
		numOfTied=0;
	}
	

}
