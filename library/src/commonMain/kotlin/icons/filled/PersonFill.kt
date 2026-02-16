package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PersonFill: ImageVector
    get() {
        if (_PersonFill != null) {
            return _PersonFill!!
        }
        _PersonFill = ImageVector.Builder(
            name = "Filled.PersonFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(100f, 36f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, 28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100f, 36f)
                close()
                moveTo(215.42f, 140.78f)
                lineToRelative(-45.25f, -51.3f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -21f, -9.48f)
                horizontalLineTo(106.83f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -21f, 9.48f)
                lineToRelative(-45.25f, 51.3f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.56f, 22.69f)
                lineTo(89f, 142.7f)
                lineToRelative(-19.7f, 74.88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 29.08f, 13.35f)
                lineTo(128f, 180f)
                lineToRelative(29.58f, 51f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 29.08f, -13.35f)
                lineTo(167f, 142.7f)
                lineToRelative(25.9f, 20.77f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.56f, -22.69f)
                close()
            }
        }.build()

        return _PersonFill!!
    }

@Suppress("ObjectPropertyName")
private var _PersonFill: ImageVector? = null
