package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BellRingingFill: ImageVector
    get() {
        if (_BellRingingFill != null) {
            return _BellRingingFill!!
        }
        _BellRingingFill = ImageVector.Builder(
            name = "Filled.BellRingingFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 71.1f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.78f, -3.42f)
                arcToRelative(94.13f, 94.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -33.46f, -36.91f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.54f, -13.54f)
                arcToRelative(111.46f, 111.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 39.12f, 43.09f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 71.1f)
                close()
                moveTo(35.71f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.1f, -4.32f)
                arcTo(94.13f, 94.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76.27f, 30.77f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -8.54f, -13.54f)
                arcTo(111.46f, 111.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28.61f, 60.32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 35.71f, 72f)
                close()
                moveTo(221.81f, 175.94f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 200f)
                lineTo(167.2f, 200f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -78.4f, 0f)
                lineTo(48f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.79f, -24.06f)
                curveTo(43.22f, 160.39f, 48f, 138.28f, 48f, 112f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 0f)
                curveTo(208f, 138.27f, 212.78f, 160.38f, 221.81f, 175.94f)
                close()
                moveTo(150.62f, 200f)
                lineTo(105.38f, 200f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 45.24f, 0f)
                close()
            }
        }.build()

        return _BellRingingFill!!
    }

@Suppress("ObjectPropertyName")
private var _BellRingingFill: ImageVector? = null
