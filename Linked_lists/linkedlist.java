

public class linkedlist {
    

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println();

        Block block1 = new Block();
        Block block2 = new Block(block1);
        Block block3 = new Block(block2);
        Block block4 = new Block(block3);
        Block block5 = new Block(block4);

        block1.print();       
        block2.print();
        block3.print();
        block4.print();
        block5.print();

        block5.eat(5);

        System.out.println(block1.is_head);;

    }


}

class Block {

    boolean is_head;
    Block prev;
    Block next;
    int id;

    Block() { is_head = true; id = 1;}

    Block(Block prev) { 
        this.prev = prev;
        this.id = prev.id + 1;

        this.prev.set_next(this);

    }

    void set_next(Block next) { this.next = next; }

    boolean is_head() { return this.is_head; }
    boolean is_tail() { return (this.next == null)? true: false ; }    
    
    void eat(int sushi) {

        if (this.is_head) {System.out.println("Reached Head. Sushi: " + sushi);}

        else {
            System.out.println("Reached ID: " + this.id);
            this.prev.eat(sushi);
        }


    }




    public void print() {
        System.out.printf("---- Block %s ----\n", this.id);
        System.out.println("Is Head: " + this.is_head);
        System.out.println("Is Tail: " + this.is_tail());
        System.out.println("Prev: " + this.prev);
        System.out.println("This: " + this);
        System.out.println("Next: " + this.next);
        System.out.println();        
    }

    
}