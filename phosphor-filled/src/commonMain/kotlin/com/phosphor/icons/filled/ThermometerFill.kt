package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ThermometerFill: ImageVector
    get() {
        if (_ThermometerFill != null) {
            return _ThermometerFill!!
        }
        _ThermometerFill = ImageVector.Builder(
            name = "Filled.ThermometerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(212f, 56f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 28f, 28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 212f, 56f)
                close()
                moveTo(212f, 96f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 212f, 96f)
                close()
                moveTo(152f, 146.08f)
                lineTo(152f, 40f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64f, 0f)
                lineTo(88f, 146.08f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 0f)
                close()
                moveTo(136f, 104f)
                lineTo(104f, 104f)
                lineTo(104f, 40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                close()
            }
        }.build()

        return _ThermometerFill!!
    }

@Suppress("ObjectPropertyName")
private var _ThermometerFill: ImageVector? = null
