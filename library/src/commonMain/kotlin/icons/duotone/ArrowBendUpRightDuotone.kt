package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.ArrowBendUpRightDuotone: ImageVector
    get() {
        if (_ArrowBendUpRightDuotone != null) {
            return _ArrowBendUpRightDuotone!!
        }
        _ArrowBendUpRightDuotone = ImageVector.Builder(
            name = "Duotone.ArrowBendUpRightDuotone",
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
                moveTo(176f, 152f)
                lineToRelative(48f, -48f)
                lineToRelative(-48f, -48f)
                lineToRelative(0f, 96f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 152f)
                lineToRelative(48f, -48f)
                lineToRelative(-48f, -48f)
                lineToRelative(0f, 96f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 200f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, -96f)
                horizontalLineToRelative(48f)
            }
        }.build()

        return _ArrowBendUpRightDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBendUpRightDuotone: ImageVector? = null
