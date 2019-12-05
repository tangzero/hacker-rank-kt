package dev.tangzero.hr.algorithms.warmup.a_very_big_sum

import dev.tangzero.hr.algorithms.ConsoleTest
import io.mockk.every
import io.mockk.verify
import org.junit.jupiter.api.Test

class AVeryBigSumTest : ConsoleTest() {

    @Test
    fun `should sum big numbers`() {
        every { readLine() }.returnsMany("5", "1000000001 1000000002 1000000003 1000000004 1000000005")
        main()
        verify { println(5000000015) }
    }

}
