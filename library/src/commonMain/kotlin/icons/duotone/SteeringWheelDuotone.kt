package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.SteeringWheelDuotone: ImageVector
    get() {
        if (_SteeringWheelDuotone != null) {
            return _SteeringWheelDuotone!!
        }
        _SteeringWheelDuotone = ImageVector.Builder(
            name = "Duotone.SteeringWheelDuotone",
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
                moveTo(222.4f, 145.55f)
                arcToRelative(128f, 128f, 0f, isMoreThanHalf = false, isPositiveArc = false, -188.8f, 0f)
                arcTo(96.6f, 96.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 37.46f, 160f)
                horizontalLineToRelative(53f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.49f, 5.2f)
                lineToRelative(21.86f, 58.45f)
                curveToRelative(2.7f, 0.23f, 5.44f, 0.35f, 8.2f, 0.35f)
                reflectiveCurveToRelative(5.46f, -0.12f, 8.15f, -0.34f)
                lineToRelative(21.9f, -58.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, -5.19f)
                horizontalLineToRelative(53f)
                arcTo(96.6f, 96.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 222.4f, 145.55f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 140f)
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
                moveTo(33.6f, 145.55f)
                arcToRelative(128f, 128f, 0f, isMoreThanHalf = false, isPositiveArc = true, 188.8f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(119.8f, 223.65f)
                lineTo(97.94f, 165.2f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.49f, -5.2f)
                horizontalLineToRelative(-53f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136.15f, 223.66f)
                lineToRelative(21.9f, -58.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, -5.19f)
                horizontalLineToRelative(53f)
            }
        }.build()

        return _SteeringWheelDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _SteeringWheelDuotone: ImageVector? = null
