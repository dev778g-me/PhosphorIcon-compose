package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.LinkBold: ImageVector
    get() {
        if (_LinkBold != null) {
            return _LinkBold!!
        }
        _LinkBold = ImageVector.Builder(
            name = "Bold.LinkBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(108.71f, 197.23f)
                lineToRelative(-5.11f, 5.11f)
                arcToRelative(46.63f, 46.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, -66f, -0.05f)
                horizontalLineToRelative(0f)
                arcToRelative(46.63f, 46.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.06f, -65.89f)
                lineTo(72.4f, 101.66f)
                arcToRelative(46.62f, 46.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 65.94f, 0f)
                horizontalLineToRelative(0f)
                arcTo(46.34f, 46.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 150.78f, 124f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(147.29f, 58.77f)
                lineToRelative(5.11f, -5.11f)
                arcToRelative(46.62f, 46.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 65.94f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(46.62f, 46.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 65.94f)
                lineTo(193.94f, 144f)
                lineTo(183.6f, 154.34f)
                arcToRelative(46.63f, 46.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, -66f, -0.05f)
                horizontalLineToRelative(0f)
                arcTo(46.46f, 46.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 105.22f, 132f)
            }
        }.build()

        return _LinkBold!!
    }

@Suppress("ObjectPropertyName")
private var _LinkBold: ImageVector? = null
