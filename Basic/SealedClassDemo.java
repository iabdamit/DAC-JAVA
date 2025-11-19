//! only final,sealed and non sealed class can extend sealed class
//! for interface only non-sealed and sealed class or interface
sealed class SCA extends Thread implements Cloneable permits SCB, SCC {

}

non-sealed class SCB extends SCA {

}

final class SCC extends SCA {

}

class SCD extends SCB {

}

sealed interface ad permits af {

}

non-sealed interface af
        extends ad {

}

public class SealedClassDemo {
    public static void main(String[] args) {
        // SCD obj = new SCD();

    }
}
