package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HeartBreakFill: ImageVector
    get() {
        if (_HeartBreakFill != null) {
            return _HeartBreakFill!!
        }
        _HeartBreakFill = ImageVector.Builder(
            name = "Filled.HeartBreakFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(239.81f, 107.5f)
                curveToRelative(-5.19f, 67.42f, -103.7f, 121.23f, -108f, 123.54f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.58f, 0f)
                curveTo(119.8f, 228.67f, 16f, 172f, 16f, 102f)
                arcToRelative(62f, 62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96.47f, -51.55f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.61f, 6.17f)
                lineTo(99.72f, 70f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.31f)
                lineToRelative(32.53f, 32.53f)
                lineTo(111f, 135f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.31f, 11.31f)
                lineToRelative(26.88f, -26.87f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -11.31f)
                lineTo(116.7f, 75.63f)
                lineToRelative(17.47f, -17.47f)
                horizontalLineToRelative(0f)
                arcTo(61.63f, 61.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 178.41f, 40f)
                curveTo(214.73f, 40.23f, 242.59f, 71.29f, 239.81f, 107.5f)
                close()
            }
        }.build()

        return _HeartBreakFill!!
    }

@Suppress("ObjectPropertyName")
private var _HeartBreakFill: ImageVector? = null
