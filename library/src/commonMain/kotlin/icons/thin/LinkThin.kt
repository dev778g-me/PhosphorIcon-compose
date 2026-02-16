package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.LinkThin: ImageVector
    get() {
        if (_LinkThin != null) {
            return _LinkThin!!
        }
        _LinkThin = ImageVector.Builder(
            name = "Thin.LinkThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
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
                strokeLineWidth = 8f,
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

        return _LinkThin!!
    }

@Suppress("ObjectPropertyName")
private var _LinkThin: ImageVector? = null
