package dev.tangzero.hr.algorithms.solve

import dev.tangzero.hr.algorithms.ConsoleTest
import io.mockk.every
import io.mockk.verify
import org.junit.jupiter.api.Test

class SolveMeFirstTest : ConsoleTest() {

    @Test
    fun `should solve the first exercise`() {
        every { readLine() }.returnsMany("2", "3")
        main()
        verify { println(5) }
    }

}
