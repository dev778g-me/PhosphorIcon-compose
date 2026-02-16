package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HeartFill: ImageVector
    get() {
        if (_HeartFill != null) {
            return _HeartFill!!
        }
        _HeartFill = ImageVector.Builder(
            name = "Filled.HeartFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 102f)
                curveToRelative(0f, 70f, -103.79f, 126.66f, -108.21f, 129f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.58f, 0f)
                curveTo(119.79f, 228.66f, 16f, 172f, 16f, 102f)
                arcTo(62.07f, 62.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 78f, 40f)
                curveToRelative(20.65f, 0f, 38.73f, 8.88f, 50f, 23.89f)
                curveTo(139.27f, 48.88f, 157.35f, 40f, 178f, 40f)
                arcTo(62.07f, 62.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 102f)
                close()
            }
        }.build()

        return _HeartFill!!
    }

@Suppress("ObjectPropertyName")
private var _HeartFill: ImageVector? = null
