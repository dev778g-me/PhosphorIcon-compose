package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.PersonSimpleSkiBold: ImageVector
    get() {
        if (_PersonSimpleSkiBold != null) {
            return _PersonSimpleSkiBold!!
        }
        _PersonSimpleSkiBold = ImageVector.Builder(
            name = "Bold.PersonSimpleSkiBold",
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
                moveTo(176f, 60f)
                moveToRelative(-20f, 0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, 0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152.94f, 116.94f)
                lineTo(40f, 84f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 124f)
                lineToRelative(-40f, 0f)
                lineToRelative(-32f, -32f)
                lineToRelative(-13.68f, 13.68f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 201.6f)
                arcToRelative(61.94f, 61.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -51.69f, 7.92f)
                lineTo(24f, 164f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 140f)
                lineToRelative(56f, 16f)
                lineToRelative(-33.26f, 33.26f)
            }
        }.build()

        return _PersonSimpleSkiBold!!
    }

@Suppress("ObjectPropertyName")
private var _PersonSimpleSkiBold: ImageVector? = null
