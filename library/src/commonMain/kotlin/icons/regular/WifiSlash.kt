package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.WifiSlash: ImageVector
    get() {
        if (_WifiSlash != null) {
            return _WifiSlash!!
        }
        _WifiSlash = ImageVector.Builder(
            name = "Regular.WifiSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 204f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(71.6f, 66f)
                arcTo(163.53f, 163.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 93.19f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 93.19f)
                arcTo(163.31f, 163.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 56f)
                arcToRelative(165.48f, 165.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -21f, 1.33f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(107.78f, 105.76f)
                arcTo(115.46f, 115.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 129f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 129f)
                arcToRelative(115.57f, 115.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48.38f, -22.63f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(154.81f, 157.49f)
                arcTo(68.1f, 68.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 165f)
            }
        }.build()

        return _WifiSlash!!
    }

@Suppress("ObjectPropertyName")
private var _WifiSlash: ImageVector? = null
