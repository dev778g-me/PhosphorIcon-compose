package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.PersonSimpleHikeBold: ImageVector
    get() {
        if (_PersonSimpleHikeBold != null) {
            return _PersonSimpleHikeBold!!
        }
        _PersonSimpleHikeBold = ImageVector.Builder(
            name = "Bold.PersonSimpleHikeBold",
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
                moveTo(152f, 48f)
                moveToRelative(-24f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 232f)
                lineToRelative(0f, -56f)
                lineToRelative(-42.46f, -30.33f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 232f)
                verticalLineTo(144f)
                curveToRelative(-40f, 0f, -38.06f, -24.33f, -56f, -39.91f)
                arcToRelative(32.47f, 32.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.47f, -4.4f)
                lineTo(72f, 232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(93.62f, 86.98f)
                lineToRelative(-25.62f, -10.98f)
                lineToRelative(-24f, 56f)
                lineToRelative(25.32f, 10.85f)
            }
        }.build()

        return _PersonSimpleHikeBold!!
    }

@Suppress("ObjectPropertyName")
private var _PersonSimpleHikeBold: ImageVector? = null
