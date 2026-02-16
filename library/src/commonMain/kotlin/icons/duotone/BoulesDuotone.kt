package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.BoulesDuotone: ImageVector
    get() {
        if (_BoulesDuotone != null) {
            return _BoulesDuotone!!
        }
        _BoulesDuotone = ImageVector.Builder(
            name = "Duotone.BoulesDuotone",
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
                moveTo(167.52f, 40.48f)
                lineTo(40.48f, 167.52f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(195.88f, 60.12f)
                lineTo(60.12f, 195.88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(215.52f, 88.48f)
                lineTo(88.48f, 215.52f)
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(167.52f, 40.48f)
                arcToRelative(96.47f, 96.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 48f)
                lineToRelative(-127f, 127f)
                arcToRelative(96.47f, 96.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, -48f)
                close()
            }
        }.build()

        return _BoulesDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BoulesDuotone: ImageVector? = null
