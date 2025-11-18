sealed class SCA permits SCB, SCC {

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

    }
}
