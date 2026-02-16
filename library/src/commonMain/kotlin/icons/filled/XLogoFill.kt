package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.XLogoFill: ImageVector
    get() {
        if (_XLogoFill != null) {
            return _XLogoFill!!
        }
        _XLogoFill = ImageVector.Builder(
            name = "Filled.XLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(215f, 219.85f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, 4.15f)
                horizontalLineTo(160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.75f, -3.71f)
                lineToRelative(-40.49f, -63.63f)
                lineTo(53.92f, 221.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.84f, -10.76f)
                lineToRelative(61.77f, -68f)
                lineTo(41.25f, 44.3f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 32f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.75f, 3.71f)
                lineToRelative(40.49f, 63.63f)
                lineToRelative(58.84f, -64.72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.84f, 10.76f)
                lineToRelative(-61.77f, 67.95f)
                lineToRelative(62.6f, 98.38f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 215f, 219.85f)
                close()
            }
        }.build()

        return _XLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _XLogoFill: ImageVector? = null
