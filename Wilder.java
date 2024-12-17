public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder (String firstname, boolean aware){
        this.firstname=firstname;
        this.aware=aware;
    }

    public String getFirsname(){
        return this.firstname;
    }

    public void setFirstname(String firstname){
        this.firstname=firstname;
    }

    public boolean isAware(){
        return this.isAware();
    }

    public void setAware(boolean aware){
        this.aware=aware;
    }

    public String whoAmI() {
        String mainSentence="Je m'appelle " + this.firstname;
        return aware ?mainSentence+" et je suis aware":mainSentence+" et je ne suis pas aware";
    }


}