package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HandArrowDownFill: ImageVector
    get() {
        if (_HandArrowDownFill != null) {
            return _HandArrowDownFill!!
        }
        _HandArrowDownFill = ImageVector.Builder(
            name = "Filled.HandArrowDownFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(230.33f, 141.06f)
                arcToRelative(24.4f, 24.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -21.24f, -4.23f)
                lineToRelative(-41.84f, 9.62f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 140f, 112f)
                lineTo(89.94f, 112f)
                arcToRelative(31.82f, 31.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.63f, 9.37f)
                lineTo(44.69f, 144f)
                lineTo(16f, 144f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 160f)
                verticalLineToRelative(40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(120f, 216f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.94f, -0.24f)
                lineToRelative(64f, -16f)
                arcToRelative(6.94f, 6.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.19f, -0.4f)
                lineTo(226f, 182.82f)
                lineToRelative(0.44f, -0.2f)
                arcToRelative(24.6f, 24.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.93f, -41.56f)
                close()
                moveTo(219.43f, 168.21f)
                lineTo(181.43f, 184.39f)
                lineTo(119f, 200f)
                lineTo(56f, 200f)
                lineTo(56f, 155.31f)
                lineToRelative(22.63f, -22.62f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 89.94f, 128f)
                lineTo(140f, 128f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 24f)
                lineTo(112f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(32f)
                arcToRelative(8.32f, 8.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.79f, -0.2f)
                lineToRelative(67f, -15.41f)
                lineToRelative(0.31f, -0.08f)
                arcToRelative(8.6f, 8.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.3f, 15.9f)
                close()
                moveTo(154.34f, 77.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                lineTo(184f, 84.69f)
                lineTo(184f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                lineTo(200f, 84.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                lineToRelative(-32f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                close()
            }
        }.build()

        return _HandArrowDownFill!!
    }

@Suppress("ObjectPropertyName")
private var _HandArrowDownFill: ImageVector? = null
