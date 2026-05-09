package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.NumberEightFill: ImageVector
    get() {
        if (_NumberEightFill != null) {
            return _NumberEightFill!!
        }
        _NumberEightFill = ImageVector.Builder(
            name = "Filled.NumberEightFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(108f, 92f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 20f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 108f, 92f)
                close()
                moveTo(128f, 128f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 28f, 28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 128f)
                close()
                moveTo(216f, 40f)
                lineTo(216f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(56f, 232f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 24f)
                lineTo(200f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 40f)
                close()
                moveTo(172f, 156f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -20.23f, -37f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, -47.54f, 0f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = false, 172f, 156f)
                close()
            }
        }.build()

        return _NumberEightFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberEightFill: ImageVector? = null
