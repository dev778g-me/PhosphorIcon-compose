package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TwitterLogoFill: ImageVector
    get() {
        if (_TwitterLogoFill != null) {
            return _TwitterLogoFill!!
        }
        _TwitterLogoFill = ImageVector.Builder(
            name = "Filled.TwitterLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(245.66f, 77.66f)
                lineToRelative(-29.9f, 29.9f)
                curveTo(209.72f, 177.58f, 150.67f, 232f, 80f, 232f)
                curveToRelative(-14.52f, 0f, -26.49f, -2.3f, -35.58f, -6.84f)
                curveToRelative(-7.33f, -3.67f, -10.33f, -7.6f, -11.08f, -8.72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.85f, -11.93f)
                curveToRelative(0.26f, -0.1f, 24.24f, -9.31f, 39.47f, -26.84f)
                arcToRelative(110.93f, 110.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -21.88f, -24.2f)
                curveToRelative(-12.4f, -18.41f, -26.28f, -50.39f, -22f, -98.18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.65f, -4.92f)
                curveToRelative(0.35f, 0.35f, 33.28f, 33.1f, 73.54f, 43.72f)
                verticalLineTo(88f)
                arcToRelative(47.87f, 47.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.36f, -34.3f)
                arcTo(46.87f, 46.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168.1f, 40f)
                arcToRelative(48.66f, 48.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 41.47f, 24f)
                horizontalLineTo(240f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 13.66f)
                close()
            }
        }.build()

        return _TwitterLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _TwitterLogoFill: ImageVector? = null
