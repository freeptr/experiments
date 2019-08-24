Public class myGui implements Comparable<String>{
    private String myStrung;
    public String getString() {return this.myStrung;}
    @Override
    public int compareTo(String comparable) {return this.myString.compareTo(comparable);}
    public myGui() {myStrung = new String("this is a really big strung");}
}
