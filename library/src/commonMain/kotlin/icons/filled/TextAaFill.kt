package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TextAaFill: ImageVector
    get() {
        if (_TextAaFill != null) {
            return _TextAaFill!!
        }
        _TextAaFill = ImageVector.Builder(
            name = "Filled.TextAaFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 156f)
                curveToRelative(0f, 6.5f, -7.33f, 12f, -16f, 12f)
                reflectiveCurveToRelative(-16f, -5.5f, -16f, -12f)
                reflectiveCurveToRelative(7.33f, -12f, 16f, -12f)
                reflectiveCurveTo(200f, 149.5f, 200f, 156f)
                close()
                moveTo(232f, 56f)
                verticalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
                horizontalLineTo(216f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 56f)
                close()
                moveTo(143.37f, 172.88f)
                lineToRelative(-44f, -104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.74f, 0f)
                lineToRelative(-44f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.74f, 6.24f)
                lineTo(66.84f, 152f)
                horizontalLineToRelative(50.32f)
                lineToRelative(11.47f, 27.12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.74f, -6.24f)
                close()
                moveTo(216f, 124f)
                curveToRelative(0f, -15.44f, -14.36f, -28f, -32f, -28f)
                arcToRelative(34.86f, 34.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -20.78f, 6.68f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.56f, 12.83f)
                arcTo(18.84f, 18.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 112f)
                curveToRelative(8.56f, 0f, 15.8f, 5.36f, 16f, 11.76f)
                verticalLineToRelative(8f)
                arcTo(35.24f, 35.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 128f)
                curveToRelative(-17.64f, 0f, -32f, 12.56f, -32f, 28f)
                reflectiveCurveToRelative(14.36f, 28f, 32f, 28f)
                arcToRelative(35.13f, 35.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.93f, -4.26f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 176f)
                close()
                moveTo(73.61f, 136f)
                horizontalLineToRelative(36.78f)
                lineTo(92f, 92.53f)
                close()
            }
        }.build()

        return _TextAaFill!!
    }

@Suppress("ObjectPropertyName")
private var _TextAaFill: ImageVector? = null
