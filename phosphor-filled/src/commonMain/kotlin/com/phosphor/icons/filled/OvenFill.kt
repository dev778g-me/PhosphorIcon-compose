package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.OvenFill: ImageVector
    get() {
        if (_OvenFill != null) {
            return _OvenFill!!
        }
        _OvenFill = ImageVector.Builder(
            name = "Filled.OvenFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                lineTo(48f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(208f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(224f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(172f, 56f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172f, 56f)
                close()
                moveTo(128f, 56f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 56f)
                close()
                moveTo(84f, 56f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 72f, 68f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84f, 56f)
                close()
                moveTo(192f, 192f)
                lineTo(64f, 192f)
                lineTo(64f, 104f)
                lineTo(192f, 104f)
                close()
            }
        }.build()

        return _OvenFill!!
    }

@Suppress("ObjectPropertyName")
private var _OvenFill: ImageVector? = null
