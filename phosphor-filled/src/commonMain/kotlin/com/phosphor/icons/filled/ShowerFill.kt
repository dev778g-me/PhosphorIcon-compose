package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ShowerFill: ImageVector
    get() {
        if (_ShowerFill != null) {
            return _ShowerFill!!
        }
        _ShowerFill = ImageVector.Builder(
            name = "Filled.ShowerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(64f, 236f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 236f)
                close()
                moveTo(84f, 192f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 84f, 192f)
                close()
                moveTo(20f, 192f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 192f)
                close()
                moveTo(52f, 160f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 52f, 160f)
                close()
                moveTo(248f, 32f)
                lineTo(216f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, 2.34f)
                lineToRelative(-30.2f, 30.2f)
                lineTo(53.38f, 86.19f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.69f, 27.1f)
                lineToRelative(98f, 98f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 27.09f, -8.66f)
                lineTo(191.46f, 75.86f)
                lineTo(219.31f, 48f)
                lineTo(248f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
            }
        }.build()

        return _ShowerFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShowerFill: ImageVector? = null
