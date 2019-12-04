package dev.tangzero.hr.algorithms.warmup.solve_me_first

import dev.tangzero.hr.algorithms.ConsoleTest
import io.mockk.every
import io.mockk.verify
import org.junit.jupiter.api.Test

class SolveMeFirstTest : ConsoleTest() {

    @Test
    fun `should sum two number`() {
        every { readLine() }.returnsMany("2", "3")
        main()
        verify { println(5) }
    }

}
