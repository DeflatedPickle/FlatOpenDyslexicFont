/* Copyright (c) 2023 DeflatedPickle under the MIT license */

@file:Suppress("MemberVisibilityCanBePrivate", "unused")

package com.deflatedpickle.flatlaf.fonts.opendyslexic

import com.formdev.flatlaf.util.FontUtils

object FlatOpenDyslexicFont {
    const val FAMILY = "OpenDyslexic"

    const val STYLE_REGULAR = "OpenDyslexic-Regular.otf"
    const val STYLE_ITALIC = "OpenDyslexic-Italic.otf"
    const val STYLE_BOLD = "OpenDyslexic-Bold.otf"
    const val STYLE_BOLD_ITALIC = "OpenDyslexic-BoldItalic.otf"

    const val STYLE_ALTA_REGULAR = "OpenDyslexicAlta-Regular.otf"
    const val STYLE_ALTA_ITALIC = "OpenDyslexicAlta-Italic.otf"
    const val STYLE_ALTA_BOLD = "OpenDyslexicAlta-Bold.otf"
    const val STYLE_ALTA_BOLD_ITALIC = "OpenDyslexicAlta-BoldItalic.otf"

    const val STYLE_MONO_REGULAR = "OpenDyslexicMono-Regular.otf"

    fun installLazy() {
        FontUtils.registerFontFamilyLoader(FAMILY, ::installBasic)
        FontUtils.registerFontFamilyLoader(FAMILY, ::installAlta)
        FontUtils.registerFontFamilyLoader(FAMILY, ::installMono)
    }

    fun install() {
        installBasic()
        installAlta()
        installMono()
    }

    fun installBasic() {
        installStyle(STYLE_REGULAR)
        installStyle(STYLE_ITALIC)
        installStyle(STYLE_BOLD)
        installStyle(STYLE_BOLD_ITALIC)
    }

    fun installAlta() {
        installStyle(STYLE_ALTA_REGULAR)
        installStyle(STYLE_ALTA_ITALIC)
        installStyle(STYLE_ALTA_BOLD)
        installStyle(STYLE_ALTA_BOLD_ITALIC)
    }

    fun installMono() {
        installStyle(STYLE_MONO_REGULAR)
    }

    fun installStyle(name: String) = FontUtils.installFont(FlatOpenDyslexicFont::class.java.getResource("/$name"))
}
