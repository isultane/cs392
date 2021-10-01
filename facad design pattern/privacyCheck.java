public class privacyCheck {
    private int privacyCode = 1234;

    public int getPrivacyCode(){ return this.privacyCode;}

    public boolean isPrivacyCodeCorrect(int privCodeToCheck){
        if(this.privacyCode == privCodeToCheck){
            return true;
        } else {
            return false;
        }
    }
}
