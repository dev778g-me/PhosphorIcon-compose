package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.ConfettiBold: ImageVector
    get() {
        if (_ConfettiBold != null) {
            return _ConfettiBold!!
        }
        _ConfettiBold = ImageVector.Builder(
            name = "Bold.ConfettiBold",
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
                moveTo(40.49f, 205.52f)
                lineTo(93f, 61.14f)
                arcToRelative(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.84f, -2.85f)
                lineToRelative(91.88f, 91.88f)
                arcTo(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 194.86f, 163f)
                lineTo(50.48f, 215.51f)
                arcTo(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.49f, 205.52f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(140f, 16f)
                lineTo(140f, 40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(220f, 116f)
                lineTo(236f, 132f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 80f)
                lineTo(240f, 72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(78.09f, 102.09f)
                lineTo(153.91f, 177.91f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(101.11f, 197.11f)
                lineTo(58.89f, 154.89f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168.42f, 68f)
                curveToRelative(1.19f, -6.83f, 5.8f, -20f, 23.58f, -20f)
                curveToRelative(24f, 0f, 24f, -24f, 24f, -24f)
            }
        }.build()

        return _ConfettiBold!!
    }

@Suppress("ObjectPropertyName")
private var _ConfettiBold: ImageVector? = null
