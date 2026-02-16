package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.RocketDuotone: ImageVector
    get() {
        if (_RocketDuotone != null) {
            return _RocketDuotone!!
        }
        _RocketDuotone = ImageVector.Builder(
            name = "Duotone.RocketDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(41.85f, 147.24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.66f, 6.86f)
                lineToRelative(12.36f, 55.63f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.81f, 4.51f)
                lineTo(94.81f, 192f)
                curveTo(76.7f, 161.43f, 71f, 134.25f, 72.16f, 110.91f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(183.84f, 110.91f)
                curveToRelative(1.21f, 23.34f, -4.54f, 50.52f, -22.65f, 81.09f)
                lineToRelative(29.45f, 22.24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.81f, -4.51f)
                lineToRelative(12.36f, -55.63f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.66f, -6.86f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 224f)
                lineTo(112f, 224f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 100f)
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
                moveTo(94.81f, 192f)
                curveTo(37.52f, 95.32f, 103.87f, 32.53f, 123.09f, 17.68f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.82f, 0f)
                curveTo(152.13f, 32.53f, 218.48f, 95.32f, 161.19f, 192f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(183.84f, 110.88f)
                lineToRelative(30.31f, 36.36f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.66f, 6.86f)
                lineToRelative(-12.36f, 55.63f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.81f, 4.51f)
                lineTo(161.19f, 192f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72.16f, 110.88f)
                lineTo(41.85f, 147.24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.66f, 6.86f)
                lineToRelative(12.36f, 55.63f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.81f, 4.51f)
                lineTo(94.81f, 192f)
            }
        }.build()

        return _RocketDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _RocketDuotone: ImageVector? = null
