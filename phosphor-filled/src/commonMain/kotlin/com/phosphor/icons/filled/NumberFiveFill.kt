package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.NumberFiveFill: ImageVector
    get() {
        if (_NumberFiveFill != null) {
            return _NumberFiveFill!!
        }
        _NumberFiveFill = ImageVector.Builder(
            name = "Filled.NumberFiveFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 24f)
                lineTo(56f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                lineTo(40f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(200f, 232f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(216f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 24f)
                close()
                moveTo(124f, 104f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, -34.22f, 71.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.44f, -10.06f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.35f, -35.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14f, -6.29f)
                lineToRelative(7.55f, -52.82f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 64f)
                horizontalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(110.94f, 80f)
                lineTo(107f, 107.4f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 124f, 104f)
                close()
            }
        }.build()

        return _NumberFiveFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberFiveFill: ImageVector? = null
