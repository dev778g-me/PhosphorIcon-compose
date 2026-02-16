package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TrendDownFill: ImageVector
    get() {
        if (_TrendDownFill != null) {
            return _TrendDownFill!!
        }
        _TrendDownFill = ImageVector.Builder(
            name = "Filled.TrendDownFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 128f)
                verticalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -13.66f)
                lineTo(188.69f, 160f)
                lineTo(136f, 107.31f)
                lineToRelative(-34.34f, 34.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineToRelative(-72f, -72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.66f, 58.34f)
                lineTo(96f, 124.69f)
                lineToRelative(34.34f, -34.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineTo(200f, 148.69f)
                lineToRelative(26.34f, -26.35f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 128f)
                close()
            }
        }.build()

        return _TrendDownFill!!
    }

@Suppress("ObjectPropertyName")
private var _TrendDownFill: ImageVector? = null
