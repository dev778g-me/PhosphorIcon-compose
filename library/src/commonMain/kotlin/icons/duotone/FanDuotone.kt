package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.FanDuotone: ImageVector
    get() {
        if (_FanDuotone != null) {
            return _FanDuotone!!
        }
        _FanDuotone = ImageVector.Builder(
            name = "Duotone.FanDuotone",
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
                moveTo(136.5f, 150.44f)
                arcTo(23.75f, 23.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 152f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -23.07f, -17.4f)
                horizontalLineToRelative(0f)
                lineTo(33f, 155.13f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = false, 103.49f, -4.68f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(104.31f, 124.14f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.52f, -19.42f)
                horizontalLineToRelative(0f)
                lineTo(152f, 32.17f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = false, -47.69f, 92f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(201f, 105.5f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -57.84f, 3.91f)
                horizontalLineToRelative(0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.06f, 35.26f)
                horizontalLineToRelative(0f)
                lineToRelative(53.74f, 52f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -91.2f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                moveToRelative(-24f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104.31f, 124.14f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, 47.69f, -92f)
                lineToRelative(-18.17f, 72.54f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136.5f, 150.45f)
                arcTo(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, 33f, 155.13f)
                lineToRelative(71.91f, -20.54f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(143.19f, 109.41f)
                arcTo(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, 199f, 196.7f)
                lineToRelative(-53.74f, -52f)
            }
        }.build()

        return _FanDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FanDuotone: ImageVector? = null
