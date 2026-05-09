package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TelegramLogoFill: ImageVector
    get() {
        if (_TelegramLogoFill != null) {
            return _TelegramLogoFill!!
        }
        _TelegramLogoFill = ImageVector.Builder(
            name = "Filled.TelegramLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(228.88f, 26.19f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.16f, -1.57f)
                lineTo(17.06f, 103.93f)
                arcToRelative(14.22f, 14.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.43f, 27.21f)
                lineTo(72f, 141.45f)
                verticalLineTo(200f)
                arcToRelative(15.92f, 15.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 14.83f)
                arcToRelative(15.91f, 15.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.51f, -3.73f)
                lineToRelative(25.32f, -26.26f)
                lineTo(165f, 220f)
                arcToRelative(15.88f, 15.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.51f, 4f)
                arcToRelative(16.3f, 16.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -0.79f)
                arcToRelative(15.85f, 15.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.67f, -11.63f)
                lineTo(231.77f, 35f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 228.88f, 26.19f)
                close()
                moveTo(175.53f, 208f)
                lineTo(92.85f, 135.5f)
                lineToRelative(119f, -85.29f)
                close()
            }
        }.build()

        return _TelegramLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _TelegramLogoFill: ImageVector? = null
