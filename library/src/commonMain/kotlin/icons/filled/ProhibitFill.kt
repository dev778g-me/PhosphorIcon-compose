package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ProhibitFill: ImageVector
    get() {
        if (_ProhibitFill != null) {
            return _ProhibitFill!!
        }
        _ProhibitFill = ImageVector.Builder(
            name = "Filled.ProhibitFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 128f)
                arcToRelative(71.69f, 71.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.78f, 44.91f)
                lineTo(83.09f, 71.78f)
                arcTo(71.95f, 71.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 128f)
                close()
                moveTo(56f, 128f)
                arcToRelative(71.95f, 71.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 116.91f, 56.22f)
                lineTo(71.78f, 83.09f)
                arcTo(71.69f, 71.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 128f)
                close()
                moveTo(236f, 128f)
                arcTo(108f, 108f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 20f)
                arcTo(108.12f, 108.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 236f, 128f)
                close()
                moveTo(216f, 128f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, -88f, 88f)
                arcTo(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 128f)
                close()
            }
        }.build()

        return _ProhibitFill!!
    }

@Suppress("ObjectPropertyName")
private var _ProhibitFill: ImageVector? = null
