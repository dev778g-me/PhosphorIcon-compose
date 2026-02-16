package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.ReadCvLogoBold: ImageVector
    get() {
        if (_ReadCvLogoBold != null) {
            return _ReadCvLogoBold!!
        }
        _ReadCvLogoBold = ImageVector.Builder(
            name = "Bold.ReadCvLogoBold",
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
                moveTo(79.19f, 24.14f)
                lineTo(209.45f, 47.16f)
                arcTo(8f, 8f, 54.83f, isMoreThanHalf = false, isPositiveArc = true, 215.93f, 56.43f)
                lineTo(186.08f, 225.4f)
                arcTo(8f, 8f, 122.04f, isMoreThanHalf = false, isPositiveArc = true, 176.81f, 231.89f)
                lineTo(46.55f, 208.87f)
                arcTo(8f, 8f, 52.97f, isMoreThanHalf = false, isPositiveArc = true, 40.07f, 199.6f)
                lineTo(69.92f, 30.63f)
                arcTo(8f, 8f, 52.97f, isMoreThanHalf = false, isPositiveArc = true, 79.19f, 24.14f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(103.71f, 69.08f)
                lineToRelative(24.29f, 4.29f)
                lineToRelative(42.94f, 7.59f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96.78f, 108.48f)
                lineTo(164f, 120.35f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(89.84f, 147.87f)
                lineTo(123.46f, 153.81f)
            }
        }.build()

        return _ReadCvLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _ReadCvLogoBold: ImageVector? = null
