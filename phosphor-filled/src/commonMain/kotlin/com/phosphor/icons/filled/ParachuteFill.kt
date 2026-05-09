package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ParachuteFill: ImageVector
    get() {
        if (_ParachuteFill != null) {
            return _ParachuteFill!!
        }
        _ParachuteFill = ImageVector.Builder(
            name = "Filled.ParachuteFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 120f)
                arcTo(104.12f, 104.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 16f)
                horizontalLineToRelative(0f)
                arcTo(104.12f, 104.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.21f, 6.39f)
                horizontalLineToRelative(0f)
                lineTo(120f, 196f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                horizontalLineToRelative(-8f)
                lineTo(136f, 196f)
                lineToRelative(92.8f, -69.6f)
                horizontalLineToRelative(0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 120f)
                close()
                moveTo(215.64f, 112f)
                lineTo(175.83f, 112f)
                curveToRelative(-1.54f, -37.95f, -13.91f, -62.43f, -25.11f, -77f)
                arcTo(88.2f, 88.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 215.64f, 112f)
                close()
                moveTo(154.4f, 128f)
                lineTo(128f, 175.53f)
                lineTo(101.6f, 128f)
                close()
                moveTo(83.29f, 128f)
                lineTo(102.79f, 163.09f)
                lineTo(56f, 128f)
                close()
                moveTo(172.71f, 128f)
                lineTo(200f, 128f)
                lineToRelative(-46.79f, 35.09f)
                close()
                moveTo(105.28f, 35f)
                curveToRelative(-11.2f, 14.57f, -23.57f, 39.05f, -25.11f, 77f)
                lineTo(40.36f, 112f)
                arcTo(88.2f, 88.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 105.28f, 35f)
                close()
            }
        }.build()

        return _ParachuteFill!!
    }

@Suppress("ObjectPropertyName")
private var _ParachuteFill: ImageVector? = null
