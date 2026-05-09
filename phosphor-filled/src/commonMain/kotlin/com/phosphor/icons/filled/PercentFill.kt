package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PercentFill: ImageVector
    get() {
        if (_PercentFill != null) {
            return _PercentFill!!
        }
        _PercentFill = ImageVector.Builder(
            name = "Filled.PercentFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(176f, 172f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 172f)
                close()
                moveTo(92f, 96f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 80f, 84f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92f, 96f)
                close()
                moveTo(224f, 48f)
                lineTo(224f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(48f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(32f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 32f)
                lineTo(208f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 48f)
                close()
                moveTo(64f, 84f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 92f, 56f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 84f)
                close()
                moveTo(192f, 172f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, -28f, 28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 172f)
                close()
                moveTo(189.66f, 66.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 0f)
                lineToRelative(-112f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 11.32f)
                lineToRelative(112f, -112f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 189.66f, 66.34f)
                close()
            }
        }.build()

        return _PercentFill!!
    }

@Suppress("ObjectPropertyName")
private var _PercentFill: ImageVector? = null
