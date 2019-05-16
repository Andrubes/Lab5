public enum eGameDifficulty{
	EASY(10), MEDIUM(30), HARD(60);
	private into iPctRemove;
	private static final Map<Integer, eGameDifficulty>
		Lookup = new LinkedHashMap<Integer, eGameDifficulty>();
	static  {
		for (eGameDifficulty d : eGameDifficulty.values()) {
			Lookup.put(d.getiPctRemove(), d);
		}
	}
	private eGameDifficulty(int iPctRemove) {
		this.iPctRemove = iPctRemove;
	}
	private int getiPctRemove() {
		Return iPctRemove;
	}
	public static eGameDifficulty get(int iPctRemove) {
		Iterator it = Lookup.entrySet().iterator();
		eGameDifficulty eGD = null;
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			eGameDifficulty enumDifficulty = (eGameDifficulty) pair.getValue();
			int iDifficultyValue = (int) pair.getKey();
			if (iPctRemove >= iDifficultyValue) {
				eGD = enumDifficulty;
			}
		}
		Return eGD;
	}
 
