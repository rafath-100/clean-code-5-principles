// Liskov Substitution Principle 

// Code that violates Liskov Substitution Principle
abstract class SocialMedia {
    public abstract void createPost();
    public abstract void chatWithUser();
    public abstract void sendPhotos();
}

// Here Whatsapp does not have createPost feature but has to define in sub class as it is abstract
class WhatsApp extends SocialMedia {
    public void createPost(){
        // Not Avaiable for this SubType
    }
    public void chatWithUser(){
        System.out.println("Chatting with user");
    }
    public void sendPhotos(){
        System.out.println("Sending photos...");
    }
}
// The above class cannot be substituted in place of its parent class

class Instagram extends SocialMedia {
    public void createPost(){
        System.out.println("Creating post....");
    }
    public void chatWithUser(){
        System.out.println("Chatting with user");
    }
    public void sendPhotos(){
        System.out.println("Sending photos ...");
    }
}



// code that follows Liskov principle
interface SocialMediaInterface {
    void chatWithUser();
    void sendPhotos();
}

interface CreatePost {
    void createPost();
}

class WhatsAppOne implements SocialMediaInterface {
    public void chatWithUser(){
        System.out.println("Chatting with user");
    }
    public void sendPhotos(){
        System.out.println("Sending photos...");
    }
}

class InstagramOne implements SocialMediaInterface, CreatePost {
    public void createPost(){
        System.out.println("Creating post....");
    }
    public void chatWithUser(){
        System.out.println("Chatting with user");
    }
    public void sendPhotos(){
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
