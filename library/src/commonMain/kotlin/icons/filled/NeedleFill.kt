package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.NeedleFill: ImageVector
    get() {
        if (_NeedleFill != null) {
            return _NeedleFill!!
        }
        _NeedleFill = ImageVector.Builder(
            name = "Filled.NeedleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(212.28f, 43.72f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56.56f, 0f)
                lineToRelative(-24f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.23f, 4.3f)
                curveTo(120.69f, 123.28f, 36f, 208.73f, 34.36f, 210.33f)
                horizontalLineToRelative(0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.31f, 11.32f)
                horizontalLineToRelative(0f)
                curveToRelative(0.86f, -0.87f, 86.83f, -86.31f, 138.32f, -95.15f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.3f, -2.23f)
                lineToRelative(24f, -24f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -56.56f)
                close()
                moveTo(189.66f, 77.66f)
                lineToRelative(-16f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineToRelative(16f, -16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                close()
            }
        }.build()

        return _NeedleFill!!
    }

@Suppress("ObjectPropertyName")
private var _NeedleFill: ImageVector? = null
