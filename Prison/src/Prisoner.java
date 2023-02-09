public class Prisoner {
    int id;
    Boolean invited = false;

   protected Prisoner(int id){
       this.id = id;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

