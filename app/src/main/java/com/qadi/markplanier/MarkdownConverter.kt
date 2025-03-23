package com.qadi.markplanier

import org.commonmark.parser.Parser
import org.commonmark.renderer.text.TextContentRenderer

object MarkdownConverter {
    private val parser = Parser.builder().build()
    private val renderer = TextContentRenderer.builder().build()

    fun convertMarkdownToText(markdown: String): String {
        val document = parser.parse(markdown)
        return renderer.render(document)
    }
}
