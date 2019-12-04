package dev.tangzero.hr.algorithms

import io.mockk.clearAllMocks
import io.mockk.mockkStatic
import io.mockk.spyk
import io.mockk.unmockkStatic
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import java.io.PrintStream

abstract class ConsoleTest {

    private var out: PrintStream = System.out

    @BeforeEach
    fun setup() {
        System.setOut(spyk(System.out))
        mockkStatic("kotlin.io.ConsoleKt")
    }

    @AfterEach
    fun cleanup() {
        System.setOut(out)
        unmockkStatic("kotlin.io.ConsoleKt")
        clearAllMocks()
    }

}