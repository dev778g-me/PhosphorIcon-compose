package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.WifiSlashBold: ImageVector
    get() {
        if (_WifiSlashBold != null) {
            return _WifiSlashBold!!
        }
        _WifiSlashBold = ImageVector.Builder(
            name = "Bold.WifiSlashBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 204f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(71.6f, 66f)
                arcTo(163.53f, 163.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 93.19f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(107.78f, 105.76f)
                arcTo(115.46f, 115.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 129f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(154.81f, 157.49f)
                arcTo(68.1f, 68.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 165f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 93.19f)
                arcTo(163.31f, 163.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 56f)
                quadToRelative(-5.58f, 0f, -11.06f, 0.37f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 129f)
                arcToRelative(115.84f, 115.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -34f, -18.66f)
            }
        }.build()

        return _WifiSlashBold!!
    }

@Suppress("ObjectPropertyName")
private var _WifiSlashBold: ImageVector? = null
