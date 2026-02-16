package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.TireBold: ImageVector
    get() {
        if (_TireBold != null) {
            return _TireBold!!
        }
        _TireBold = ImageVector.Builder(
            name = "Bold.TireBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(152f, 128f)
                arcToRelative(16f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 32f, 0f)
                arcToRelative(16f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -32f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 128f)
                arcToRelative(52f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, 104f, 0f)
                arcToRelative(52f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, -104f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 224f)
                horizontalLineTo(92f)
                curveToRelative(-28.72f, 0f, -52f, -43f, -52f, -96f)
                reflectiveCurveTo(63.28f, 32f, 92f, 32f)
                horizontalLineToRelative(72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40.38f, 116.3f)
                lineToRelative(39.62f, -28.3f)
                lineToRelative(32.77f, 23.41f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(46.85f, 175.68f)
                lineToRelative(33.15f, -23.68f)
                lineToRelative(40.65f, 29.03f)
            }
        }.build()

        return _TireBold!!
    }

@Suppress("ObjectPropertyName")
private var _TireBold: ImageVector? = null
