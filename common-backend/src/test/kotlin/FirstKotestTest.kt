import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.ints.shouldBeExactly

class FirstKotestTest : StringSpec({
    "assertSum"{
        customSumm(3,9) shouldBeExactly 12
    }

}

) {

}