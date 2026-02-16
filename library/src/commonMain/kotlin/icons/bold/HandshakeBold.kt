package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.HandshakeBold: ImageVector
    get() {
        if (_HandshakeBold != null) {
            return _HandshakeBold!!
        }
        _HandshakeBold = ImageVector.Builder(
            name = "Bold.HandshakeBold",
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
                moveTo(76.68f, 72.63f)
                lineToRelative(51.32f, -16.63f)
                lineToRelative(51.32f, 16.63f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(38.37f, 62.42f)
                lineTo(12.85f, 113.48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.57f, 10.73f)
                lineTo(44f, 138f)
                lineTo(76.68f, 72.63f)
                lineTo(49.11f, 58.85f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 38.37f, 62.42f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(212f, 138f)
                lineToRelative(27.58f, -13.79f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.57f, -10.73f)
                lineTo(217.63f, 62.42f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.74f, -3.57f)
                lineTo(179.32f, 72.63f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(177.36f, 72f)
                horizontalLineTo(144f)
                lineTo(98.34f, 116.29f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.38f, 12.42f)
                curveTo(117.23f, 139.9f, 141f, 139.13f, 160f, 120f)
                lineToRelative(36f, 34f)
                lineToRelative(16f, -16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(196f, 154f)
                lineToRelative(-38f, 38f)
                lineToRelative(-62f, -16f)
                lineToRelative(-52f, -38f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(106.93f, 216f)
                lineToRelative(-26.6f, -6.87f)
                lineToRelative(-24.33f, -17.77f)
            }
        }.build()

        return _HandshakeBold!!
    }

@Suppress("ObjectPropertyName")
private var _HandshakeBold: ImageVector? = null
