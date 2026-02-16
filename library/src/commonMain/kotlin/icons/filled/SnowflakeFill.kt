package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.SnowflakeFill: ImageVector
    get() {
        if (_SnowflakeFill != null) {
            return _SnowflakeFill!!
        }
        _SnowflakeFill = ImageVector.Builder(
            name = "Filled.SnowflakeFill",
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
                moveTo(170.37f, 143.22f)
                lineTo(189.31f, 136.46f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.38f, 15.08f)
                lineToRelative(-15.48f, 5.52f)
                lineToRelative(4.52f, 16.87f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, 9.8f)
                arcTo(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.73f, -5.93f)
                lineToRelative(-5.57f, -20.8f)
                lineTo(136f, 141.86f)
                verticalLineToRelative(30.83f)
                lineToRelative(13.66f, 13.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 11.32f)
                lineTo(128f, 187.31f)
                lineToRelative(-10.34f, 10.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineTo(120f, 172.69f)
                lineTo(120f, 141.86f)
                lineTo(93.3f, 157.27f)
                lineToRelative(-5.57f, 20.8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 184f)
                arcToRelative(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.07f, -0.27f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -9.8f)
                lineToRelative(4.52f, -16.87f)
                lineToRelative(-15.48f, -5.52f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.38f, -15.08f)
                lineToRelative(18.94f, 6.76f)
                lineTo(112f, 128f)
                lineTo(85.63f, 112.78f)
                lineToRelative(-18.94f, 6.76f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.69f, -15.54f)
                lineToRelative(15.48f, -5.52f)
                lineTo(72.27f, 82.07f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.46f, -4.14f)
                lineToRelative(5.57f, 20.8f)
                lineTo(120f, 114.14f)
                lineTo(120f, 83.31f)
                lineTo(106.34f, 69.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                lineTo(128f, 68.69f)
                lineToRelative(10.34f, -10.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                lineTo(136f, 83.31f)
                verticalLineToRelative(30.83f)
                lineToRelative(26.7f, -15.41f)
                lineToRelative(5.57f, -20.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.46f, 4.14f)
                lineToRelative(-4.52f, 16.87f)
                lineToRelative(15.48f, 5.52f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 120f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.69f, -0.46f)
                lineToRelative(-18.94f, -6.76f)
                lineTo(144f, 128f)
                close()
            }
        }.build()

        return _SnowflakeFill!!
    }

@Suppress("ObjectPropertyName")
private var _SnowflakeFill: ImageVector? = null
