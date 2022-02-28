// Liskov Substitution Principle 

// Code that violates Liskov Substitution Principle
abstract class SocialMedia {
    public abstract void post();
    public abstract void chat();
    public abstract void photo();
}

// Here Whatsapp does not have createPost feature but has to define in sub class as it is abstract
class WhatsApp extends SocialMedia {
    public void post(){
        // Not Avaiable for this SubType
    }
    public void chat(){
        System.out.println("Chatting with user");
    }
    public void photo(){
        System.out.println("Sending photos...");
    }
}
// The above class cannot be substituted in place of its parent class

class Instagram extends SocialMedia {
    public void post(){
        System.out.println("Creating post....");
    }
    public void chat(){
        System.out.println("Chatting with user");
    }
    public void photo(){
        System.out.println("Sending photos ...");
    }
}



// code that follows Liskov principle
interface SocialMedia {
    void chat();
    void photo();
}

interface Post {
    void post();
}

class WhatsApp implements SocialMedia {
    public void chat(){
        System.out.println("Chatting with user");
    }
    public void photo(){
        System.out.println("Sending photos...");
    }
}

class Instagram implements SocialMedia, Post {
    public void post(){
        System.out.println("Creating post....");
    }
    public void chat(){
        System.out.println("Chatting with user");
    }
    public void photo(){
        System.out.println("Sending photos ...");
    }
}
// Here the parent class instances can be replaced by sub class instances

public class Liskov {
    public static void main(String ...args){
        SocialMediaInterface wa = new WhatsAppOne();
        wa.sendPhotos();
        wa.chatWithUser();
        InstagramOne inst = new InstagramOne();
        inst.createPost();
    }
}
