package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TipiFill: ImageVector
    get() {
        if (_TipiFill != null) {
            return _TipiFill!!
        }
        _TipiFill = ImageVector.Builder(
            name = "Filled.TipiFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(238.74f, 211.69f)
                lineTo(137.5f, 53.5f)
                lineToRelative(21.24f, -33.19f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.48f, -8.62f)
                lineTo(128f, 38.66f)
                lineToRelative(-17.26f, -27f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -13.48f, 8.62f)
                lineTo(118.5f, 53.5f)
                lineTo(17.26f, 211.69f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 224f)
                lineTo(232f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.74f, -12.31f)
                close()
                moveTo(188.74f, 208f)
                lineTo(134.74f, 123.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.48f, 0f)
                lineTo(67.3f, 208f)
                lineTo(38.62f, 208f)
                lineTo(128f, 68.34f)
                lineTo(217.38f, 208f)
                close()
            }
        }.build()

        return _TipiFill!!
    }

@Suppress("ObjectPropertyName")
private var _TipiFill: ImageVector? = null
