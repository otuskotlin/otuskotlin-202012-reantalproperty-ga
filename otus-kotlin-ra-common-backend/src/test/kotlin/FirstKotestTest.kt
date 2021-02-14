import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.ints.shouldBeExactly

class FirstKotestTest : StringSpec({
    "assertSum".config(invocations = 30) {
        customSumm(3, 9) shouldBeExactly 12
    }

})