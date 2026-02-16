package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.FastForwardCircleDuotone: ImageVector
    get() {
        if (_FastForwardCircleDuotone != null) {
            return _FastForwardCircleDuotone!!
        }
        _FastForwardCircleDuotone = ImageVector.Builder(
            name = "Duotone.FastForwardCircleDuotone",
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
                moveTo(128f, 32f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, 96f, 96f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 32f)
                close()
                moveTo(80f, 164f)
                lineTo(80f, 92f)
                lineToRelative(48f, 36f)
                close()
                moveTo(144f, 164f)
                lineTo(144f, 92f)
                lineToRelative(48f, 36f)
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
                moveTo(144f, 92f)
                lineToRelative(0f, 72f)
                lineToRelative(48f, -36f)
                lineToRelative(-48f, -36f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 92f)
                lineToRelative(48f, 36f)
                lineToRelative(-48f, 36f)
                lineToRelative(0f, -72f)
                close()
            }
        }.build()

        return _FastForwardCircleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FastForwardCircleDuotone: ImageVector? = null
