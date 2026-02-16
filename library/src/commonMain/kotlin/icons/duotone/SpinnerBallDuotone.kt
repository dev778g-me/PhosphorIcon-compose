package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.SpinnerBallDuotone: ImageVector
    get() {
        if (_SpinnerBallDuotone != null) {
            return _SpinnerBallDuotone!!
        }
        _SpinnerBallDuotone = ImageVector.Builder(
            name = "Duotone.SpinnerBallDuotone",
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
                moveTo(78.6f, 45.67f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 128f)
                curveToRelative(0f, 0.54f, 0f, 1.08f, 0f, 1.61f)
                curveToRelative(39.27f, -29.85f, 67.64f, -15.73f, 96f, -1.61f)
                curveTo(126f, 96.38f, 124.09f, 64.75f, 78.6f, 45.67f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(81.4f, 212f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 94.6f, -0.81f)
                curveToRelative(0.47f, -0.27f, 0.94f, -0.53f, 1.4f, -0.81f)
                curveTo(131.91f, 191.25f, 130f, 159.62f, 128f, 128f)
                curveTo(101.59f, 145.5f, 75.18f, 163f, 81.4f, 212f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(224f, 126.39f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, -81.53f)
                lineToRelative(-1.4f, -0.81f)
                curveTo(180.82f, 93f, 154.41f, 110.5f, 128f, 128f)
                curveTo(156.36f, 142.12f, 184.73f, 156.24f, 224f, 126.39f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 129.61f)
                curveToRelative(78.55f, -59.69f, 113.45f, 56.47f, 192f, -3.22f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(177.4f, 210.33f)
                curveToRelative(-91f, -38.17f, -7.82f, -126.49f, -98.8f, -164.66f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(174.6f, 44.05f)
                curveTo(187f, 141.93f, 69f, 114.07f, 81.4f, 212f)
            }
        }.build()

        return _SpinnerBallDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _SpinnerBallDuotone: ImageVector? = null
