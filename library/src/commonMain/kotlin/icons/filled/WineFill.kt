package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.WineFill: ImageVector
    get() {
        if (_WineFill != null) {
            return _WineFill!!
        }
        _WineFill = ImageVector.Builder(
            name = "Filled.WineFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(205.33f, 103.67f)
                lineTo(183.56f, 29.74f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 175.89f, 24f)
                horizontalLineTo(80.11f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.67f, 5.74f)
                lineTo(50.67f, 103.67f)
                arcToRelative(63.46f, 63.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.42f, 64.67f)
                arcTo(87.41f, 87.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 191.63f)
                verticalLineTo(232f)
                horizontalLineTo(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -16f)
                horizontalLineTo(136f)
                verticalLineTo(191.63f)
                arcToRelative(87.39f, 87.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 51.91f, -23.29f)
                arcTo(63.48f, 63.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 205.33f, 103.67f)
                close()
                moveTo(86.09f, 40f)
                horizontalLineToRelative(83.82f)
                lineTo(190f, 108.19f)
                curveToRelative(0.09f, 0.3f, 0.17f, 0.6f, 0.25f, 0.9f)
                curveToRelative(-21.42f, 7.68f, -45.54f, -1.6f, -58.63f, -8.23f)
                curveTo(106.43f, 88.11f, 86.43f, 86.49f, 71.68f, 88.93f)
                close()
            }
        }.build()

        return _WineFill!!
    }

@Suppress("ObjectPropertyName")
private var _WineFill: ImageVector? = null
