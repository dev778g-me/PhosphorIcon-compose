package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.MessengerLogoFill: ImageVector
    get() {
        if (_MessengerLogoFill != null) {
            return _MessengerLogoFill!!
        }
        _MessengerLogoFill = ImageVector.Builder(
            name = "Filled.MessengerLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36.18f, 176.88f)
                lineTo(24.83f, 210.93f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.24f, 20.24f)
                lineToRelative(34.05f, -11.35f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(181.66f, 117.66f)
                lineTo(149.66f, 149.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineTo(112f, 123.31f)
                lineTo(85.66f, 149.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineToRelative(32f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineTo(144f, 132.69f)
                lineToRelative(26.34f, -26.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                close()
            }
        }.build()

        return _MessengerLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _MessengerLogoFill: ImageVector? = null
