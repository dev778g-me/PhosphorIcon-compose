package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ChampagneFill: ImageVector
    get() {
        if (_ChampagneFill != null) {
            return _ChampagneFill!!
        }
        _ChampagneFill = ImageVector.Builder(
            name = "Filled.ChampagneFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(149.91f, 13.53f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 142.3f, 8f)
                lineTo(97.71f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.61f, 5.53f)
                arcToRelative(451f, 451f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.21f, 59.7f)
                curveToRelative(-7.26f, 44.25f, -4.35f, 75.76f, 8.65f, 93.66f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112f, 183.42f)
                lineTo(112f, 232f)
                lineTo(96f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(128f, 232f)
                lineTo(128f, 183.42f)
                arcToRelative(39.94f, 39.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 27.46f, -16.53f)
                curveToRelative(13f, -17.9f, 15.92f, -49.41f, 8.66f, -93.66f)
                arcTo(451f, 451f, 0f, isMoreThanHalf = false, isPositiveArc = false, 149.91f, 13.53f)
                close()
                moveTo(93.8f, 64f)
                curveToRelative(3f, -15.58f, 6.73f, -29.81f, 9.79f, -40f)
                horizontalLineToRelative(32.83f)
                curveToRelative(3.06f, 10.19f, 6.77f, 24.42f, 9.8f, 40f)
                close()
                moveTo(232f, 52f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 52f)
                close()
                moveTo(184f, 20f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 20f)
                close()
                moveTo(208f, 100f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 100f)
                close()
            }
        }.build()

        return _ChampagneFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChampagneFill: ImageVector? = null
