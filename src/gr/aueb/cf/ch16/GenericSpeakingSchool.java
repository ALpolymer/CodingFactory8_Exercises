package gr.aueb.cf.ch16;

public class GenericSpeakingSchool {
    private final ISpeakable speakable;

    // Dependency Injection - IoC(Inversion od control)
    public GenericSpeakingSchool(ISpeakable speakable) {
        this.speakable = speakable;
    }

    public void learnToSpeak(){
        speakable.speak();
    }
}
