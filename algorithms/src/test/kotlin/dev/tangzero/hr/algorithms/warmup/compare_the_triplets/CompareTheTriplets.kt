package dev.tangzero.hr.algorithms.warmup.compare_the_triplets

import dev.tangzero.hr.algorithms.ConsoleTest
import io.mockk.every
import io.mockk.verify
import org.junit.jupiter.api.Test

class CompareTheTripletsTest : ConsoleTest() {

    @Test
    fun `should compare 2 triplets`() {
        every { readLine() }.returnsMany("5 6 7", "3 6 10")
        main()
        verify { println("1 1") }
    }

}