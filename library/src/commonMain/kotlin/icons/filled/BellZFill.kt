package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BellZFill: ImageVector
    get() {
        if (_BellZFill != null) {
            return _BellZFill!!
        }
        _BellZFill = ImageVector.Builder(
            name = "Filled.BellZFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(221.8f, 175.94f)
                curveTo(216.25f, 166.38f, 208f, 139.33f, 208f, 104f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, -160f, 0f)
                curveToRelative(0f, 35.34f, -8.26f, 62.38f, -13.81f, 71.94f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 200f)
                lineTo(88.81f, 200f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 78.38f, 0f)
                lineTo(208f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.8f, -24.06f)
                close()
                moveTo(128f, 216f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22.62f, -16f)
                horizontalLineToRelative(45.24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 216f)
                close()
                moveTo(144f, 152f)
                lineTo(112f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.65f, -12.44f)
                lineTo(129.05f, 104f)
                lineTo(112f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.65f, 12.44f)
                lineTo(127f, 136f)
                horizontalLineToRelative(17f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _BellZFill!!
    }

@Suppress("ObjectPropertyName")
private var _BellZFill: ImageVector? = null
