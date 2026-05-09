package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FinnTheHumanFill: ImageVector
    get() {
        if (_FinnTheHumanFill != null) {
            return _FinnTheHumanFill!!
        }
        _FinnTheHumanFill = ImageVector.Builder(
            name = "Filled.FinnTheHumanFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(176f, 148f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 148f)
                close()
                moveTo(92f, 136f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92f, 136f)
                close()
                moveTo(240f, 72f)
                verticalLineToRelative(80f)
                arcToRelative(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -72f, 72f)
                lineTo(88f, 224f)
                arcToRelative(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -72f, -72f)
                lineTo(16f, 72f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 63f, -8f)
                horizontalLineToRelative(98f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 63f, 8f)
                close()
                moveTo(200f, 144f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, -32f)
                lineTo(88f, 112f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 32f)
                verticalLineToRelative(8f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
                horizontalLineToRelative(80f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
                close()
            }
        }.build()

        return _FinnTheHumanFill!!
    }

@Suppress("ObjectPropertyName")
private var _FinnTheHumanFill: ImageVector? = null
