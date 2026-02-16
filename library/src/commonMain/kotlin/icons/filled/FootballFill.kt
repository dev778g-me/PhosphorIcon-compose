package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FootballFill: ImageVector
    get() {
        if (_FootballFill != null) {
            return _FootballFill!!
        }
        _FootballFill = ImageVector.Builder(
            name = "Filled.FootballFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(229.06f, 53.89f)
                arcToRelative(32.92f, 32.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -26.95f, -26.95f)
                curveToRelative(-32.38f, -5.49f, -93.39f, -8f, -138.27f, 36.9f)
                reflectiveCurveToRelative(-42.39f, 105.9f, -36.9f, 138.27f)
                arcToRelative(32.92f, 32.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 27f, 26.95f)
                arcTo(206.58f, 206.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88.27f, 232f)
                curveToRelative(32.09f, 0f, 72.05f, -8f, 103.89f, -39.84f)
                curveTo(237.05f, 147.28f, 234.55f, 86.26f, 229.06f, 53.89f)
                close()
                moveTo(56.56f, 213.3f)
                arcTo(16.94f, 16.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 42.7f, 199.44f)
                arcToRelative(180.27f, 180.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.11f, -46.9f)
                lineToRelative(62.87f, 62.87f)
                arcTo(180.27f, 180.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56.56f, 213.3f)
                close()
                moveTo(165.64f, 101.67f)
                lineTo(151.3f, 116f)
                lineToRelative(6.34f, 6.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.31f, 11.3f)
                lineTo(140f, 127.31f)
                lineTo(127.31f, 140f)
                lineToRelative(6.34f, 6.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.3f, 11.31f)
                lineTo(116f, 151.3f)
                lineToRelative(-14.34f, 14.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.31f, -11.31f)
                lineTo(104.7f, 140f)
                lineToRelative(-6.34f, -6.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.31f, -11.3f)
                lineToRelative(6.34f, 6.34f)
                lineTo(128.69f, 116f)
                lineToRelative(-6.34f, -6.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.3f, -11.31f)
                lineTo(140f, 104.7f)
                lineToRelative(14.34f, -14.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.31f, 11.31f)
                close()
                moveTo(215.41f, 103.46f)
                lineTo(152.54f, 40.59f)
                curveToRelative(4.76f, -0.44f, 9.72f, -0.69f, 14.91f, -0.69f)
                arcToRelative(192f, 192f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 2.8f)
                arcTo(16.94f, 16.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 213.3f, 56.56f)
                arcTo(180.27f, 180.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 215.41f, 103.46f)
                close()
            }
        }.build()

        return _FootballFill!!
    }

@Suppress("ObjectPropertyName")
private var _FootballFill: ImageVector? = null
