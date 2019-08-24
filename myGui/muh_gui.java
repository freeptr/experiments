Public class myGui implements Comparable<String>{
    private String myString;

    public myGui(){
        this.myStrung = new String("this is a really big strung");
    }

    public String getString() {
        return this.myStrung;
    }

    public String reverse() {
        return this.myString.reverse();
    }

    @Override
    public String toString() {
        return this.myString;
    }

    @Override
    public int compareTo(String comparable) {
        return this.myString.compareTo(comparable);
    }
}
