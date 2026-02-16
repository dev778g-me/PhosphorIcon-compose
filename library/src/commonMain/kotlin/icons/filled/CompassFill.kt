package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CompassFill: ImageVector
    get() {
        if (_CompassFill != null) {
            return _CompassFill!!
        }
        _CompassFill = ImageVector.Builder(
            name = "Filled.CompassFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(179.58f, 81.79f)
                lineTo(147.58f, 145.79f)
                arcToRelative(4.08f, 4.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.79f, 1.79f)
                lineToRelative(-64f, 32f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.37f, -5.37f)
                lineToRelative(32f, -64f)
                arcToRelative(4.08f, 4.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.79f, -1.79f)
                lineToRelative(64f, -32f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 179.58f, 81.79f)
                close()
            }
        }.build()

        return _CompassFill!!
    }

@Suppress("ObjectPropertyName")
private var _CompassFill: ImageVector? = null
