//! 
// class Alien {
//     private final int id;
//     private final String name;

//     public Alien(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() {
//         return "Alien [id=" + id + ", name=" + name + "]";
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alien other = (Alien) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }

// }
//! It is used to create immutable data carriers without writing boilerplate code like constructors, getters, equals(), hashCode(), and toString().
// ! All “fields” (called components) in a record are implicitly private and final.
record Alien(int age, String name) {
    public Alien {
        if (age < 0)
            throw new IllegalArgumentException("Age cannot be negetive");
    }
}

public class RecordClassDemo {
    public static void main(String[] args) {
        Alien a1 = new Alien(1, "Alpha");
        Alien a2 = new Alien(1, "Alpha");
        System.out.println(a1.equals(a2));
        // System.out.println(a1.getId());
        System.out.println(a1);
    }

}
