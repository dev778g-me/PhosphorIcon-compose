package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HourglassSimpleLowFill: ImageVector
    get() {
        if (_HourglassSimpleLowFill != null) {
            return _HourglassSimpleLowFill!!
        }
        _HourglassSimpleLowFill = ImageVector.Builder(
            name = "Filled.HourglassSimpleLowFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(211.18f, 196.56f)
                lineTo(139.57f, 128f)
                lineToRelative(71.61f, -68.56f)
                arcToRelative(1.59f, 1.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.13f, -0.13f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 32f)
                horizontalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 44.69f, 59.31f)
                arcToRelative(1.59f, 1.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.13f, 0.13f)
                lineTo(116.43f, 128f)
                lineTo(44.82f, 196.56f)
                arcToRelative(1.59f, 1.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.13f, 0.13f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 224f)
                horizontalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, -27.31f)
                arcTo(1.59f, 1.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 211.18f, 196.56f)
                close()
                moveTo(56f, 48f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(0f)
                close()
                moveTo(158.21f, 168f)
                horizontalLineTo(97.79f)
                lineTo(128f, 139.08f)
                close()
                moveTo(200f, 48f)
                lineToRelative(-72f, 68.92f)
                lineTo(56f, 48f)
                close()
            }
        }.build()

        return _HourglassSimpleLowFill!!
    }

@Suppress("ObjectPropertyName")
private var _HourglassSimpleLowFill: ImageVector? = null
