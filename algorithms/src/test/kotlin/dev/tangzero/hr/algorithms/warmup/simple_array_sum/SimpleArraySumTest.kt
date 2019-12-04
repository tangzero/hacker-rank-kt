package dev.tangzero.hr.algorithms.warmup.simple_array_sum

import dev.tangzero.hr.algorithms.ConsoleTest
import io.mockk.every
import io.mockk.verify
import org.junit.jupiter.api.Test

class SimpleArraySumTest : ConsoleTest() {

    @Test
    fun `should sum an array of numbers`() {
        every { readLine() }.returnsMany("6", "1 2 3 4 10 11")
        main()
        verify { println(31) }
    }

}