package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CarrotFill: ImageVector
    get() {
        if (_CarrotFill != null) {
            return _CarrotFill!!
        }
        _CarrotFill = ImageVector.Builder(
            name = "Filled.CarrotFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 80f)
                horizontalLineTo(199.44f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.19f, 77.26f)
                curveToRelative(-8.52f, 8.69f, -19.61f, 16.92f, -31.85f, 24.51f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.91f, -0.59f)
                lineToRelative(-34.84f, -34.84f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.49f, 0.18f)
                arcToRelative(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.41f, 11.38f)
                lineToRelative(29.88f, 29.88f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 6.39f)
                curveTo(95.74f, 214.79f, 53f, 228.54f, 46.78f, 230.48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -21.26f, -21.26f)
                curveToRelative(2.73f, -8.71f, 29f, -90.27f, 64.86f, -133.35f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.9f, -0.26f)
                lineToRelative(42.05f, 42.06f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.71f, -0.43f)
                arcToRelative(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, -11.1f)
                lineTo(108.08f, 64.78f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.63f, -6.18f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 67.28f, -2f)
                verticalLineTo(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.54f, -8f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 24.27f)
                verticalLineTo(52.69f)
                lineToRelative(26.34f, -26.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                lineTo(203.31f, 64f)
                horizontalLineToRelative(28.42f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 71.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 80f)
                close()
            }
        }.build()

        return _CarrotFill!!
    }

@Suppress("ObjectPropertyName")
private var _CarrotFill: ImageVector? = null
