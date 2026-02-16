package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HourglassSimpleFill: ImageVector
    get() {
        if (_HourglassSimpleFill != null) {
            return _HourglassSimpleFill!!
        }
        _HourglassSimpleFill = ImageVector.Builder(
            name = "Filled.HourglassSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(211.31f, 196.69f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 224f)
                horizontalLineTo(56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -27.31f)
                arcToRelative(1.59f, 1.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.13f, -0.13f)
                lineTo(116.43f, 128f)
                lineTo(44.82f, 59.44f)
                arcToRelative(1.59f, 1.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.13f, -0.13f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 32f)
                horizontalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 27.31f)
                arcToRelative(1.59f, 1.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.13f, 0.13f)
                lineTo(139.57f, 128f)
                lineToRelative(71.61f, 68.56f)
                arcTo(1.59f, 1.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 211.31f, 196.69f)
                close()
            }
        }.build()

        return _HourglassSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _HourglassSimpleFill: ImageVector? = null
