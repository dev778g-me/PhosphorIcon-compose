package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GasCanFill: ImageVector
    get() {
        if (_GasCanFill != null) {
            return _GasCanFill!!
        }
        _GasCanFill = ImageVector.Builder(
            name = "Filled.GasCanFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 24f)
                horizontalLineTo(123.31f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112f, 28.69f)
                lineTo(101.66f, 39f)
                lineTo(91.31f, 28.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.62f, 0f)
                lineToRelative(-24f, 24f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 22.62f)
                lineTo(55f, 85.66f)
                lineTo(44.69f, 96f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 107.31f)
                verticalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 24f)
                close()
                moveTo(56f, 64f)
                lineTo(80f, 40f)
                lineTo(90.34f, 50.34f)
                lineToRelative(-24f, 24f)
                close()
                moveTo(180.8f, 185.6f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -9.6f, 12.8f)
                lineTo(128f, 166f)
                lineTo(84.8f, 198.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.6f, -12.8f)
                lineTo(114.67f, 156f)
                lineTo(75.2f, 126.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.6f, -12.8f)
                lineTo(128f, 146f)
                lineToRelative(43.2f, -32.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.6f, 12.8f)
                lineTo(141.33f, 156f)
                close()
                moveTo(176f, 72f)
                horizontalLineTo(136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _GasCanFill!!
    }

@Suppress("ObjectPropertyName")
private var _GasCanFill: ImageVector? = null
