package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.RacquetLight: ImageVector
    get() {
        if (_RacquetLight != null) {
            return _RacquetLight!!
        }
        _RacquetLight = ImageVector.Builder(
            name = "Light.RacquetLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(111.78f, 144.22f)
                arcToRelative(63.61f, 79.51f, 45f, isMoreThanHalf = true, isPositiveArc = false, 112.44f, -112.44f)
                arcToRelative(63.61f, 79.51f, 45f, isMoreThanHalf = true, isPositiveArc = false, -112.44f, 112.44f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(26.35f, 205.65f)
                lineTo(53.66f, 178.34f)
                arcTo(8f, 8f, 74.12f, isMoreThanHalf = false, isPositiveArc = true, 64.97f, 178.34f)
                lineTo(77.66f, 191.02f)
                arcTo(8f, 8f, 74.12f, isMoreThanHalf = false, isPositiveArc = true, 77.66f, 202.34f)
                lineTo(50.34f, 229.65f)
                arcTo(8f, 8f, 50.96f, isMoreThanHalf = false, isPositiveArc = true, 39.03f, 229.65f)
                lineTo(26.35f, 216.97f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 26.35f, 205.65f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(71.31f, 184.69f)
                lineTo(111.78f, 144.22f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 16.5f)
                lineTo(192f, 148.98f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 27.02f)
                lineTo(144f, 159.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(107.02f, 64f)
                lineTo(239.5f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96.5f, 112f)
                lineTo(228.98f, 112f)
            }
        }.build()

        return _RacquetLight!!
    }

@Suppress("ObjectPropertyName")
private var _RacquetLight: ImageVector? = null
