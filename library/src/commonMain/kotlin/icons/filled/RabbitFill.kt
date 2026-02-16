package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.RabbitFill: ImageVector
    get() {
        if (_RabbitFill != null) {
            return _RabbitFill!!
        }
        _RabbitFill = ImageVector.Builder(
            name = "Filled.RabbitFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(199.28f, 149.8f)
                arcTo(71.58f, 71.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 193f, 129f)
                curveToRelative(19f, -37.94f, 30.45f, -88.28f, 17.34f, -110f)
                arcTo(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 190.94f, 8f)
                curveToRelative(-14.12f, 0f, -26f, 11.89f, -36.44f, 36.36f)
                curveToRelative(-6.22f, 14.62f, -10.85f, 31.32f, -14f, 44.74f)
                arcToRelative(71.8f, 71.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -25f, 0f)
                curveToRelative(-3.13f, -13.42f, -7.76f, -30.12f, -14f, -44.74f)
                curveTo(91.1f, 19.89f, 79.18f, 8f, 65.06f, 8f)
                arcTo(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 45.64f, 19.08f)
                curveTo(32.53f, 40.76f, 44f, 91.1f, 63f, 129f)
                arcToRelative(71.58f, 71.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.26f, 20.76f)
                arcTo(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 225.52f)
                lineToRelative(-21.12f, -19.37f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10.24f, -12.3f)
                lineTo(128f, 202.9f)
                lineToRelative(10.88f, -9.05f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.24f, 12.3f)
                lineTo(128f, 225.52f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = false, 71.28f, -75.72f)
                close()
                moveTo(73.28f, 113.27f)
                arcTo(218.45f, 218.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 58.4f, 67.08f)
                curveToRelative(-3.49f, -18.13f, -3.15f, -33f, 0.93f, -39.72f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 65.06f, 24f)
                curveToRelative(6.61f, 0f, 14.52f, 9.7f, 21.72f, 26.62f)
                curveToRelative(5.93f, 13.94f, 10.35f, 30.12f, 13.33f, 43f)
                arcToRelative(71.72f, 71.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -26.88f, 19.64f)
                close()
                moveTo(100f, 176f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100f, 176f)
                close()
                moveTo(156f, 176f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 176f)
                close()
                moveTo(176.55f, 106.83f)
                arcToRelative(71.89f, 71.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -20.66f, -13.2f)
                curveToRelative(3f, -12.89f, 7.4f, -29.07f, 13.33f, -43f)
                curveTo(176.42f, 33.7f, 184.33f, 24f, 190.94f, 24f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.73f, 3.36f)
                curveToRelative(4.08f, 6.74f, 4.42f, 21.59f, 0.93f, 39.72f)
                arcToRelative(218.45f, 218.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.83f, 46.19f)
                arcTo(72.6f, 72.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176.55f, 106.83f)
                close()
            }
        }.build()

        return _RabbitFill!!
    }

@Suppress("ObjectPropertyName")
private var _RabbitFill: ImageVector? = null
