package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.LinkDuotone: ImageVector
    get() {
        if (_LinkDuotone != null) {
            return _LinkDuotone!!
        }
        _LinkDuotone = ImageVector.Builder(
            name = "Duotone.LinkDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(218.34f, 53.66f)
                horizontalLineToRelative(0f)
                arcToRelative(46.62f, 46.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, -65.94f, 0f)
                lineTo(117.66f, 88.4f)
                curveToRelative(-0.33f, 0.33f, -0.64f, 0.66f, -1f, 1f)
                arcTo(46.6f, 46.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72.4f, 101.66f)
                lineTo(37.66f, 136.4f)
                arcToRelative(46.63f, 46.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.06f, 65.89f)
                horizontalLineToRelative(0f)
                arcToRelative(46.63f, 46.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 66f, 0.05f)
                lineToRelative(34.74f, -34.74f)
                curveToRelative(0.33f, -0.33f, 0.64f, -0.66f, 0.95f, -1f)
                arcToRelative(46.58f, 46.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 44.31f, -12.26f)
                lineToRelative(34.74f, -34.74f)
                arcTo(46.62f, 46.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 218.34f, 53.66f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(141.38f, 64.68f)
                lineToRelative(11f, -11f)
                arcToRelative(46.62f, 46.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 65.94f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(46.62f, 46.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 65.94f)
                lineTo(193.94f, 144f)
                lineTo(183.6f, 154.34f)
                arcToRelative(46.63f, 46.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, -66f, -0.05f)
                horizontalLineToRelative(0f)
                arcTo(46.48f, 46.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 120.06f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(114.62f, 191.32f)
                lineToRelative(-11f, 11f)
                arcToRelative(46.63f, 46.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, -66f, -0.05f)
                horizontalLineToRelative(0f)
                arcToRelative(46.63f, 46.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.06f, -65.89f)
                lineTo(72.4f, 101.66f)
                arcToRelative(46.62f, 46.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 65.94f, 0f)
                horizontalLineToRelative(0f)
                arcTo(46.45f, 46.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 135.94f)
            }
        }.build()

        return _LinkDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _LinkDuotone: ImageVector? = null
