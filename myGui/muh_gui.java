Public class myGui implements Comparable<String>{
    private String myString;

    public myGui() {
        mySting = new String("a string");
    }

    public String getString() {
	return this.myString;
    }

    @Override
    public int compareTo(String comparable) {
	return this.myString.compareTo(comparable);
    }

    public String toString() {
        return this.myString;
    }
}
