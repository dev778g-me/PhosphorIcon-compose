package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.AlienFill: ImageVector
    get() {
        if (_AlienFill != null) {
            return _AlienFill!!
        }
        _AlienFill = ImageVector.Builder(
            name = "Filled.AlienFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 16f)
                arcToRelative(96.11f, 96.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -96f, 96f)
                curveToRelative(0f, 24f, 12.56f, 55.06f, 33.61f, 83f)
                curveToRelative(21.18f, 28.15f, 44.5f, 45f, 62.39f, 45f)
                reflectiveCurveToRelative(41.21f, -16.81f, 62.39f, -45f)
                curveToRelative(21.05f, -28f, 33.61f, -59f, 33.61f, -83f)
                arcTo(96.11f, 96.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 16f)
                close()
                moveTo(64f, 116f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, -12f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36f, 36f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, 12f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 116f)
                close()
                moveTo(144f, 200f)
                lineTo(112f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(156f, 152f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, -12f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36f, -36f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 152f)
                close()
            }
        }.build()

        return _AlienFill!!
    }

@Suppress("ObjectPropertyName")
private var _AlienFill: ImageVector? = null
