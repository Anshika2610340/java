interface searchable{
    public boolean search(String keyword);
}
class document implements searchable{
    String content;
    public document(String content){
        this.content=content;
    }
    public boolean search(String keyword){
        return content.contains(keyword);
    }
}
class webpage implements searchable{
    String content;
    public webpage(String content){
        this.content=content;
    }
    public boolean search(String keyword){
        return content.contains(keyword);
    }
}
public class Practisequestion172 {
    static void main() {
        /*Write a Java program to create an interface Searchable with a method search(String keyword) that searches for a given keyword in a text document.
        Create two classes Document and WebPage that implement the Searchable interface and provide their own implementations of the search() method.*/
        document d=new document("this is a sample document");
        System.out.println(d.search("sample"));
        webpage w=new webpage("this is a sample webpage");
        System.out.println(w.search("sample"));
    }
}
